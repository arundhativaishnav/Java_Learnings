package DataStructures;

public class Queue {
    static class queue{
        static int arr[];
        private static int size;
        static int rear = -1;
        static int front = -1;

        queue(int n){
            arr = new int[n];
            this.size= n;
        }
        public static boolean isEmpty(){
            return rear == -1;

        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("QUEUE IS FULL !");
                return;
            }
            rear++;
            arr[rear]= data;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];

//jab pehla element remove hoga tab jagah khali hogi isiliye baki ke elements age push karne honge
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            return front;
        }


    }

    public static void main(String[] args) {
            queue q = new queue(5);
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
    }

}
