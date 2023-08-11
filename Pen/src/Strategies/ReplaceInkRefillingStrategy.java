package Strategies;

import Interfaces.RefillStrategy;
import Models.Pen;

public class ReplaceInkRefillingStrategy implements RefillStrategy {
    @Override
    public void refill(Pen pen) {
        System.out.println("refilling by replacing ink");
    }
}
