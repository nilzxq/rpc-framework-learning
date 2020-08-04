package github.dynamicProxy.jdkDynamicProxy;

/**
 * @Author nilzxq
 * @Date 2020-08-04 16:29
 */
public class SmsServiceImpl implements SmsService {

    @Override
    public String send(String message) {
        System.out.print("send message: "+message);
        return message;
    }
}
