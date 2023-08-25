package Strategies;

import Models.Ticket;

public interface ParkingFeeCalculationStrategy {
    public double calculateFee(Ticket ticket);
}
