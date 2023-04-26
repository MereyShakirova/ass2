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


}
