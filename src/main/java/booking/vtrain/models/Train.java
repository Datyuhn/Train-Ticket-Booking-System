package booking.vtrain.models;

public class Train {
    private String trainId;
    private String trainName;
    private boolean available;
    private String startPoint;

    public Train() {
    }

    public Train(String trainId, String trainName, boolean available, String startPoint) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.available = available;
        this.startPoint = startPoint;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }
}