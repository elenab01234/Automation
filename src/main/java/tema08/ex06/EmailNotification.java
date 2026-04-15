package tema08.ex06;

public class EmailNotification extends Notification {
    private String emailAddress;

    public void setEmail(String emailAddress){
        this.emailAddress=emailAddress;
    }

    public String getEmail(){
        return emailAddress;
    }

    public void send(String notificationEmail){
        System.out.println(notificationEmail + " is sent to "+getEmail());
                ;
    }
}
