package parking_;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private LocalTime entryTime;
    private LocalTime departureTime;

    public Time(int entryTime, int departureTime) {
        this.entryTime = LocalTime.of(entryTime, entryTime, entryTime);
        this.departureTime = LocalTime.of(departureTime, departureTime, departureTime);
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

}



