package Models;

import Interfaces.RefillStrategy;
import Interfaces.Refillable;
import Interfaces.WritingStrategy;
import Strategies.RefillInkRefillingStrategy;
import Strategies.StrokeWritingStrategy;

public class GelPen extends Pen{
    public GelPen(Body body, Nib nib, Ink ink) {
        super(body, nib, ink, true,new StrokeWritingStrategy(), new RefillInkRefillingStrategy());
    }
}
