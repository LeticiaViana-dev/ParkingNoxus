package parking_;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner questions = new Scanner(System.in);

        DataCar dataCar = new DataCar("", "", "", "");
        List<DataCar> list = new LinkedList<>();
        int option = 1;


            while (option!= 0) {
                System.out.println("-----------------------------------");
                System.out.println("NOXUS PARKING: \uD83D\uDC41\uFE0F\u200D\uD83D\uDDE8\uFE0F");
                System.out.println("<<<<<<<<<<<TABLE OF VALUES>>>>>>>");
                System.out.println();
                System.out.println("Motorcycles: $ 12.00 - 12 hour period");
                System.out.println("Car: $ 15.00 - 12 hour period ");
                System.out.println("-------------------------------------");
                System.out.println();
                System.out.println("MENU");
                System.out.println("Option 1: Add CPF ");
                System.out.println("Option 2: Add vehicle ");
                System.out.println("Option 3: Add vehicle Plate ");
                System.out.println("Option 4: Payment ");
                System.out.println("Option 0: Exit The Menu");
                System.out.println("--------------------------------------");
                option = questions.nextInt();}
        questions.close();
    }
}