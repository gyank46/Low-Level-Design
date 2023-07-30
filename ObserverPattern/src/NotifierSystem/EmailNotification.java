package NotifierSystem;

public class EmailNotification implements Observer{
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending Email to Observer:"+ user.EmailId);
    }
}
