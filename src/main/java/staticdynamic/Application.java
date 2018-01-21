package staticdynamic;

import java.lang.reflect.Proxy;

/**
 * @author 潘峰
 * @date 2018/1/20 下午7:48
 */
public class Application {
    public void proxy() {
        // 2. 然后在需要使用Hello的时候，通过JDK动态代理获取Hello的代理对象。
        Hello hello = (Hello) Proxy.newProxyInstance(
                // 1. 类加载器
                getClass().getClassLoader(),
                // 2. 代理需要实现的接口，可以有多个
                new Class<?>[]{Hello.class},
                // 3. 方法调用的实际处理者
                new LogInvocationHandler(new HelloImpl()));
        hello.sayHello();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.proxy();

    }
}
