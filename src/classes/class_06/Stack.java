package classes.class_06;

public class Stack {
    Node top;

    public static class Node{
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

    public void push(int value) {
        Node toPushNode = new Node(value);
        toPushNode.next = this.top;
        this.top = toPushNode;
    }

    public int pop() {
        if (this.top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int topValue = this.top.value;
        this.top = this.top.next;
        return topValue;
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
        System.out.println("Eliminado:" + s.pop());
        s.push(6);
        s.push(1);
        s.printList();
        System.out.println("Eliminado:" + s.pop());
        System.out.println("Eliminado:" + s.pop());
        System.out.println("Eliminado:" + s.pop());
        s.printList();
    }
}
