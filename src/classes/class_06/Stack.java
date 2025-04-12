package classes.class_06;

public class Stack {
    Node top;

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node toInsertNode = new Node(value);
        toInsertNode.next = this.top;
        this.top = toInsertNode;
    }

    public void pop () {
        if (this.top == null) {
            System.out.println("null");
            return;
        }
        System.out.println("Eliminando: " + this.top.value);
        this.top = this.top.next;
    }

    public void printList() {
        if (this.top == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node temp = this.top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(8);
        s.push(5);
        s.printList();
        s.pop();
        s.push(6);
        s.push(1);
        s.printList();
        s.pop();
        s.pop();
        s.pop();
        s.printList();
    }
}
