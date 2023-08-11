package Models;

import Interfaces.RefillStrategy;
import Interfaces.Refillable;
import Interfaces.Writable;
import Interfaces.WritingStrategy;

public abstract class Pen implements Writable, Refillable {
    private Body body;
    private Nib nib;
    private Ink ink;
    private boolean isRefillable;

    private WritingStrategy writingStrategy;
    private RefillStrategy refillStrategy;

    public Pen(Body body, Nib nib, Ink ink,boolean isRefillable,WritingStrategy writingStrategy,RefillStrategy refillStrategy) {
        this.body = body;
        this.nib = nib;
        this.ink = ink;
        this.isRefillable = isRefillable;
        this.writingStrategy = writingStrategy;
        this.refillStrategy = refillStrategy;
    }

    public Pen(Body body, Nib nib, Ink ink,boolean isRefillable,WritingStrategy writingStrategy) {
        this.body = body;
        this.nib = nib;
        this.ink = ink;
        this.writingStrategy = writingStrategy;
    }

    @Override
    public void write() {
        writingStrategy.write();
    }

    @Override
    public void refill(Pen pen){
        if(isRefillable())
            refillStrategy.refill(pen);
    }

    public boolean isRefillable() {
        return this.isRefillable;
    }

    public void setWritingStrategy(WritingStrategy writingStrategy){
        this.writingStrategy = writingStrategy;
    }

    public void setRefillStrategy(RefillStrategy refillStrategy){
        this.refillStrategy = refillStrategy;
    }
}
