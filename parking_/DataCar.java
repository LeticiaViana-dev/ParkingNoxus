package parking_;

public class DataCar {
    private String plate;
    private String CPF;
    private String name;
    private String vehicleType;


    public DataCar(String plate, String CPF, String name, String vehicleType) {
        this.plate = plate;
        this.CPF = CPF;
        this.name = name;
        this.vehicleType = vehicleType;
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

    private boolean cpfVerification() {
        int verify = this.CPF.length();
        if (verify == 11) {
            return true;
        } else {
            return false;
        }
    }
    private boolean plateVerification() {
        int verify = this.plate.length();
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
    

