package __18_String_and_Regex.bai_tap._1_validate_class_room;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRoomExample {

    private static final String ROOM_CLASS = "^[C|A|P]\\d{4}[G|H|I|K|L|M]$";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do {
            System.out.println("Please input class room: ");
            String roomClass = scanner.nextLine();
            pattern = Pattern.compile(ROOM_CLASS);
            // xem nó trùng khớp với nhau chưa:
            matcher = pattern.matcher(roomClass);
            flag = matcher.matches();
            if (!flag) {
                System.out.println("Input not matching " + ROOM_CLASS);
            }
        } while (!flag);


    }
}
