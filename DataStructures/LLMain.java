package DataStructures;

public class LLMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtFirst("A");
        list.addAtLast("B");
        list.addAtLast("C");
        list.displayList(); // Output: A => B => C => NULL
//        list.deleteFromFirst();
//        list.displayList(); // Output: B => C => NULL
//        list.deleteFromLast();
//        list.displayList(); // Output: B => NULL
//        System.out.println("Size: " + list.getSize());
        list.head = list.reverseRecursive(list.head);
        list.displayList();

    }
}
