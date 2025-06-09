package guides.guide_02;

public class RotateArray {
    public static void rotateArray(int[] A, int K) {
        if (K == 0) return;
        int last = A[A.length - 1];
        for (int i = A.length - 1; i > 0; --i) {
            A[i] = A[i - 1];
        }
        A[0] = last;
        rotateArray(A, K - 1);
    }

    public static void print(int[] M) {
        System.out.print("{");
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i]);
            if (i < M.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        print(A);
        rotateArray(A, 1);
        print(A);
    }
}
