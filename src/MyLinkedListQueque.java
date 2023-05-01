import java.util.LinkedList;
import java.util.NoSuchElementException;
public class MyLinkedListQueque<T> {
    private LinkedList<T> queue;
    public MyLinkedListQueque() {
        queue = new LinkedList<>();
    }
    public void enqueue(T element){
        queue.addLast(element);
    }
    public T dequeue() {
        if(queue.isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }
    public T peek(){
        if(queue.isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }
}
