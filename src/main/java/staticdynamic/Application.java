package staticdynamic;

import java.lang.reflect.Proxy;

/**
 * @author �˷�
 * @date 2018/1/20 ����7:48
 */
public class Application {
    public void proxy() {
        // 2. Ȼ������Ҫʹ��Hello��ʱ��ͨ��JDK��̬�����ȡHello�Ĵ������
        Hello hello = (Hello) Proxy.newProxyInstance(
                // 1. �������
                getClass().getClassLoader(),
                // 2. ������Ҫʵ�ֵĽӿڣ������ж��
                new Class<?>[]{Hello.class},
                // 3. �������õ�ʵ�ʴ�����
                new LogInvocationHandler(new HelloImpl()));
        hello.sayHello();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.proxy();

    }
}
