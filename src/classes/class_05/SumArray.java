package classes.class_05;

public class SumArray {
    public static int sumArray(int[] array, int i) {
        if (i == array.length) return 0;
        return array[i] + sumArray(array, i + 1);
    }
}
