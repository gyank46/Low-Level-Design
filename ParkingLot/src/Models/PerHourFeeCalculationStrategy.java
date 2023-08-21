package Models;

public class PerHourFeeCalculationStrategy implements ParkingFeeCalculationStrategy{
    @Override
    public double calculateParkingFee(Ticket ticket) {
        return 0;
    }
}
