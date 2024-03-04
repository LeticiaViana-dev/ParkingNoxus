package parking_;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner questions = new Scanner(System.in);
        DataCar dataCar = new DataCar("", "", "", "", new Time(0, 0));
        List<DataCar> list = new LinkedList<>();
        int option = 1;
        boolean isValidCpf = false;
        boolean isValidPlate = false;


        while (option != 0) {
            System.out.println("-----------------------------------");
            System.out.println("NOXUS PARKING: \uD83D\uDC41\uFE0F\u200D\uD83D\uDDE8\uFE0F");
            System.out.println("<<<<<<<<<<<TABLE OF VALUES>>>>>>>");
            System.out.println();
            System.out.println("Motorcycles: $ 12.00 - 12 hour period");
            System.out.println("Car: $ 15.00 - 12 hour period ");
            System.out.println("-------------------------------------");
            System.out.println("MENU");
            System.out.println("Option 1: Add date vehicle ");
            System.out.println("Option 2: Payment ");
            System.out.println("Option S: Exit The Menu");
            System.out.println("--------------------------------------");
            option = questions.nextInt();

            switch (option) {
                case 1: {
                    while (!isValidCpf) {
                        System.out.println("Name: ");
                        String name = questions.nextLine();
                        dataCar.setName(name);
                        System.out.println("CPF: ");
                        String cpf = questions.nextLine();
                        isValidCpf = dataCar.cpfVerification(cpf);
                        if (isValidCpf) {
                            dataCar.setCPF(cpf);
                            System.out.println("Valid CPF!!");
                        } else {
                            System.out.println("Invalid CPF");
                        }
                    }
                    System.out.println("Vehicle: ");
                    dataCar.setVehicleType(questions.nextLine());
                    while (!isValidPlate) {
                        System.out.println("Plate:");
                        String plate = questions.nextLine();
                        isValidPlate = dataCar.plateVerification(plate);
                        if (isValidPlate) {
                            dataCar.setPlate(plate);
                            System.out.println("Valid Plate");
                        } else {
                            System.out.println("Invalid Plate");
                        }
                    }
                    System.out.println("Entry Time: ");
                    dataCar.setEntryTime(LocalTime.parse(questions.nextLine()));
                    questions.nextLine();
                    list.add(dataCar);
                    System.out.println();
                    break;
                }
                case 2: {
                    while (!isValidCpf) {
                        System.out.println("CPF: ");
                        String cpf = questions.nextLine();
                        isValidCpf = dataCar.cpfVerification(cpf);
                        if (isValidCpf) {
                            dataCar.setCPF(cpf);
                            System.out.println("Valid CPF!!");
                            List<DataCar> verifyCPF = list.stream().filter(item -> item.getCPF().equals(cpf)).toList();
                            if (verifyCPF.isEmpty()) {
                                System.out.println("invalid CPF");
                                isValidCpf = false;
                            }
                        } else {
                            System.out.println("Invalid CPF");
                        }
                        while (!isValidPlate) {
                            System.out.println("Plate: ");
                            String plate = questions.nextLine();
                            isValidPlate = dataCar.plateVerification(plate);
                            if (isValidPlate) {
                                dataCar.setCPF(plate);
                                System.out.println("Valid Plate!!");
                                List<DataCar> verifyPlate = list.stream().filter(item -> item.getCPF().equals(plate)).toList();
                                if (verifyPlate.isEmpty()) {
                                    System.out.println("Invalid Plate");
                                    isValidPlate = false;
                                }
                            } else {
                                System.out.println("Invalid Plate");
                            }
                            System.out.println("Departure Time: ");
                            dataCar.setDepartureTime(LocalTime.parse(questions.nextLine()));
                            questions.nextLine();
                            list.add(dataCar);
                            System.out.println();
                           System.out.println("Payment: ");
                            dataCar.payment();
                            break;
                        }
                    }
                }
            }
            questions.close();
        }
    }
}


