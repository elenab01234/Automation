package tema08.ex06;

public class Main {
    public static void main(String[] args){
    Notification notification= new Notification();
    EmailNotification emailNotification=new EmailNotification();

    notification.send("Hello");
    emailNotification.setEmail("hello@gmail.com");
    emailNotification.send("Hello by email");
    }
}
