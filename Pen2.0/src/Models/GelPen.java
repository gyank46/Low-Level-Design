package Models;

import Interfaces.RefillStrategy;
import Interfaces.Refillable;
import Interfaces.WritingStrategy;
import Strategies.StrokeWritingStrategy;

public class GelPen extends Pen implements Refillable {
    private RefillStrategy refillStrategy;
    public GelPen(Body body, Nib nib, Ink ink, RefillStrategy refillStrategy) {
        super(body, nib, ink, new StrokeWritingStrategy());
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
