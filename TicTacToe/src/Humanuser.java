public class Humanuser extends User{
    String name;
    String phoneNumber;
    String emailId;

    public Humanuser(String name, String phoneNumber, String emailId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    @Override
    public Cell makeMove(Board board) {
        return null;
    }
}
