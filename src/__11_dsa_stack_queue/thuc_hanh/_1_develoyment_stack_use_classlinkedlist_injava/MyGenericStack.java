package __11_dsa_stack_queue.thuc_hanh._1_develoyment_stack_use_classlinkedlist_injava;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    // properties:
    private LinkedList<T> stack;

    // method constructor:

    public MyGenericStack() {
       stack = new LinkedList<>();
    }

    // settings method push:

    public void push(T element){
     stack.addFirst(element);
    }

    // settings method pop:

    public T pop() {
        if(isEmpty()) {
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
