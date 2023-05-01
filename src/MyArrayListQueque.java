import java.util.ArrayList;
import java.util.NoSuchElementException;
public class MyArrayListQueque<T> {
    private ArrayList<T> queue;// returns front element of queue without removing it
    public MyArrayListQueque() {
        queue = new ArrayList<>();//constructor initializes instance variable
    }
    public void enqueue(T element){
        queue.add(element);//adds item to back of the queue
    }
    public T dequeue(){
        if(queue.isEmpty()){
            throw new NoSuchElementException();//throws exception if queue is empty
        }
        return queue.remove(0);//removes and returns front element of queue
    }
    public T peek() {
        if(queue.isEmpty()){
            throw new NoSuchElementException();// throws exception if queue is empty
        }
        return queue.get(0);//returns front element of queue without removing it
    }
    public boolean isEmpty(){
        return queue.isEmpty();//returns true if queue is empty, false otherwise
    }
    public int size(){
        return queue.size();//returns number of elements in queue
    }

}
