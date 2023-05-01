import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<T> {
    private LinkedList<T> stack; // instance variable of type LinkedList
    public MyLinkedListStack(){ // instance variable of type LinkedList
        stack = new LinkedList<>();
    }
    public void push(T element) {// push method to add element to the top of the stack
        stack.addFirst(element);
    }
    public T pop(){ // pop method to remove and return the top element of the stack
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public T peek(){//// peek method to return the top element of the stack without removing it
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
    public boolean isEmpty(){  // isEmpty method to check if the stack is empty
        return stack.isEmpty();
    }
    public int size(){// size method to return the number of elements in the stack
        return stack.size();
    }

}
