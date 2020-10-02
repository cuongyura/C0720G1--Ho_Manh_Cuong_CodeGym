package __17_io_binary_file_serialization.thuc_hanh._1_copy_file_large_capa_city;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source file: ");
        String sourcePath = scanner.nextLine();

        System.out.println("Enter destination file: ");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

    }


}
