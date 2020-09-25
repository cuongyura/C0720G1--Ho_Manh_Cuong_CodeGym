package case_study_furama.Commons;

public class ConvertUtils {

     public static String normalizeStr(String str) {
         // lấy ra kí tự đầu tiên và chuyển đổi thành kí tự hoa
         StringBuilder stringBuilder = new StringBuilder(str.substring(0, 1).toUpperCase());
         // từ vị trí 1 đi mình viết thường hết:
         stringBuilder.append(str.substring(1).toLowerCase());

         return stringBuilder.toString();
     }
}
