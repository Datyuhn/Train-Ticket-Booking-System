package booking.vtrain.models;

public class Ticket {
    private String ticketId;
    private String trainId;
    private String cargoId;
    private int seatNumber;
    private String scheduleId;
    private String passportId;
    private String customerName;
    private long fare;
    private boolean isAvailable;

    public Ticket() {
    }

    public Ticket(String ticketId, String trainId, String cargoId, int seatNumber, String scheduleId, String passportId,
            String customerName, long fare, boolean isAvailable) {
        this.ticketId = ticketId;
        this.trainId = trainId;
        this.cargoId = cargoId;
        this.seatNumber = seatNumber;
        this.scheduleId = scheduleId;
        this.passportId = passportId;
        this.customerName = customerName;
        this.fare = fare;
        this.isAvailable = isAvailable;
    }

    // getters and setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getFare() {
        return fare;
    }

    public void setFare(long fare) {
        this.fare = fare;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}