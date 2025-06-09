package guides.guide_03;

import java.util.Arrays;

public class MissingNumber {

    public static int numeroFaltante(int N, int[] arreglo) {
        int total = N * (N + 1) / 2;
        for (int val : arreglo) {
            total -= val;
        }
        return total;
    }

    public static int numeroFaltanteBinarySearch(int[] arr) {
        Arrays.sort(arr); // O(n log n)

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == mid + 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,10,2,3,4,5,6,8,9};
        System.out.println("Sin ordenar: " + numeroFaltante(10, arr));
        System.out.println("Ordenamiento y Busqueda binaria " + numeroFaltanteBinarySearch(arr));
    }
}
