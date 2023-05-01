import java.util.LinkedList;
import java.util.NoSuchElementException;
public class MyLinkedListQueque<T> {
    private LinkedList<T> queue;//instance variable of type MyLinkedList
    public MyLinkedListQueque() {// constructor initializes instance variable
        queue = new LinkedList<>();
    }
    public void enqueue(T element){
        // adds item to back of the queue
        queue.addLast(element);
    }
    public T dequeue() {
        if(queue.isEmpty()){
            throw new NoSuchElementException();//throws exception if queue is empty
        }
        return queue.removeFirst();// removes and returns front element of queue
    }
    public T peek(){
        if(queue.isEmpty()){
            throw new NoSuchElementException();// throws exception if queue is empty
        }
        return queue.getFirst();// returns front element of queue without removing it
    }
    public boolean isEmpty(){
        return queue.isEmpty();// returns front element of queue without removing it
    }
    public int size(){
        return queue.size();// returns front element of queue without removing it
    }
}
