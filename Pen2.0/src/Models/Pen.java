package Models;

import Interfaces.Writable;
import Interfaces.WritingStrategy;

public abstract class Pen implements Writable {
    private Body body;
    private Nib nib;
    private Ink ink;

    private WritingStrategy writingStrategy;

    public Pen(Body body, Nib nib, Ink ink,WritingStrategy writingStrategy) {
        this.body = body;
        this.nib = nib;
        this.ink = ink;
        this.writingStrategy = writingStrategy;
    }

    @Override
    public void write() {
        writingStrategy.write();
    }

    public void setWritingStrategy(WritingStrategy writingStrategy){
        this.writingStrategy = writingStrategy;
    }
}
