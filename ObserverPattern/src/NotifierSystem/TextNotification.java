package NotifierSystem;

public class TextNotification implements Observer{
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending Text message to Observer: "+user.MobileNumber);
    }
}
