package com.drvasile.client;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {

    private static final Integer SCREEN_SIZE = 50;
    private static final Scanner scanner = new Scanner(System.in);

    private static void clearScreen() {
        for (int i = 0; i < SCREEN_SIZE; i++)
            System.out.println();
    }

    private static Integer performOperations() {
        while (true) {

            System.out.println("Choose one operation from below by entering its index: ");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("0. Exit the system");
            System.out.println();

            int operationType = scanner.nextInt();
            clearScreen();

            switch (operationType) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 0:
                    return 0;

                default:
                    System.out.println("Operation not supported.");
            }

        }
    }

    public static void main(String[] args) throws IOException {

        while (true) {

            System.out.println("===== University Data Management System =====");
            System.out.println("---------------------------------------------");
            System.out.println("          Start or Exit the system:          ");
            System.out.println("                  1. Start                   ");
            System.out.println("                  0. Exit                    ");
            System.out.println();

            int userChoice = scanner.nextInt();
            clearScreen();

            switch (userChoice) {
                case 1:
                    System.out.println();
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
