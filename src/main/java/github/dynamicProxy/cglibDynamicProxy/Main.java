package github.dynamicProxy.cglibDynamicProxy;

/**
 * @Author nilzxq
 * @Date 2020-08-04 16:58
 */
public class Main {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}
