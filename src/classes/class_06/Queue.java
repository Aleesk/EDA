package classes.class_06;

public class Queue {
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    Node head;
    Node tail;

    public void enqueue(int value) {
        Node toEnQueueNode = new Node(value);
        if (this.head == null) {
            this.head = toEnQueueNode;
            this.tail = toEnQueueNode;
            return;
        }
        this.tail.next = toEnQueueNode;
        this.tail = toEnQueueNode;
    }

    public int dequeue() {
        int toDeQueueNodeValue = this.head.value;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return toDeQueueNodeValue;
    }

    public void printList() {
        if (this.head == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node aux = this.head;
        while (aux != null) {
            System.out.println(aux.value);
            aux = aux.next;
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
