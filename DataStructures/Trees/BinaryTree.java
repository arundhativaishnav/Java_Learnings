package DataStructures.Trees;

import java.util.Scanner;

//
public class BinaryTree {
    public BinaryTree() {
    }

    private static class Node{
        int value;
        Node left ;
        Node right;
        //constructer to initialize the values
        public Node(int value) {
            this.value = value; // Corrected this line
            this.left = null;
            this.right = null;
        }
    }
    private Node root;
    //insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner , root);//recursion

    }
    private void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter left of " + node.value + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the  left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner , node.left);//recursive call

        }
        System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if(right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);//recursive call
        }
    }
    public void display(){
        display(root, "");
    }
    private void display(Node node , String indent){
        if(node==null){
           return ;
        }
        System.out.println(indent + node.value);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");

    }
    public void prettyDisplay(){
        prettyDisplay(root , 0);
    }
    public void prettyDisplay(Node node , int level ){
        if(node==null){
            return;
        }
        prettyDisplay(node.right , level+1);
        if(level!=0){
            for(int i=0 ; i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|--------->" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left , level +1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}
