package parking_;

import java.time.Duration;
import java.time.LocalTime;

public class DataCar {
    private String plate;
    private String CPF;
    private String name;
    private String vehicleType;
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public DataCar(String plate, String CPF, String name, String vehicleType, int entryHour, int entryMinute, int departureHour, int departureMinute) {
        this.plate = plate;
        this.CPF = CPF;
        this.name = name;
        this.vehicleType = vehicleType;
        this.time = new Time(entryHour, entryMinute, departureHour, departureMinute);
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public LocalTime getEntryTime() {
        System.out.println("entry time: " + time.getEntryTime());
        return time.getEntryTime();
    }

    public void setEntryTime(LocalTime time) {
        this.time.setEntryTime(time);
    }

    public LocalTime getDepartureTime() {
        return time.getDepartureTime();
    }

    public void setDepartureTime(LocalTime time) {
        this.time.setDepartureTime(time);
    }

    public boolean cpfVerification(String cpf) {
        int verify = cpf.length();
        if (verify == 11) {
            return true;
        } else {
            return false;
        }
    }

    public boolean plateVerification(String plate) {
        int verify = plate.length();
        if (verify == 7) {
            return true;
        } else {
            return false;
        }
    }

    public double verificationVehicleType() {
        String verify = this.vehicleType;
        if (verify == "car") {
            return 15.00;
        } else {
            return 12.00;
        }

    }

    public Duration calculationDuration() {
        return Duration.between(getEntryTime(), getDepartureTime());
    }

    public Double payment() {
        double baseValue = verificationVehicleType();
        Duration tax = calculationDuration();
        long totalHours = tax.toHours();
        long remainingMinutes = tax.toMinutes() % 60;
        System.out.println("Duração total: " + totalHours + " horas, " + remainingMinutes + " minutos");
        if (totalHours <= 12) {
            return baseValue;
        } else {
            return baseValue + ((totalHours - 12) * 2);
        }
    }
}



