package tema08.ex04;

public class AdminAccount extends Account{
    public void deleteUser(String toDeleteUsername){
        System.out.println("Admin " + getUsername() + " will delete user " + toDeleteUsername);
    }

}
