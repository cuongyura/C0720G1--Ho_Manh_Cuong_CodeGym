package __13_algorythm_search.op._2_recomind_import_string_show_stringchirlden_sort_length_max;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Find the maximum increasingly ordered subsequence
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }else {
                    i = j - 1;
                    break;
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }
}
