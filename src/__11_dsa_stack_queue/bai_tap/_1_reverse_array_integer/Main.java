package __11_dsa_stack_queue.bai_tap._1_reverse_array_integer;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> integerStack= new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        while (!integerStack.isEmpty()) {
            System.out.printf("%s ",integerStack.pop());
        }
    }

    }

