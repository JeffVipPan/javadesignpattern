package staticdynamic;

/**
 * @author 潘峰
 * @date 2018/1/20 下午7:32
 */
public class StaicHelloImpl implements Hello {

    private Hello hello = new HelloImpl();

    public void sayHello() {
        System.out.println("首先执行StaticHelloImpl");
        hello.sayHello();
    }
}
