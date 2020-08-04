package github.dynamicProxy.cglibDynamicProxy;

/**
 * @Author nilzxq
 * @Date 2020-08-04 16:48
 */
public class AliSmsService {
    public String send(String message){
        System.out.println("send message: "+message);
        return message;
    }
}
