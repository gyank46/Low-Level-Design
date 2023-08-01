package Alerting;

public class Client {
    public static void main(String[] args) {
        User user = new User("Gyan","7002614683","sittuk46@gmail.com","abcdefghi");
        Notify notify = new AppAlert(new EmailAlert(new TextAlert()));
        notify.sendMessage(user,"Hello there!");

    }
}
