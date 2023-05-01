import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<T> {
    private LinkedList<T> list;
    public MyLinkedListStack(){
        list = new LinkedList<>();
    }
    public void push(T element) {
        list.addFirst(element);
    }
    public T pop(){
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    public T peek(){
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int size(){
        return list.size();
    }

}
