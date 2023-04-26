import java.util.Arrays;

public class MyArrayList<T> implements MyList {

    private T[] list;
    private int size;
    private int arraySize = 5;
    private final int default_capacity = 5;

    public MyArrayList() {
        list = (T[]) new Object[default_capacity];
    }
    public MyArrayList(int capacity){
     if(capacity <= 0) {
         throw new IllegalArgumentException(("Capacity can not be less or equal to zero"));
     } else{
         list = (T[]) (new Object[capacity]);
     }
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean contains(Object o){
        if(o==null) return false;
        for(int i=0; i<size; i++){
            if(list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object item){
        if(size == arraySize){
            resize();
        }
        list[size++] = (T) item;
    }

    @Override
    public void add(Object item, int index) {
        if(size == arraySize){
            resize();
        }
        for(int i=size; i>index; i--){
            list[i] = list[i-1];
        }
        list[index] = (T) item;
        size++;
    }

    @Override
    public boolean remove(Object item){
        if(item == null) return false;
        int index = indexOf(item);
        if(index<0) return false;
        remove(index);
        return true;
    }

    @Override
    public Object remove(int index){
        if(index < 0) return null;
        Object removedItem = list[index];
        for(int i = index; i < size; i++){
            list[i] = list[i+1];
        }
        size--;
        return removedItem;
    }

    @Override
    public void clear() {
        list = (T[]) new Object[default_capacity];
        size = 0;
    }

    @Override
    public Object get(int index){
        return list[index];
    }

    @Override
    public int indexOf(Object o){
        if(o == null) return -1;
        for(int i = 0; i < size; i++){
            if(o.equals(list[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        if (o == null) return -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(list[i])) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public void sort(){
        Arrays.sort(list, 0, size);
    }
    public <T extends Comparable<T>> int compare(T a, T o){
        return a.compareTo(o);
    }

    private void resize(){
        arraySize *= 2;
        Object[] increasedList = new Object[arraySize];
        for (int i = 0; i < size; i++){
            increasedList[i] = list[i];
        }
        list = (T[]) increasedList;
    }


    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}




