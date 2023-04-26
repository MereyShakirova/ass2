# Assignment 2 for the Algorithm Data Structure
### Task:
    In this reprository, We needed to create the MyArrayList and MyLinkedList classes, which are implementations of ArrayList and LinkedList, respectively.
####  Description:
    You couldn't use java.util.ArrayList and java.util.LinkedList!

## Main.java
## MyArrayList.java
## MyLinkedList.java
## MyList.java
        public interface MyList<T> {
        int size();
        boolean contains(Object o);
        void add(T item);
        void add(T item, int index);
        boolean remove(T item);
        T remove (int index);
        void clear();
        T get(int index);
        
            int indexOf(Object o);
        
            int lastIndexOf(Object o);
        
            void sort();
        }
