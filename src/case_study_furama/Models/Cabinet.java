package case_study_furama.Models;

import __6_extend.bai_tap._4_Triangle.Main;
import case_study_furama.Controllers.MainController;

import java.util.Scanner;
import java.util.Stack;

public class Cabinet {

    private static Scanner scanner = new Scanner(System.in);

    // create a grade level static:

    static {
        MainController.readAllEmployee();
        MainController.showInformationOfEmployee();
    }

    public static Employee getFileOfEmployee(int id) {
        Employee employee = null;
        while (!MainController.listStack.isEmpty()) {
            employee = MainController.listStack.pop();

            if (id == employee.getId()) {
                   return employee;
            }
        }
        return employee;
    }

    public static void findFileOfEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input employee id to get file: ");
        int id = scanner.nextInt();


        Employee employee = getFileOfEmployee(id);

        if (employee != null) {
            System.out.println("File employee: " + employee.toString());
        } else {
            System.out.println("File employee is not found!");
        }
    }
}

