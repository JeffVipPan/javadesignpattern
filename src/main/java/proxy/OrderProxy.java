package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ÅË·å
 * @date 2018/1/18 ÏÂÎç6:31
 */
public class OrderProxy implements InvocationHandler {

    public static final String METHOD_PREFIX = "test";

    private Object target;

    public OrderProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith(METHOD_PREFIX)) {
            System.out.println("·Ö¸ô·û");

        }

        return method.invoke(target, args);
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }

}
