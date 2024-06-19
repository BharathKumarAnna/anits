package stackandqueue;

class Node {
 int data;
 Node next;

 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

class CircularLinkedList {
 private Node head;

 public CircularLinkedList() {
     this.head = null;
 }

 public void insertAtBeginning(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         newNode.next = head;
     } else {
         newNode.next = head;
         Node current = head;
         while (current.next != head) {
             current = current.next;
         }
         current.next = newNode;
         head = newNode;
     }
 }

 
 public void display() {
     if (head == null) {
         System.out.println("Circular Linked List is empty");
         return;
     }
     Node current = head;
     do {
         System.out.print(current.data + " ");
         current = current.next;
     } while (current != head);
     System.out.println();
 }
}

public class Main2 {
 public static void main(String[] args) {
     CircularLinkedList cll = new CircularLinkedList();
     
     
     cll.insertAtBeginning(5);
     cll.insertAtBeginning(10);
     cll.insertAtBeginning(15);
     cll.insertAtBeginning(20);

     System.out.println("Circular Linked List:");
     cll.display();
 }
}

