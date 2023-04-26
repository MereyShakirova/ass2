# Assignment 2 for the Algorithm Data Structure
### Task:
    In this reprository, We needed to create the MyArrayList and MyLinkedList classes, which are implementations of ArrayList and LinkedList, respectively.
####  Description:
    Do not use java.util.ArrayList and java.util.LinkedList!

## Main.java
## MyArrayList.java:
    In MyArrayList, the following tasks had to be done:

        1.Create a new class named MyArrayList that implements the List interface.
        2.Define a private instance variable of type Object[] to store the elements of the list.
        3.Define an int variable named size to keep track of the number of elements in the list.
        4.Implement the add(E element) method by first checking if the array is large enough to accommodate the new element. If it doesn't, create a new array with twice the size of the original array, copy the elements from the original array, and then add the new element. Otherwise just add a new element to the end of the array and increase the size variable.
        5.Implement the get(int index) method, returning the element at the specified index.
        6.Implement the remove(int index) method by removing the element at the specified index, shifting all subsequent elements to the left by one position, and decrementing the size variable.
        7.Implement the size() method by returning the variable size.
        8.Implement any other methods specified in the List interface.
        9.Test all methods of MyArrayList.
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
