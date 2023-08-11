package Models;

import Interfaces.RefillStrategy;
import Interfaces.Refillable;
import Strategies.ReplaceInkRefillingStrategy;
import Strategies.SmoothWritingStrategy;

public class BallPointPen extends Pen {

    public BallPointPen(Body body, Nib nib, Ink ink) {
        super(body, nib, ink,true,new SmoothWritingStrategy(),new ReplaceInkRefillingStrategy());
    }


}
