package Models;

import Interfaces.RefillStrategy;
import Interfaces.Refillable;
import Strategies.SmoothWritingStrategy;

public class BallPointPen extends Pen implements Refillable {

    private RefillStrategy refillStrategy;
    public BallPointPen(Body body, Nib nib, Ink ink,RefillStrategy refillStrategy) {
        super(body, nib, ink,new SmoothWritingStrategy());
        this.refillStrategy = refillStrategy;
    }

    @Override
    public void refill(Pen pen) {
        refillStrategy.refill(pen);
    }

    public void setRefillStrategy(RefillStrategy refillStrategy){
        this.refillStrategy = refillStrategy;
    }

}
