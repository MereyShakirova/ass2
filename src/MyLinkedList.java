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
        Node newNode = new NodeBuilder().createNode();
        head = newNode;
        tail = newNode;
        size = 1;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean contains(Object o) {
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
    public void add(Object item) {
        Node<T> newNode = new NodeBuilder().createNode();

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
    public void add(Object item, int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new NodeBuilder().createNode();

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
    public boolean remove(Object item){
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
    public Object remove(int index) {
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
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
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
    public int indexOf(Object o) {
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
    public int lastIndexOf(Object o) {
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
    public void sort() {

    }


}
