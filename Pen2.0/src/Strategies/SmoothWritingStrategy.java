package Strategies;

import Interfaces.WritingStrategy;

public class SmoothWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("writing smoothly.");
    }
}
