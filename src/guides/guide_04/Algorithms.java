package guides.guide_04;

import java.util.*;

public class Algorithms {

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return ((mid + 1) < arr.length && arr[mid + 1] == target) || ((mid - 1) > 0 && arr[mid - 1] == target);
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static int maxComensales(int N, int[] L, int[] S) {
        Arrays.sort(L);
        Arrays.sort(S);
        int i = 0, j = 0, curr = 0, max = 0;
        while (i < N && j < N) {
            if (L[i] < S[j]) {
                curr++;
                max = Math.max(max, curr);
                i++;
            } else {
                curr--;
                j++;
            }
        }
        return max;
    }

    public static int[] topPlayers(int N, int[] A, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(i -> A[i]));
        for (int i = 0; i < N; i++) {
            if (heap.size() < K) {
                heap.add(i);
            } else if (!heap.isEmpty() && A[i] > A[heap.peek()]) {
                heap.poll();
                heap.add(i);
            }
        }
        int[] top = new int[K];
        int i = 0;
        while (!heap.isEmpty()) top[i++] = heap.poll();

        return top;
    }

    public static int differentNumbers(int N, int[] A) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < N; i++) nums.add(A[i]);

        return nums.size();
    }

    public static boolean sumaDeDos(int N, int[] A, int K) {
        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (numeros.contains(A[i] - K)) return true;
            numeros.add(A[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{5, 7, 9, 10, 20}, 4));

        int[] L = {5, 2, 3};
        int[] S = {8, 4, 9};
        System.out.println(maxComensales(3, L, S));

        int[] arr = {10, 8, 2, 5, 20, 27, 1};
        System.out.println(Arrays.toString(topPlayers(arr.length - 1, arr, 3)));

        int[] arr1 = new int[]{10, 8, 2, 5, 8, 10, 2, 2};
        System.out.println(differentNumbers(arr1.length - 1, arr1));

        int[] arr2 = new int[]{2, 7, 11, 15, 3};
        System.out.println(sumaDeDos(arr2.length - 1, arr2, 9));
    }
}
