import org.w3c.dom.Node;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(45);
        myArrayList.add(46);
        myArrayList.add(47);
        myArrayList.add(48);
        myArrayList.add(49);
        myArrayList.add(50);
        myArrayList.add(31);
        myArrayList.remove(6);
        myArrayList.remove(46);
        System.out.println(myArrayList.contains(47));
        System.out.println(myArrayList.remove(myArrayList.indexOf(56)));
        System.out.println(myArrayList);
        myArrayList.sort();
        System.out.println(myArrayList);

    }
}