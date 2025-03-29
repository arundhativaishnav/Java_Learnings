package DataStructures.UsingCollectionFramework;
import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("A");
        list.addFirst("B");
        System.out.println(list);
        list.addLast("C");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.print("NULL");

        list.removeFirst();
        System.out.println(list);




    }
}
