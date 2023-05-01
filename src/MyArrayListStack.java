import java.util.ArrayList;
import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private ArrayList<T> stack;// instance variable of type ArrayList
    public MyArrayListStack() { // constructor to initialize the stack
        stack =new ArrayList<>();
    }
    public void push(T element){// push method to add element to the top of the stack
        stack.add(element);
    }

    public T pop(){// pop method to remove and return the top element of the stack
        if(stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }
    public T peek(){// peek method to return the top element of the stack without removing it
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(int T){ // isEmpty method to check if the stack is empty

        return stack.isEmpty();
    }
    public int size() {// size method to return the number of elements in the stack

        return stack.size();
    }

}
