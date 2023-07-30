package NotifierSystem;

import org.w3c.dom.Text;

public class Client {
    public static void main(String[] args) {
        User gyan = new User("Gyan","Sittuk46@gmail.com","7002614683");
        UserService userService = new UserService();
        EmailNotification emailNotification = new EmailNotification();
        TextNotification textNotification = new TextNotification();
        userService.addObserver(emailNotification);
        userService.addObserver(textNotification);
        userService.signInUser(gyan);
        userService.removeObserver(textNotification);
        userService.signOut(gyan);
    }



}
