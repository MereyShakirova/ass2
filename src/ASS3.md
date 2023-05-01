# **Assignment 3 for  laboratory work for the Algorithm Data Structure**
![Assignment 3](https://avatars.mds.yandex.net/i?id=cf6c6e5540c3601c2b4487c9f16936d041f0bdd3-9053088-images-thumbs&n=13)
### Description:
!(*If the students haven't implemented their own MyLinkedList and MyArrayList classes, they can use the built-in LinkedList and ArrayList classes provided by Java.*)!
## Main class:
*In Main class I tested the code with different way, like push, pop and so on to test, prove the code*
#### *Here is test code:*
## **Stack implementation**

![Assignment 3](https://avatars.mds.yandex.net/i?id=99a1593845e819a1ebfec4fd9732229a78c4fbbd-7550039-images-thumbs&n=13)

### In MyArrayListStack and MyLinkedListStack, the following tasks had to be done:

*1. Create a new class named MyLinkedListStack for the MyLinkedList implementation or MyArrayListStack for the MyArrayList implementation.*
    
*2. Import the necessary classes: java.util.EmptyStackException for the stack exceptions, and MyLinkedList or MyArrayList from the previous tasks.*

*3. Declare an instance variable of type MyLinkedList or MyArrayList inside the class.*
    
*4. Create a constructor for the class and initialize the instance variable.*
    
*5. Implement the push method that adds an element to the top of the stack using the addFirst method for MyLinkedList or add method for MyArrayList.*
    
*6. Implement the pop method that removes and returns the top element of the stack using the removeFirst method for MyLinkedList or remove method for MyArrayList.*
    
*7. Implement the peek method that returns the top element of the stack without removing it using the getFirst method for MyLinkedList or get method for MyArrayList.*
    
*8. Implement the isEmpty method that returns true if the stack is empty or false if it is not using the isEmpty method for MyLinkedList or MyArrayList.*
    
*9. Implement the size method that returns the number of elements in the stack using the size method for MyLinkedList or MyArrayList.*

### MyArrayListStack.java:
#### *Here is the solution code*:
        import java.util.ArrayList;
        import java.util.EmptyStackException;
        public class MyArrayListStack<T> {
        private ArrayList<T> stack;
            public MyArrayListStack() {
                stack =new ArrayList<>();
            }
            public void push(T element){
                stack.add(element);
            }
    
            public T pop(){
                if(stack.isEmpty()) {
                    throw new EmptyStackException();
                }
                return stack.remove(stack.size() - 1);
            }
            public T peek(){
                if(stack.isEmpty()){
                    throw new EmptyStackException();
                }
                return stack.get(stack.size()-1);
            }
            public boolean isEmpty(int T){
                return stack.isEmpty();
            }
            public int size() {
                return stack.size();
            }

        }



### MyLinkedListStack.java:
#### *Here is the solution code*:
        import java.util.EmptyStackException;
        import java.util.LinkedList;
        public class MyLinkedListStack<T> {
        private LinkedList<T> stack;
            public MyLinkedListStack(){
                stack = new LinkedList<>();
            }
            public void push(T element) {
                stack.addFirst(element);
            }
            public T pop(){
                if(stack.isEmpty()){
                    throw new EmptyStackException();
                }
                return stack.removeFirst();
            }
            public T peek(){
                if(stack.isEmpty()){
                    throw new EmptyStackException();
            }
                return stack.getFirst();
            }
            public boolean isEmpty(){
                return stack.isEmpty();
            }
            public int size(){
                return stack.size();
            }
            
        }


## **Queue Implementation**
![Assignment 3](https://tse3.mm.bing.net/th?id=OIP.ojQqXtfstcULPnw1aAaapgHaEK&pid=15.1)
### In MyArrayListQueue and MyLinkedListQueue the following tasks had to be done:

*1. Create a new class named MyLinkedListQueue for the MyLinkedList implementation or MyArrayListQueue for the MyArrayList implementation.*
    
*2. Import the necessary classes: java.util.NoSuchElementException for the queue exceptions, and MyLinkedList or MyArrayList from the previous tasks.*
    
*3. Declare an instance variable of type MyLinkedList or MyArrayList inside the class.*
    
*4. Create a constructor for the class and initialize the instance variable.*
    
*5. Implement the enqueue method that adds an element to the back of the queue using the addLast method for MyLinkedList or add method for MyArrayList.*
    
*6. Implement the dequeue method that removes and returns the front element of the queue using the removeFirst method for MyLinkedList or remove method for MyArrayList.*
    
*7. Implement the peek method that returns the front element of the queue without removing it using the getFirst method for MyLinkedList or get method for MyArrayList.*
    
*8. Implement the isEmpty method that returns true if the queue is empty or false if it is not using the isEmpty method for MyLinkedList or MyArrayList.*
    
*9. Implement the size method that returns the number of elements in the queue using the size method for MyLinkedList or MyArrayList.*

### MyArrayListQueque.java:
#### *Here is the solution code*:
    import java.util.ArrayList;
    import java.util.NoSuchElementException;
    public class MyArrayListQueque<T> {
        private ArrayList<T> queue;
        public MyArrayListQueque() {
            queue = new ArrayList<>();
        }
        public void enqueue(T element){
            queue.add(element);
        }
        public T dequeue(){
            if(queue.isEmpty()){
                throw new NoSuchElementException();
        }
            return queue.remove(0);
        }
        public T peek() {
            if(queue.isEmpty()){
                throw new NoSuchElementException();
        }
            return queue.get(0);
        }
        public boolean isEmpty(){
            return queue.isEmpty();
        }
        public int size(){
            return queue.size();
        }
        
    }





### MyLinkedListQueque.java:
#### *Here is the solution code*:
    import java.util.LinkedList;
    import java.util.NoSuchElementException;
    public class MyLinkedListQueque<T> {
        private LinkedList<T> queue;
        public MyLinkedListQueque() {
            queue = new LinkedList<>();
        }
        public void enqueue(T element){
            queue.addLast(element);
        }
        public T dequeue() {
            if(queue.isEmpty()){
                throw new NoSuchElementException();
        }
            return queue.removeFirst();
        }
        public T peek(){
            if(queue.isEmpty()){
                throw new NoSuchElementException();
        }
            return queue.getFirst();
        }
        public boolean isEmpty(){
            return queue.isEmpty();
        }
        public int size(){
            return queue.size();
        }
    }


