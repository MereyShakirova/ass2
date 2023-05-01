import java.util.ArrayList;
import java.util.NoSuchElementException;
public class MyArrayListQueque<T> {
    private ArrayList<T> queque;
    public MyArrayListQueque() {
        queque = new ArrayList<>();
    }
    public void enqueque(T element){
        queque.add(element);
    }
    public T dequeque(){
        if(queque.isEmpty()){
            throw new NoSuchElementException();
        }
        return queque.remove(0);
    }


}
