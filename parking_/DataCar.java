package parking_;

import java.time.LocalTime;

public class DataCar {
    private String plate;
    private String CPF;
    private String name;
    private String vehicleType;
    private Time time;

    public DataCar(String plate, String CPF, String name, String vehicleType, Time time) {
        this.plate = plate;
        this.CPF = CPF;
        this.name = name;
        this.vehicleType = vehicleType;
        this.time = time;
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

    private double verificationVehicleType() {
        String verify = this.vehicleType;
        if (verify == "car") {
            return 15.00;
        } else {
            return 12.00;
        }


    }

}
    

