package classes.class_06;

public class LinkedList {
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

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node head;

    public void insertFirst(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }
        this.head = new Node(value, this.head);
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

    public void eliminarRepetidos() {
        Node aux1 = this.head;
        Node aux2 = this.head.getNext();
        while (aux1 != null) {
            if (aux1.value == aux2.value) {
                aux1.setNext(aux2.getNext());
                if (aux2.getNext() != null)
                    aux2.setNext(aux2.getNext().getNext());
            }
            aux1 = aux1.getNext();
            aux2 = aux2.getNext();
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertFirst(1);
        l.insertFirst(1);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertFirst(1);
        l.printList();
        System.out.println("----+----+----");
        l.eliminarRepetidos();
        l.printList();
    }
}


