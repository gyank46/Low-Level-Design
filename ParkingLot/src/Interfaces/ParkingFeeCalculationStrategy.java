package Interfaces;

import Models.Ticket;

public interface ParkingFeeCalculationStrategy {
    double calculateParkingFee(Ticket ticket);
}
