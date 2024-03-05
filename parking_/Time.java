package parking_;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private LocalTime entryTime;
    private LocalTime departureTime;

    public Time(int entryHour, int entryMinute, int departureHour, int departureMinute) {
        this.entryTime = LocalTime.of(entryHour, entryMinute);
        this.departureTime = LocalTime.of(departureHour, departureMinute);
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




