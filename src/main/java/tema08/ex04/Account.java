package tema08.ex04;

//Exercițiul 4 – Encapsulare + Moștenire
//Creează:
//- Account → private username + getter/setter + metodă login()
//- AdminAccount extinde Account → metodă deleteUser()

public class Account {
    private String username;

    public void setUsername(String username){
        this.username=username;
    }

    public String getUsername(){
        return username;
    }

    public void login(){
        System.out.println("Logging in " + username);
    }
}
