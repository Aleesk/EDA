package classes.class_06;

public class LinkedList {
    Node head;

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }
        this.head = new Node(value, this.head);
    }

    public void printList() {
        if (this.head == null) {
            System.out.println("Esta vacia");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.printList();
        l.insertFirst(1);
        l.printList();
        l.insertFirst(4);
        l.insertFirst(7);
        l.insertFirst(12);
        l.printList();
    }
}


