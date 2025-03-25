package ayudantia;

import java.util.Arrays;
import java.util.Scanner;

public class Ayudantia_01 {
    static void order() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del arreglo: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Ingrese los numeros enteros: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print((i+1) + ": ");
            array[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
                count++;
            }
        }
        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
        System.out.print("Modificaciones: " + count);
        sc.close();
    }

    static void invert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
        int invert = 0, count = 0, temp = n;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        while (n > 0) {
            invert += (int) ((n % 10) * Math.pow(10, (count--) - 1));
            n /= 10;
        }
        System.out.print("Invert Number: " + invert);
    }

    public static void main(String[] a) {
        System.out.print("Exercise?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                order();
                break;
            case 2:
                invert();
                break;
            default:
                System.out.print("Error: Exercise not found...");
                break;
        }
    }
}
