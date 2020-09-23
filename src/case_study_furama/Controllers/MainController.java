package case_study_furama.Controllers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainController {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println("1.\t Add New Services\n" +
                               "2.\tShow Services\n" +
                               "3.\tAdd New Customer\n" +
                               "4.\tShow Information of Customer\n" +
                               "5.\tAdd New Booking\n" +
                               "6.\tShow Information of Employee\n" +
                               "7.\tExit\n");
            System.out.println("Please input choose (1 - 7): ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showInformationOfServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (choose >= 1 && choose <= 7);
    }

    private static void showInformationOfEmployee() {
    }

    private static void addNewBooking() {
    }

    private static void showInformationOfCustomer() {
    }

    private static void addNewCustomer() {
    }

    private static void showInformationOfServices() {
    }

    private static void addNewServices() {
    }
}
