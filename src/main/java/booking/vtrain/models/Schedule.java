package booking.vtrain.models;

import java.util.Date;

public class Schedule {
    private String scheduleId;
    private String startPoint;
    private String destination;
    private Date startDate;
    private Date arriveDate;
    private String startTime;
    private String trainId;

    public Schedule() {
    }

    public Schedule(String scheduleId, String startPoint, String destination,
            Date startDate, Date arriveDate, String startTime, String trainId) {
        this.scheduleId = scheduleId;
        this.startPoint = startPoint;
        this.destination = destination;
        this.startDate = startDate;
        this.arriveDate = arriveDate;
        this.startTime = startTime;
        this.trainId = trainId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
}