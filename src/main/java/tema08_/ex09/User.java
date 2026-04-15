package tema08_.ex09;

//Exercițiul 9 – Encapsulare în test
//Creează:
//- User → private username, password + getter
//- LoginService → metodă login(User user)

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
