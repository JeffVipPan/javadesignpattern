package dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author ≈À∑Â
 * @date 2018/1/21 œ¬ŒÁ10:39
 */
public class App {

    public static void main(String[] args) {
        Class[] interfaces = new Class[]{Singer.class, Person.class};
        Object proxyInstance = Proxy.newProxyInstance(App.class.getClassLoader(), interfaces, new MyInvocationHandler());
        Singer singer = (Singer) proxyInstance;
        singer.sign();
        singer.sing("∆ﬂ¿Ôœ„");
        singer.work();

        System.out.println("----------------");

        Person person = (Person) proxyInstance;
        person.live();
    }

}
