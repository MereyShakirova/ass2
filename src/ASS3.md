# Assignment 3 for  laboratory work for the Algorithm Data Structure
![Assignment 3](https://avatars.mds.yandex.net/i?id=85c7a1aec44a18feaf285883e555bc5800eb8003-8496986-images-thumbs&n=13)
#### !Description!:
## Main:
## MyArrayListStack.java:
### In MyArrayListStack, the following tasks had to be done:
Stack Implementation:
1. Create a new class named MyLinkedListStack for the MyLinkedList implementation or MyArrayListStack for the MyArrayList implementation.
2. Import the necessary classes: java.util.EmptyStackException for the stack exceptions, and MyLinkedList or MyArrayList from the previous tasks.
3. Declare an instance variable of type MyLinkedList or MyArrayList inside the class.
4. Create a constructor for the class and initialize the instance variable.
5. Implement the push method that adds an element to the top of the stack using the addFirst method for MyLinkedList or add method for MyArrayList.
6. Implement the pop method that removes and returns the top element of the stack using the removeFirst method for MyLinkedList or remove method for MyArrayList.
7. Implement the peek method that returns the top element of the stack without removing it using the getFirst method for MyLinkedList or get method for MyArrayList.
8. Implement the isEmpty method that returns true if the stack is empty or false if it is not using the isEmpty method for MyLinkedList or MyArrayList.
9. Implement the size method that returns the number of elements in the stack using the size method for MyLinkedList or MyArrayList.
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
### There is the solution code:
                public T pop(int i){
                    if(stack.isEmpty()) {
                        throw new EmptyStackException();
                    }
                    return stack.remove(stack.size() - 1);
                }
                public T peek(int i){
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

## MyLinkedListStack.java:
        import java.util.EmptyStackException;
        import java.util.LinkedList;
        public class MyLinkedListStack<T> {
            private LinkedList<T> list;
            public MyLinkedListStack(){
                list = new LinkedList<>();
            }
            public void push(T element) {
                list.addFirst(element);
            }
            public T pop(){
                if(list.isEmpty()){
                    throw new EmptyStackException();
                }
                return list.removeFirst();
            }
            public T peek(){
                if(list.isEmpty()){
                    throw new EmptyStackException();
                }
                return list.getFirst();
            }
            public boolean isEmpty(){
                return list.isEmpty();
            }
            public int size(){
                return list.size();
            }
        
        }

## MyArrayListQueque.java:

## MyLinkedListQueque.java:
