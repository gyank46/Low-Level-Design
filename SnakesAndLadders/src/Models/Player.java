package Models;

public class Player {
//    private Models.User user;
    private String name;
    private String emailId;
    private String phoneNumber;
    private int currPos = -1;

    public Player(String name, String emailId, String phoneNumber) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public void setCurrPos(int n){
        currPos = n;
    }

    public int getCurrPos(){
        return this.currPos;
    }

    public String getUserName(){
        return this.name;
    }
}
