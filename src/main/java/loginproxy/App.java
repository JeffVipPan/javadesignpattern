package loginproxy;

/**
 * @author ек╥Е
 * @date 26/02/2018 9:42 PM
 */
public class App {

    public static void main(String[] args) {
        LoginService loginService = new LoginServiceImpl();
        LoginService loginService1 = new LoginServiceProxy(loginService);
        loginService1.login("user2");
        loginService1.login("user1");
    }
}
