import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<String> bulletSize = Arrays.asList("5.6","9","7.6","4.75","12");
        List<FlyingBullet> bullets = new ArrayList<FlyingBullet>();

        for(String size:bulletSize){
            for(int i=0;i<10;i++){
                FlyingBullet temp = new FlyingBullet();
                temp.bullet = BulletFactory.getBullet(size);
                temp.direction = "Right";
                temp.speed = "12";
                temp.firedBy = "Gyani";
                temp.xCoordinate = 0;
                temp.yCoordinate = 22;
                bullets.add(temp);
            }
        }
        for(FlyingBullet bullet:bullets){
            System.out.println(bullet.bullet.size);
        }

    }
}
