package DataStructures;

public class Stack {

    static class Node{
        int  data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;

    public static boolean isEmpty(){
        return head== null;
    }
    //push operation
    public static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //pop operation
    public static int pop(){
        if(isEmpty()){
            System.out.println("STACK UNDERFLOW !");
        }
        int top =head.data;
        head = head.next;//remove the top node
        return top;
    }

    //peek operation;
    public static int peek(){
        if(isEmpty()){
            System.out.println("STACK IS EMPTY !");
            return -1;
        }
        return head.data;
    }

}
