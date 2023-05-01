import java.util.LinkedList;
import java.util.NoSuchElementException;
public class MyLinkedListQueque<T> {
    private LinkedList<T> queque;
    public MyLinkedListQueque() {
        queque = new LinkedList<>();
    }
    public void enqueque(T element){
        queque.addLast(element);
    }
    public T dequeque() {
        if(queque.isEmpty()){
            throw new NoSuchElementException();
        }
        return queque.removeFirst();
    }
    public T peek(){
        if(queque.isEmpty()){
            throw new NoSuchElementException();
        }
        return queque.getFirst();
    }
    public boolean isEmpty(){
        return queque.isEmpty();
    }
    public int size(){
        return queque.size();
    }
}
