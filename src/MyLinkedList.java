    //head - variable is a reference to the first node in the list
    // size -  integer that keeps track of the number of elements in the list

public class MyLinkedList<T extends  Comparable<T>> implements MyList {

    private Node head;
    private Node tail;
    private int size;
    public static class Node<T>{
        T value;
        Node next;
        public Node(T value){
            this.value = value;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public MyLinkedList(T value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    @Override
    public int size(){//returns the size of the list
        return size;
    }

    @Override
    public boolean contains(Object o) {//returns true if the list contains the specified object, false otherwise
        Node<T> current = head;
        while (current != null) {
            if(current.value.equals(o)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void add(Object item) {//adds the specified item to the end of the list
        Node<T> newNode = new Node<>((T) item);

        if (head == null){
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    @Override
    public void add(Object item, int index){//adds the specified item at the specified index in the list
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>((T) item);

        if(index==0){
            newNode.next = head;
            head = newNode;
        } else{
            Node<T> current = head;
            for(int i = 0; i < index-1; i++){
                current=current.next;
            }
            newNode.next  = current.next;
            current.next = newNode;
        }

        size++;
    }

    @Override
    public boolean remove(Object item){//removes the first occurrence of the specified object from the list
        if(head == null){
            return false;
        }

        if(head.value.equals(item)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> current  = head;
        while(current.next != null) {
            if(current.next.value.equals(item)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public Object remove(int index) {//removes the item at the specified index from the list
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T removedItem;
        if(index == 0) {
        removedItem = (T) head.value;
        head = head.next;
        } else{
            Node<T> current = head;
            for(int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedItem = (T) current.next.value;
            current.next = current.next.next;
        }

        size--;
        return removedItem;
    }

    @Override
    public void clear() {//removes all elements from the list
        head = null;
        size = 0;
    }

    @Override
    public Object get(int index) {//returns the item at the specified index in the list
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    @Override
    public int indexOf(Object o) {//returns the index of the first occurrence of the specified object in the list, or -1 if the object is not found
        Node<T> current = head;
        int index = 0;
        while(current != null) {
            if(current.value.equals(o)){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {//returns the index of the last occurrence of the specified object in the list, or -1 if the object is not found
        Node<T> current = head;
        int index = -1;
        int i = 0;
        while(current != null){
            if(current.value.equals(o)){
                index = i;
            }
            current = current.next;
            i++;
        }
        return index;
    }

    @Override
    public void sort() {//sorts the elements in the list in ascending order using a bubble sort algorithm
        boolean swapped;
        Node<T> current;
        Node<T> last = null;

        if(head == null){
            return;
        }

        do{
            swapped = false;
            current = head;

            while(current.next != last){
                if(current.value.compareTo((T) current.next.value)>0) {
                  T temp = current.value;
                  current.value = (T) current.next.value;
                  current.next.value = temp;
                  swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }
    public void removeAll(Object o){
        Node<T> previous = null;
        Node<T> current = head;
        while(current != null){
            if(current.value.equals(o)){
                if(previous == null){
                    head = current.next;
                }
                else{
                    previous.next = current.next;
                }
                size--;
            } else{
                previous = current;
            }
            current = current.next;
        }
    }

}
