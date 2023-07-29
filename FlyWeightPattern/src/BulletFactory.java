import java.util.HashMap;

public class BulletFactory {

    public static HashMap<String,Bullet> bulletSizeHashMap = new HashMap<>();

    public static Bullet getBullet(String size){
        if(bulletSizeHashMap.get(size)!=null)
            return bulletSizeHashMap.get(size);
        Bullet bullet = new Bullet();
        bullet.damage = 25;
        bullet.size = size;
        bullet.image = "Image of "+size;
        bullet.type = "size of "+size;
        bulletSizeHashMap.put(size,bullet);
        return bullet;
    }
}
