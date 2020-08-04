package github.dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * @Author nilzxq
 * @Date 2020-08-04 16:35
 */
public class JDKProxyFactory {
    /**
     * `getProxy()` ：主要通过`Proxy.newProxyInstance（）`方法获取某个类的代理对象
     * @param target
     * @return
     */
    public static Object getProxy(Object target){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//目标类的类加载
                target.getClass().getInterfaces(),//代理需要实现的接口，可指定多个
                new DebugInvocationHandler(target)//代理对象对应的自定义InvocationHandler
        );
    }
}
