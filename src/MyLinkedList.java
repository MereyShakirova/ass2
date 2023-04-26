public class MyLinkedList<T extends  Comparable<T>> implements MyList {

    private Node head;
    private Node tail;
    private int size;
    public static class Node<T>{
        T value;
        Node next;
        public Node(T.value){
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
    public void add(Object item, int index){
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




}
