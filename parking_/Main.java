package parking_;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner questions = new Scanner(System.in);
        List<DataCar> list = new LinkedList<>();
        DataCar dataCar = new DataCar("", "", "", "", 0, 0, 0, 0);
        Time time = new Time(0, 0, 0, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
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
            System.out.println("Option 1: Add data vehicle ");
            System.out.println("Option 2: Payment ");
            System.out.println("Option 0: Exit The Menu");
            System.out.println("--------------------------------------");
            option = questions.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Name: ");
                    String name = questions.nextLine();
                    dataCar.setName(name);
                    questions.nextLine();

                    while (!isValidCpf) {
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
                    System.out.println("Entry Time (HH:mm): ");
                    String entryTimeStr = questions.nextLine();
                    LocalTime entryTime = LocalTime.parse(entryTimeStr, formatter);
                    dataCar.setEntryTime(entryTime);
                    list.add(dataCar);
                    break;
                }
                case 2: {
                    isValidCpf = false;
                    isValidPlate = false;
                    System.out.println("Name: ");
                    String name = questions.nextLine();
                    dataCar.setName(name);
                    questions.nextLine();
                    while (!isValidCpf) {
                        System.out.println("CPF: ");
                        String cpf = questions.nextLine();
                        isValidCpf = dataCar.cpfVerification(cpf);
                        if (isValidCpf) {
                            dataCar.setCPF(cpf);
                            System.out.println("Valid CPF!!");
                            List<DataCar> verifyCPF = list.stream().filter(item -> item.getCPF().equals(cpf)).toList();
                            if (verifyCPF.isEmpty()) {
                                System.out.println("CPF not found");
                            }
                        } else {
                            System.out.println("Invalid CPF");
                        }
                    }
                    while (!isValidPlate) {
                        System.out.println("Plate: ");
                        String plate = questions.nextLine();
                        isValidPlate = dataCar.plateVerification(plate);
                        if (isValidPlate) {
                            System.out.println("Valid Plate!!");
                            List<DataCar> verifyPlate = list.stream().filter(item -> item.getPlate().equals(plate)).toList();
                            if (verifyPlate.isEmpty()) {
                                System.out.println("Plate not found");
                                isValidPlate = false;
                            }
                        } else {
                            System.out.println("Invalid Plate");
                        }
                    }
                    System.out.println("Departure Time (HH:mm): ");
                    String departureTimeStr = questions.nextLine();
                    LocalTime departureTime = LocalTime.parse(departureTimeStr, formatter);
                    dataCar.setDepartureTime(departureTime);
                    list.add(dataCar);
                    System.out.println("Payment: " + dataCar.payment());
                    break;
                }

                case 0: {
                    System.out.println("Thank you for your preference!!");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please try again.");
                    break;

                }
            }

        }
    }
}



