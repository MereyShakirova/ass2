public class MyArrayList<T> implements  MyList {
    private T[] list;
    private int size;
    private int arraySize = 5;
    private final int default_capacity = 5;
    public MyArrayList() {list = (T[]) new Object[default_capacity];}
    public MyArrayList(int capacity){
     if(capacity <= 0) {
         throw new IllegalArgumentException(("Capacity can not be less or equal to zero");
     }
     else{
         list = (T[]) (new Object[capacity]);
     }
    }
    public int size(){return size;}
    public boolean contains(Object o){
        if(o==null) return false;
        for(int i=0; i<size; i++){
            if(list[i].equals(o)) {
                return true;
            }
        }
        return false;
    }
}


