package Alerting;

public class TextAlert implements Notify{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Sending Text message: "+message + " to: "+user.MobileNumber);
    }
}
