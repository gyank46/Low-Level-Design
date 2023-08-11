package Strategies;

import Interfaces.WritingStrategy;

public class MarkerWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("Writing by Marker Writing Strategy.");
    }
}
