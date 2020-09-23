package __11_dsa_stack_queue.op_bai_tap._2_palindrome;


import java.util.Queue;
import java.util.Stack;
import java.util.PriorityQueue;

public class Palindrome {
    public static void main(String[] args) {
        String str = "I Like Ekko 3 sao";
        Stack stack = new Stack();
        Queue queue = new PriorityQueue();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            stack.push(c);
            queue.add(c);

        }
        String result = " Not palindrome";
        for (int i = 0; i < str.length()/2;i++ ){
            if(stack.pop().equals(queue.remove())) result ="Palindrome";
        }
        System.out.println(str);
        System.out.println(result);
    }
}
