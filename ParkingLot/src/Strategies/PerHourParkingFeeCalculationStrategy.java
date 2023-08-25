package Strategies;

import Models.Ticket;

import java.util.Date;

public class PerHourParkingFeeCalculationStrategy implements ParkingFeeCalculationStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        long parkingDuration = new Date().getTime()-ticket.getEntryTime().getTime();
        long hoursPassed =  parkingDuration/(60*60*1000);
        return hoursPassed*2.5;
    }
}
