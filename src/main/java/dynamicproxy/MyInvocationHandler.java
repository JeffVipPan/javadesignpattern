package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 潘峰
 * @date 2018/1/21 下午10:40
 */
public class MyInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        switch (methodName) {
            case "sing":
                System.out.println(args[0]);
                System.out.println("我不会唱" + args[0] + "我只会唱千里之外");
                return null;

            case "sign":
                System.out.println("跟科大讯飞签约");
            case "work":
                System.out.println("我是一名程序员");
            default:
                break;
        }
        return new Object();

    }
}
