package github.dynamicProxy.socket;


import io.netty.util.concurrent.BlockingOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author nilzxq
 * @Date 2020-08-04 14:34
 */
public class HelloServer {
    private static final Logger logger= LoggerFactory.getLogger(HelloServer.class);
    public void start(int port){
        //1.创建ServerSocket 对象并且绑定一个端口
        try(ServerSocket server=new ServerSocket(port);) {
            Socket socket;
            //2.通过accept()方法监听客户端请求
            while((socket=server.accept())!=null){
                logger.info("client connected");

                try (ObjectInputStream objectInputStream=new ObjectInputStream(socket.getInputStream());
                     ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());){
                    //3.通过输入流读取客户端发送的请求消息
                    Message message=(Message)objectInputStream.readObject();
                    logger.info("server receive message:"+message.getContent());
                    message.setContent("new content");
                    //4.通过输出流向客户端发送响应消息
                    objectOutputStream.writeObject(message);
                    objectOutputStream.flush();
                } catch (IOException | ClassNotFoundException e) {
                    logger.error("occur exception:",e);
                }

            }
        } catch (IOException e) {
            logger.error("occur IOException:",e);
        }
    }

    public static void main(String[] args) {
        HelloServer helloServer=new HelloServer();
        helloServer.start(6666);
    }
}
