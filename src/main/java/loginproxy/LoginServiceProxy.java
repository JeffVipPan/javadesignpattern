package loginproxy;

/**
 * @author ≈À∑Â
 * @date 26/02/2018 9:38 PM
 */
public class LoginServiceProxy implements LoginService {

    LoginService loginService;

    public LoginServiceProxy(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void login(String userId) {
        if (isBlockUser(userId)) {
            System.out.println("Ω˚÷π∑√Œ ");
        } else {
            loginService.login(userId);
        }
    }


    private boolean isBlockUser(String userId) {
        if ("user1".equals(userId)) {
            return true;
        } else {
            return false;
        }
    }
}
