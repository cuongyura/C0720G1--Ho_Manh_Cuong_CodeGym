package __11_dsa_stack_queue.bai_tap._1_reverse_array_integer;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack;
    public Stack() {
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }

    // settings method pop:

    public T pop() {
        if(isEmpty() == true) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // settings method size:
    public int size() {
        return stack.size();
    }

    // settings method isEmpty:

    public boolean isEmpty(){
        if(stack.size() == 0) {
            return true;
        }
        return false;
    }

}
