package booking.vtrain.models;

public class Seat {
    private int seatNumber;
    private String cargoId;

    public Seat(int seatNumber, String cargoId) {
        this.seatNumber = seatNumber;
        this.cargoId = cargoId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }
}