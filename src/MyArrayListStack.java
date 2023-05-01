import java.util.ArrayList;
import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private ArrayList<T> stack;
    public MyArrayListStack() {
        stack =new ArrayList<>();
    }
    public void push(T element){
        stack.add(element);
    }

    public T pop(){
        if(stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }


}
