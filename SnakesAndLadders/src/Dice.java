import java.util.Random;

public class Dice {
    private int faceCount;

    public int getFaceCount() {
        return faceCount;
    }

    public void setFaceCount(int faceCount) {
        this.faceCount = faceCount;
    }

    public Dice(int faceCount){
        this.faceCount = faceCount;
    }
    public int roll(){
        Random random = new Random();
        return random.nextInt(1,faceCount);
    }
}
