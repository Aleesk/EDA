package classes.class_06;

public class Queue {
    Node head;
    Node tail;

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }

    public void enqueue(int value) {
        Node nodeToInsert = new Node(value);
        if (this.head == null) {
            this.head = nodeToInsert;
            this.tail = nodeToInsert;
        }
        this.tail.setNext(nodeToInsert);
        this.tail = nodeToInsert;
    }

    public int dequeue() {
        int nodeToDequeue = this.head.value;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return nodeToDequeue;
    }

    public void printList() {
        if (this.head == null) {
            System.out.println("Esta vacio");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Queue l = new Queue();
        l.printList();
        l.enqueue(1);
        l.enqueue(4);
        System.out.println("Eliminando: " + l.dequeue());
        l.printList();
        l.enqueue(7);
        l.enqueue(12);
        l.printList();
        System.out.println("Eliminando: " + l.dequeue());
        System.out.println("Eliminando: " + l.dequeue());
        System.out.println("Eliminando: " + l.dequeue());
        System.out.println("Eliminando: " + l.dequeue());
        l.printList();
    }
}
