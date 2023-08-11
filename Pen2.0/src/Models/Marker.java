package Models;

import Interfaces.WritingStrategy;
import Strategies.MarkerWritingStrategy;

public class Marker extends Pen{
    public Marker(Body body, Nib nib, Ink ink) {
        super(body, nib, ink, new MarkerWritingStrategy());
    }
}
