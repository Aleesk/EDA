package guides.guide_02;

public class RotateMatrix {
    public static void rotateMatrix(int[][] M, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        for (int i = 0; i < (fin - inicio); i++) {
            int temp = M[inicio][inicio + i];
            M[inicio][inicio + i] = M[fin - i][inicio];
            M[fin - i][inicio] = M[fin][fin - i];
            M[fin][fin - i] = M[inicio + i][fin];
            M[inicio + i][fin] = temp;
        }

        rotateMatrix(M, inicio + 1, fin - 1);
    }

    public static void print(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            System.out.print("{");
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j]);
                if (j < M[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }
}
