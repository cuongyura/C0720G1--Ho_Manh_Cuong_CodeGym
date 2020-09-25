package case_study_furama.Commons;

import case_study_furama.Exceptions.*;

import java.time.Year;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {
    /* - regex : SVXX-YYYY : 4 số. */
    public static final String SERVICE_CODE_REGEX = "SV(VL|HO|RO)-[\\d]{4}";
    /* - tên dịch vụ phải viết hoa chữ đầu. */
    public static final String SERVICE_NAME_REGEX = "[A-Z][a-z]*";
    public static final String ID_CARD_REGEX = "[\\d]{3}-[\\d]{3}-[\\d]{3}";
    public static final String BIRTH_DAY_REGEX = "[\\d]{2}/[\\d]{2}/[\\d]{4}";

    private static Pattern pattern;
    private static Matcher matcher;

    public static boolean isValidRegex (String str , String regex) {

        pattern = Pattern.compile(regex);
        // xem nó trùng khớp với nhau chưa:
        matcher = pattern.matcher(str);
        boolean flag = matcher.matches();
        if(!flag) {
            System.out.println("Input not matching " + regex);
        }

        return flag;
    }

    public static boolean isValidService(String str , String regex) {

        pattern = Pattern.compile(regex);
        // xem nó trùng khớp với nhau chưa:
        matcher = pattern.matcher(str);
         boolean flag = matcher.matches();
        if(!flag) {
            System.out.println("Input not matching " + regex);
        }

      return flag;
    }

    // check một số lớn hơn một số bất kỳ:

    public static boolean isMoreThan(double number, double destNumber) {
        boolean flag = number > destNumber;

        if(!flag) {
            System.out.println("Input is not more than " + destNumber);
        }
        return flag;
    }

    // check một số lớn hơn số bắt đầu và nhỏ hơn số kết thúc:
    public static boolean isMoreThan(double number, double startNumber, double endNumber) {
        boolean flag = number > startNumber && number < endNumber;

        if(!flag) {
            System.out.println("Input not in (" + startNumber +", " + endNumber+" )");
        }
        return flag;
    }

    public static boolean isValidExtraServiceName(String extraService){

        String[] list = {"massage", "karaoke", "food", "drink", "car"};
        // check xem có thuộc những cái trên ko:
        boolean flag = Arrays.asList(list).contains(extraService);

        if(!flag) {
            System.out.println("Extra service is not in list service ");
        }

        return flag;
    }

    // check kiểm tra kí tự đầu tiên phải viết hoa và không cho kí tự khoảng trống thừa:
    public static void isValidFullName(String fullName) throws NameException {
        /*
          từng thuộc tính cách nhau một khoảng trắng:
        */
        String[] fullNameElements = fullName.split(" ");

        for (String element : fullNameElements ){
            // lấy chữ cáu đầu tiên:
            if(Character.isLowerCase(element.charAt(0))) {
                 throw new NameException();
            }
        }

        // check khoảng trắng:

        for(int i = 0; i < fullName.length() - 1; i++) {
             if(fullName.charAt(i) == ' ' &&fullName.charAt(i + 1) == ' ') {
                 throw new NameException();
             }
        }
    }

    // Check email:

    public static void isValidEmail(String email) throws EmailException {
     // lấy ra vị trí thằng @:
        int posA = email.indexOf("@");

        if(posA  < 0) {
            throw new EmailException();
        }

        // check "@" hiện ra hơn 1 lần:

        int countA = 0;
        int countPoint = 0;

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@' ) {
                countA++;
            } else if(email.charAt(i) == '.') {
                countPoint++;
            }

            if(countA >=2) {
                throw new EmailException();
            }
        }

        if(countPoint == 0) {
            throw new EmailException();
        }
    }

    public static void isValidGender(String gender) throws GenderException {
         String[] list = {"male", "female", "unknown"};

         if(!Arrays.asList(list).contains(gender.toLowerCase())) {
               throw new GenderException();
         }
    }

    // check id:
      public static void isValidIdCard(String idCard) throws IdCardException {

          if(!isValidRegex(idCard, Validators.ID_CARD_REGEX)) {
              throw new IdCardException();
          }

      }

    // check birth day:

    public static void isValidBirthday(String birthDay) throws BirthdayException {

            if(isValidRegex(birthDay, Validators.BIRTH_DAY_REGEX)) {
                // lấy năm hiện tại
                int birthYear = Integer.parseInt(birthDay.split("/")[2]);
                int curYear = Year.now().getValue();

                if( birthYear <= 1900 || curYear - birthYear < 18 ) {
                    throw new BirthdayException();
                }
            } else {
                throw new BirthdayException();
            }

    }



}
