package github.dynamicProxy.jdkDynamicProxy;

/**
 * @Author nilzxq
 * @Date 2020-08-04 16:39
 */
public class Main {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsService smsServiceImplProxy = (SmsService) JDKProxyFactory.getProxy(smsService);
        smsServiceImplProxy.send("java");
    }
}
