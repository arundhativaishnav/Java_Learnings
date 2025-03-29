package DataStructures;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        static class queue {
            static Node head = null;
            static Node tail = null;


            public static boolean isEmpty() {
                return head == null && tail == null;

            }


            public static void add(int data) {
                Node newNode = new Node(data);
                if (tail == null) {
                    tail = head = newNode;
                    return;
                }
                tail.next = newNode;
                tail = newNode;

            }

            public static int remove() {
                if (isEmpty()) {
                    return -1;
                }
                int front = head.data;
                if (head == tail) {
                    tail = null;
                }
                head = head.next;

                return front;
            }

            public static int peek() {
                if (isEmpty()) {
                    return -1;
                }

                return head.data;
            }


        }
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
}

