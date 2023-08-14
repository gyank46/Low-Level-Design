public class User {
    private String name;
    private String emailId;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(String name, String emailId, String phoneNumber) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }
}
