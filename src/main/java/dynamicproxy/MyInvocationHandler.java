package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author �˷�
 * @date 2018/1/21 ����10:40
 */
public class MyInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        switch (methodName) {
            case "sing":
                System.out.println(args[0]);
                System.out.println("�Ҳ��ᳪ" + args[0] + "��ֻ�ᳪǧ��֮��");
                return null;

            case "sign":
                System.out.println("���ƴ�Ѷ��ǩԼ");
            case "work":
                System.out.println("����һ������Ա");
            default:
                break;
        }
        return new Object();

    }
}
