package Alerting;

public class AppAlert implements Notify{
    public Notify notify;

    public AppAlert(Notify notify){
        this.notify = notify;
    }
    @Override
    public void sendMessage(User user, String message) {
        sendAppAlert(user, message);
        notify.sendMessage(user, message);
    }

    public void sendAppAlert(User user, String message){
        System.out.println("Sending app alert to: "+user.AppKey+ " with content "+message);
    }
}
