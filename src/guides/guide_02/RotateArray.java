package guides.guide_02;

public class RotateArray {
    public static void rotateArray(int[] A, int K) {
        if (K == 0) return;
        int last = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[0] = last;
        rotateArray(A, K - 1);
    }
}
