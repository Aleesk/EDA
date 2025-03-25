package practice;

import java.util.Arrays;

public class OrderArrays {

    public static void order() {
        int[] A = {12, 42, 31, 41, 39, 23, 25, 55, 85};
        int count = 0;

        for (int i = 0; i < A.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
                count++;
            }
        }
        System.out.println("Ordenado: " + Arrays.toString(A));
        System.out.println("Contador de intercambios: " + count);
    }
}
