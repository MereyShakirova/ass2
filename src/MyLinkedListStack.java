import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<T> {
    private LinkedList<T> stack;
    public MyLinkedListStack(){
        stack = new LinkedList<>();
    }
    public void push(T element) {
        stack.addFirst(element);
    }
    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public T peek(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }

}
