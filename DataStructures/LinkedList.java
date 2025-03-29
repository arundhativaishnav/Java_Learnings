package DataStructures;

public class LinkedList {
    Node head;
    private int size;

    public LinkedList() {
        this.head = null; // Initialize head to null
        this.size = 0;    // Initialize size to 0
    }

    public class Node {
        Node next;
        String data; // Use lowercase for variable names

        public Node(String data) { // Constructor should take data as a parameter
            this.data = data;
            this.next = null;
        }
    }

    // Add operations
    public void addAtFirst(String data) {
        Node newNode = new Node(data); // Pass data to the Node constructor
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtLast(String data) {
        Node newNode = new Node(data); // Pass data to the Node constructor
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
    }

    // Delete operations
    public void deleteFromFirst() {
        if (head == null) {
            System.out.println("THE LIST IS EMPTY!");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteFromLast() {
        if (head == null) {
            System.out.println("THE LIST IS EMPTY!");
            return;
        }
        if (head.next == null) {
            head = null; // If there's only one node
        } else {
            Node secondLastNode = head;
            Node lastNode = head.next;
            while (lastNode.next != null) { // Find the last node
                secondLastNode = secondLastNode.next;
                lastNode = lastNode.next;
            }
            secondLastNode.next = null; // Remove the last node
        }
        size--;
    }

    public void reverseIterate() {
        if (head == null) return; // Handle empty list
        Node currNode = head; // Start with head
        Node prevNode = null; // Previous node starts as null
        while (currNode != null) {
            Node nextNode = currNode.next; // Store the next node
            currNode.next = prevNode; // Reverse the link
            prevNode = currNode; // Move prevNode to current
            currNode = nextNode; // Move to the next node
        }
        head = prevNode; // Update head to the new front of the list
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) { // Base case
            return head; // Return head if empty or single node
        }
        Node newHead = reverseRecursive(head.next); // Recursive call
        head.next.next = head; // Reverse the link
        head.next = null; // Set the next of the current node to null
        return newHead; // Return the new head of the reversed list
    }

    public void displayList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " => "); // Print data
            currNode = currNode.next; // Move to the next node
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }
}

