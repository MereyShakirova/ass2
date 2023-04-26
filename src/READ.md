# Assignment 2 for laboratory work for the Algorithm Data Structure

![Assignment 2](https://avatars.mds.yandex.net/i?id=85c7a1aec44a18feaf285883e555bc5800eb8003-8496986-images-thumbs&n=13)
### Task:
    In this reprository, we needed to create the MyArrayList and MyLinkedList classes, which are implementations of ArrayList and LinkedList, respectively.
#### !Description!:
    Do not use java.util.ArrayList and java.util.LinkedList!

## Main.java
## MyArrayList.java:
### Definition:
This code defines a generic class MyArrayList<T> that implements the interface MyList. The class is an implementation of the ArrayList data structure, which allows for dynamic resizing of an array-based list.
#### In MyArrayList, the following tasks had to be done:

1. Create a new class named MyArrayList that implements the List interface.
2. Define a private instance variable of type Object[] to store the elements of the list.
3. Define an int variable named size to keep track of the number of elements in the list.
4. Implement the add(E element) method by first checking if the array is large enough to accommodate the new element. If it doesn't, create a new array with twice the size of the original array, copy the elements from the original array, and then add the new element. Otherwise just add a new element to the end of the array and increase the size variable.
5. Implement the get(int index) method, returning the element at the specified index.
6. Implement the remove(int index) method by removing the element at the specified index, shifting all subsequent elements to the left by one position, and decrementing the size variable.
7. Implement the size() method by returning the variable size.
8. Implement any other methods specified in the List interface.
9. Test all methods of MyArrayList.

#### I used in the ArrayList class the following instance variables as:
    
list - an array of type T that stores the elements of the list;

size - an integer that represents the current number of elements in the list;

arraySize - an integer that represents the current size of the array;

default_capacity - a constant integer that represents the default size of the array if no capacity is specified;
    
#### There is the solution code:
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

 
    
## MyLinkedList.java:
### Definition:
 This is a Java implementation of a singly linked list, with generic type T that extends Comparable interface, and implements the MyList interface. The MyList interface specifies a set of operations that can be performed on a list such as getting the size, adding, removing, clearing elements, and so on.
####

####
## MyList.java;
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
