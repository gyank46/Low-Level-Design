package Alerting;

public class User {
    public String Name;
    public String MobileNumber;

    public User(String name, String mobileNumber, String emailId, String appKey) {
        Name = name;
        MobileNumber = mobileNumber;
        EmailId = emailId;
        AppKey = appKey;
    }

    public String EmailId;
    public String AppKey;
}
