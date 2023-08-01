package Alerting;

public class EmailAlert implements Notify{
    public Notify notify;
    @Override
    public void sendMessage(User user, String message) {
        sendEmail(user,message);
        notify.sendMessage(user, message);
    }

    public EmailAlert(Notify notify){
        this.notify = notify;
    }

    public void sendEmail(User user, String message){
        System.out.println("Sending mail to: "+user.EmailId+" with content: "+message);
    }
}
