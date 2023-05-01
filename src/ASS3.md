# Assignment 3 for  laboratory work for the Algorithm Data Structure
![Assignment 3](https://avatars.mds.yandex.net/i?id=85c7a1aec44a18feaf285883e555bc5800eb8003-8496986-images-thumbs&n=13)
#### !Description!:
## Main:
## MyArrayListStack.java:
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
## MyArrayListQueque.java:
## MyLinkedListQueque.java:
