package __13_algorythm_search.op._2_recomind_import_string_show_stringchirlden_sort_length_max;

import java.util.LinkedList;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {

        // Create a Scanner

        Scanner scanner = new Scanner(System.in);

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        // Prompt the user to enter a string

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        // Find the maximum consecutive increasingly ordered substring
        for (int i = 0; i < string.length(); i++) {        // single loop
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear(); // Simple statement
            }

            list.add(string.charAt(i)); // Simple statement

            if (list.size() > max.size()) { // Simple statement
                max.clear();
                max.addAll(list);
            }
        }

        // Display the maximum consecutive
        // increasingly ordered substring
        for (Character ch : max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }
}

