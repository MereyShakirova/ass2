
    //list: an array of type T that stores the elements of the list;
    //size: an integer that represents the current number of elements in the list;
    //arraySize: an integer that represents the current size of the array;
    //default_capacity: a constant integer that represents the default size of the array if no capacity is specified;
import java.util.Arrays;

public class MyArrayList<T> implements MyList {

    private T[] list;//an array of type T that stores the elements of the list
    private int size;//an integer that represents the current number of elements in the list
    private int arraySize = 5;
    private final int default_capacity = 5;//a constant integer that represents the default size of the array if no capacity is specified

    public MyArrayList() {
        list = (T[]) new Object[default_capacity];
    }
    public MyArrayList(int capacity){
     if(capacity <= 0) {
         throw new IllegalArgumentException(("Capacity can not be less or equal to zero."));
     } else{
         list = (T[]) (new Object[capacity]);
     }
    }

    @Override
    public int size(){//returns the size of the list
        return size;
    }

    @Override
    public boolean contains(Object o){//returns a boolean value indicating whether the specified element is in the list
        if(o==null) return false;
        for(int i=0; i<size; i++){
            if(list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object item){//adds an element to the end of the list
        if(size == arraySize){
            resize();
        }
        list[size++] = (T) item;
    }

    @Override
    public void add(Object item, int index) {//adds an element at the specified index in the list
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
    public boolean remove(Object item){//removes the first occurrence of the specified element from the list
        if(item == null) return false;
        int index = indexOf(item);
        if(index<0) return false;
        remove(index);
        return true;
    }

    @Override
    public Object remove(int index){//removes the element at the specified index from the list
        if(index < 0) return null;
        Object removedItem = list[index];
        for(int i = index; i < size; i++){
            list[i] = list[i+1];
        }
        size--;
        return removedItem;
    }

    @Override
    public void clear() {//removes all elements from the list
        list = (T[]) new Object[default_capacity];
        size = 0;
    }

    @Override
    public Object get(int index){//returns the element at the specified index in the list
        return list[index];
    }

    @Override
    public int indexOf(Object o){//returns the index of the first occurrence of the specified element in the list, or -1 if the element is not in the list
        if(o == null) return -1;
        for(int i = 0; i < size; i++){
            if(o.equals(list[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {//returns the index of the last occurrence of the specified element in the list, or -1 if the element is not in the list
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
    public void sort(){//sorts the elements of the list in ascending order using the natural ordering of the elements. The elements must implement the Comparable interface.
        Arrays.sort(list, 0, size);
    }
    public <T extends Comparable<T>> int compare(T a, T o){// a private method used by the sort() method to compare two elements.
        return a.compareTo(o);
    }

    private void resize(){//doubles the size of the array when it is full
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




