package DataStructures.Trees;

import static javax.swing.Spring.height;

public class binarySearchTree {
    public class Node {
        private int value ;
        private Node right;
        private Node left;
        private  int height;

        public Node(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public int getheight(Node node ){
       if(node==null){
           return -1;
       }
       return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void display(){
        display(root, "Root Node:");
    }
    private void display(Node node , String details){
        if(root==null){
            return ;
        }
        System.out.println(details + node.getValue());
        display(node.left ,"this is left child of" +node.getValue()+ " : ");
        display(node.right ,"this is right child of" +node.getValue()+ " : ");

    }
    public void insert(int  value){

    }
    private Node insert(int value , Node node){
        if(node==null){
             node = new Node(value);
            return  node;
        }
        if(value< node.value){
            node.left = insert(value , node.left);
        }
        if(value> node.value){
            node.right = insert(value , node.right);
        }
        node.height = Math.max(getheight(node.left), (getheight(node.right)) + 1);
        return node;
    }
    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(getheight(node.left) - getheight(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        display(this.root , "Root node :");
    }

    private void display(Node node , String details){
        if(node ==null){
            return ;
        }
        System.out.println(details + node.value);
    }
}
