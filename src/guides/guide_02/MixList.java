package guides.guide_02;

public class MixList {
    Node head;

    MixList() {
        this.head = null;
    }

    public static class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }

        Node(int x, Node n) {
            this.value = x;
            this.next = n;
        }
    }

    public Node mezclarListas(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node result;
        if (head1.value <= head2.value) {
            result = head1;
            result.next = mezclarListas(head1.next, head2);
        } else {
            result = head2;
            result.next = mezclarListas(head2.next, head1);
        }
        return result;
    }

    void printList() {
        if (this.head == null) {
            System.out.println("está vacía");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> null");
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        MixList list1 = new MixList();
        list1.insertLast(3);
        list1.insertLast(5);
        list1.insertLast(7);
        list1.insertLast(9);

        MixList list2 = new MixList();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(8);
        list2.insertLast(12);

        System.out.println("Lista 1:");
        list1.printList();
        System.out.println("Lista 2:");
        list2.printList();

        MixList listaMezclada = new MixList();
        listaMezclada.head = listaMezclada.mezclarListas(list1.head, list2.head);

        // Imprimimos la lista mezclada
        System.out.println("Lista mezclada:");
        listaMezclada.printList();
    }
}
