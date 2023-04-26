import org.w3c.dom.Node;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(45);
        myArrayList.add(46);
        myArrayList.add(47);
        myArrayList.add(48);
        myArrayList.add(49);
        myArrayList.add(50);
        myArrayList.add(31);
        System.out.println(myArrayList);
        myArrayList.remove(6);
        System.out.println(myArrayList);
        System.out.println(myArrayList.contains(47));
        System.out.println(myArrayList.remove(myArrayList.indexOf(56)));
        System.out.println(myArrayList);
        myArrayList.sort();
        System.out.println(myArrayList);
        */
        MyLinkedList<Integer> num = new MyLinkedList<>();
        num.add(35);
        num.add(3);
        num.add(4);
        num.add(7);
        num.add(100);
        num.add(2,5);
        num.remove(0);
        System.out.println(num.contains(35));
        System.out.println(num.contains(3));
        num.sort();
        int index = 0;
        while (index < num.size()){
            System.out.println(num.get(index));
            index++;
        }
    }
}