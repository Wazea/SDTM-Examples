package com.drvasile.client;

import java.util.Scanner;

public class MainClient {

    private static final Scanner scanner = new Scanner(System.in);

    private static void performOperations() {

        while (true) {

            System.out.println("Choose one operation from below by entering its index: ");
            System.out.println("1. Create object");
            System.out.println("2. Apply to the University");
            System.out.println("3. Get University Structure");
            System.out.println("4. Query on the Uni. Struct.");
            System.out.println("5. Make Attendance");
            System.out.println("0. Exit the system");
            System.out.println();

            int operationType = scanner.nextInt();

            switch (operationType) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Operation not supported.");
            }

        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("===== University Data Management System =====");
            System.out.println("---------------------------------------------");
            System.out.println("          Start or Exit the system:          ");
            System.out.println("                  1. Start                   ");
            System.out.println("                  0. Exit                    ");
            System.out.println();

            int userChoice = scanner.nextInt();

            switch (userChoice) {

                case 1:
                    performOperations();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Operation not supported.");
            }
        }
    }
}
