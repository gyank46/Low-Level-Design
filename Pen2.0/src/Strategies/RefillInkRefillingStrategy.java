package Strategies;

import Interfaces.RefillStrategy;
import Models.Pen;

public class RefillInkRefillingStrategy implements RefillStrategy {
    @Override
    public void refill(Pen pen) {
        System.out.println("Refilling by refilling the ink");
    }
}
