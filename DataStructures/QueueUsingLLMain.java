package DataStructures;

public class QueueUsingLLMain {
    public static void main(String[] args) {
        Queue.queue q = new Queue.queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(6);
        q.add(7);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
