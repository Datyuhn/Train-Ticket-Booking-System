package booking.vtrain.models;

public class Cargo {
    private String cargoId;
    private String trainId;
    private boolean available;

    public Cargo() {
    }

    public Cargo(String cargoId, String trainId, boolean available) {
        this.cargoId = cargoId;
        this.trainId = trainId;
        this.available = available;
    }

    public String getCargoId() {
        return cargoId;
    }

    public void setCargoId(String cargoId) {
        this.cargoId = cargoId;
    }

    public String getTrainId() {
        return trainId;
    }

    // public void setTrainId(String trainId) {
    // this.trainId = trainId;
    // }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}