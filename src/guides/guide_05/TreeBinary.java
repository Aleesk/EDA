package guides.guide_05;

public class TreeBinary {

    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;
    int size;

    public TreeBinary() {
        this.root = null;
        size = 0;
    }

    Node insert(Node root, int value) {
        if (root == null) {
            size++;
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    void insert(int value) {
        root = insert(root, value);
    }

    void PreOrder(Node node) {
        if (node == null) return; // Retorna si el nodo es nulo
        System.out.println(node.value); // Imprime el valor del nodo actual
        PreOrder(node.left); // Procesa los nodos hijos al lado izquierdo hasta encontrar una hoja
        PreOrder(node.right); // Procesa los nodos hijos al lado derecho hasta encontrar una hoja
    }

    void InOrder(Node node) {
        if (node == null) return; // Retorna si el nodo es nulo
        InOrder(node.left); // Procesa los nodos hijos al lado izquierdo hasta encontrar una hoja
        System.out.println(node.value); // Imprime el valor del nodo actual
        InOrder(node.right); // Procesa los nodos hijos al lado derecho hasta encontrar una hoja
    }

    void PostOrder(Node node) {
        if (node == null) return; // Retorna si el nodo es nulo
        PostOrder(node.left); // Procesa los nodos hijos al lado izquierdo hasta encontrar una hoja
        PostOrder(node.right); // Procesa los nodos hijos al lado derecho hasta encontrar una hoja
        System.out.println(node.value); // Imprime el valor del nodo actual
    }

    int sum(Node node) {
        if (node == null) return 0;
        return node.value + sum(node.left) + sum(node.right);
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15};
        TreeBinary tree = new TreeBinary();
        for (int i : arr) {
            tree.insert(i);
        }
        System.out.println("Tamaño: " + tree.size);
        System.out.println("Pre-order:"); // 8 4 2 1 3 6 5 7 12 10 9 11 14 13 15
        tree.PreOrder(tree.root);
        System.out.println("In-order:"); // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        tree.InOrder(tree.root);
        System.out.println("Post-order:"); // 1 3 2 5 7 6 4 9 11 10 13 15 14 12 8
        tree.PostOrder(tree.root);
        System.out.println("Suma: " + tree.sum(tree.root)); // 120
    }
}
