package staticdynamic;

/**
 * @author �˷�
 * @date 2018/1/20 ����7:32
 */
public class StaicHelloImpl implements Hello {

    private Hello hello = new HelloImpl();

    public void sayHello() {
        System.out.println("����ִ��StaticHelloImpl");
        hello.sayHello();
    }
}
