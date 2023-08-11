package Models;

import Strategies.ReplaceInkRefillingStrategy;
import Strategies.SmoothWritingStrategy;

public class PenFactory {

    public static Pen getPen(String penType){
        if(penType == PenType.BALLPOINT.toString())
            return new BallPointPen(new Body(),new Nib(),new Ink());
        if(penType == PenType.GEL.toString())
            return new GelPen(new Body(),new Nib(),new Ink());
        if(penType == PenType.MARKER.toString())
            return new Marker(new Body(),new Nib(),new Ink());
        throw new IllegalArgumentException("Unknown pen type: " + penType);

    }
}
