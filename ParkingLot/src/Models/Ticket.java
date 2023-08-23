package Models;

import java.util.Date;

public class Ticket {
    String vehicleNumber;
    long parkingSpotId;
    Date entryTime;
    PaymentStatus paymentStatus;
    long ticketId;

    public Ticket(String vehicleNumber, long parkingSpotId) {
        this.vehicleNumber = vehicleNumber;
        this.parkingSpotId = parkingSpotId;
        entryTime = new Date();
        paymentStatus = PaymentStatus.UNPAID;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", parkingSpotId=" + parkingSpotId +
                ", entryTime=" + entryTime +
                ", paymentStatus=" + paymentStatus +
                ", ticketId=" + ticketId +
                '}';
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public long getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(long parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }
}
