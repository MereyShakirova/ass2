public class Main {
    public static void main(String[] args) {
       /* MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(45);
        myArrayList.add(46);
        myArrayList.add(47);
        myArrayList.add(48);
        myArrayList.add(49);
        myArrayList.add(50);
        myArrayList.add(51);
        myArrayList.add(52);
        myArrayList.add(53);
        myArrayList.add(54);
        System.out.println(myArrayList);
        myArrayList.sort();
        System.out.println();
//        System.out.println(myArrayList.contains(47));
// System.out.println(myArrayList.remove(myArrayList.indexOf(56)));
//        System.out.println(myArrayList);
//        myArrayList.sort();
//        System.out.println(myArrayList);

       MyLinkedList<Integer> num = new MyLinkedList<>();
        num.add(35);
        num.add(3);
        num.add(4);
        num.add(7);
        num.add(100);
        num.add(96);
        num.add(2, 5);
        num.remove(0);
        System.out.println(num.contains(35));
        System.out.println(num.contains(3));
        num.sort();
        int index = 0;
        while (index < num.size()) {
            System.out.println(num.get(index));
            index++;*/

        MyArrayListStack<Integer> arrayListStack = new MyArrayListStack<>();
        arrayListStack.push(11);
        arrayListStack.push(21);
        arrayListStack.push(31);
        System.out.println(arrayListStack.pop());//31
        System.out.println(arrayListStack.peek());//21
        System.out.println(arrayListStack.size());//2


        MyLinkedListStack<Integer> linkedListStack =  new MyLinkedListStack<>();
        linkedListStack.push(4);
        linkedListStack.push(5);
        linkedListStack.push(11);
        linkedListStack.push(7);
        System.out.println(linkedListStack.pop());//7
        linkedListStack.push(13);
        System.out.println(linkedListStack.pop());//13
        System.out.println(linkedListStack.peek());//11
        System.out.println(linkedListStack.size());//3

    }
}
