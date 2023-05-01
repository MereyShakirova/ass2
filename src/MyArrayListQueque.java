import java.util.ArrayList;
import java.util.NoSuchElementException;
public class MyArrayListQueque<T> {
    private ArrayList<T> queue;
    public MyArrayListQueque() {
        queue = new ArrayList<>();
    }
    public void enqueue(T element){
        queue.add(element);
    }
    public T dequeue(){
        if(queue.isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }
    public T peek() {
        if(queue.isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }

}
