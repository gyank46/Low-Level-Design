import Models.*;
import Strategies.RefillInkRefillingStrategy;
import Strategies.ReplaceInkRefillingStrategy;
import Strategies.SmoothWritingStrategy;
import Strategies.StrokeWritingStrategy;

public class Client {

    public static void main(String[] args) {
        BallPointPen ballPointPen = new BallPointPen(new Body(),new Nib(),new Ink(),new ReplaceInkRefillingStrategy());
        ballPointPen.write();
        ballPointPen.refill(ballPointPen);
        ballPointPen.setRefillStrategy(new RefillInkRefillingStrategy());
        ballPointPen.setWritingStrategy(new StrokeWritingStrategy());
        ballPointPen.write();
        ballPointPen.refill(ballPointPen);

        GelPen gelPen = new GelPen(new Body(),new Nib(),new Ink(),new RefillInkRefillingStrategy());
        gelPen.write();
        gelPen.refill(gelPen);
        gelPen.setRefillStrategy(new ReplaceInkRefillingStrategy());
        gelPen.setWritingStrategy(new SmoothWritingStrategy());
        gelPen.write();
        gelPen.refill(gelPen);

        Marker marker = new Marker(new Body(),new Nib(),new Ink());
        marker.write();
        marker.setWritingStrategy(new SmoothWritingStrategy());
        marker.write();


    }
}
