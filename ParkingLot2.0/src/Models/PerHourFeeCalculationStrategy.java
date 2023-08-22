package Models;

import Interfaces.ParkingFeeCalculationStrategy;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class PerHourFeeCalculationStrategy implements ParkingFeeCalculationStrategy {
    @Override
    public double calculateParkingFee(Ticket ticket) {
        long totalParkedHours = getParkedHours(ticket.entryTime);
        return 50+(totalParkedHours-1)*30;
    }

    public long getParkedHours(LocalTime startTime){
        long hours = startTime.until(LocalTime.now(), ChronoUnit.HOURS);
        startTime = startTime.plusHours(hours);
        long minutes = startTime.until(LocalTime.now(), ChronoUnit.MINUTES);
        return minutes>0?hours+1:hours;
    }
}
