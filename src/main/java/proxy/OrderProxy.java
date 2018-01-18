package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author �˷�
 * @date 2018/1/18 ����6:31
 */
public class OrderProxy implements InvocationHandler {

    public static final String METHOD_PREFIX = "test";

    private Object target;

    public OrderProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith(METHOD_PREFIX)) {
            System.out.println("�ָ���");

        }

        return method.invoke(target, args);
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }

}
