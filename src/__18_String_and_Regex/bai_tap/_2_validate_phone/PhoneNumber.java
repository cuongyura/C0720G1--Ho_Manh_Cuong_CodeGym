package __18_String_and_Regex.bai_tap._2_validate_phone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String REGEX_PHONE = "^84-0\\d{7}$";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Matcher matcher;
        Pattern pattern;

        boolean flag;
        do {
            System.out.println("Please input phone number: ");
            String phoneNumber = scanner.nextLine();
            pattern = Pattern.compile(REGEX_PHONE);
            // xem nó trùng khớp với nhau chưa:
            matcher = pattern.matcher(phoneNumber);
            flag = matcher.matches();
            if (!flag) {
                System.out.println("Input not matching " + REGEX_PHONE);
            }
        } while (!flag);

        System.out.println("Valid complete!!! .... ");


    }
}
