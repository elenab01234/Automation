package tema08.ex06;

//Exercițiul 6 – Override + Encapsulare
//Creează:
//- Notification → metodă send()
//- EmailNotification → private emailAddress + getter/setter + override send()

public class Notification {
    public void send(String notification){
        System.out.println(notification);
    }
}
