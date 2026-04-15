package tema08.ex09;

public class main {
    public static void main(String[] args) {
        User user = new User("Elena", "123456");
        LoginService loginService = new LoginService();

        loginService.login(user);
    }
}
