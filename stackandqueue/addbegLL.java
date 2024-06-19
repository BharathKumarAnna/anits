package stackandqueue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class addbegLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertAtBeginning(3);
        list.insertAtBeginning(7);
        list.insertAtBeginning(1);
        
        System.out.println("Linked List after insertion:");
        list.printList();
    }
}

