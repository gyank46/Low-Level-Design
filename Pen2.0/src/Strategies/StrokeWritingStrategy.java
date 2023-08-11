package Strategies;

import Interfaces.WritingStrategy;

public class StrokeWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("Stroke writing strategy.");
    }
}
