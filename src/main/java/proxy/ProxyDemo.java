package proxy;

/**
 * @author �˷�
 * @date 2018/1/18 ����6:40
 */
public class ProxyDemo {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        OrderProxy orderProxy = new OrderProxy(orderService);
        orderService = (OrderService) orderProxy.getProxy();
        orderService.test1();
        orderService.test2();

    }
}
