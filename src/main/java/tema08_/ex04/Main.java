package tema08_.ex04;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        AdminAccount adminAccount = new AdminAccount();

        account.setUsername("Elena");
        account.login();
        adminAccount.setUsername("Maria");
        adminAccount.login();
        adminAccount.deleteUser("Elena");

    }
}
