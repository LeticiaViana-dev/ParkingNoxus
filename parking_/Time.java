package parking_;

import java.time.Duration;
import java.time.LocalTime;

public class Time {
    private LocalTime entryTime;
    private LocalTime departureTime;

    public Time(LocalTime entryTime, LocalTime departureTime) {
        this.entryTime = entryTime;
        this.departureTime = departureTime;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
    private Duration calculationDuration(){
        return Duration.between(entryTime,departureTime);
    }
}

