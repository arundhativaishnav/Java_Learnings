package DataStructures.UsingCollectionFramework;
import java.util.*;
public class queue {
    public static void main(String[] args) {
       Queue<Integer>q = new LinkedList<Integer>();
       //we have used linkedlist bcoz queue is not a class its an interface and its obj cannot be created queue ko array and linked list implement karti hai
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
