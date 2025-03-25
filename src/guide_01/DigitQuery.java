package guide_01;

import java.util.Scanner;

public class DigitQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada: ");
        int q = sc.nextInt();
        int[] qis = new int[q];
        for (int i = 0; i < q; i++) {
            qis[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Salida: ");
        for (int i = 0; i < q; i++) {
            System.out.println(findDigit(qis[i]));
        }
    }

    static int findDigit(int qi) {
        int length = 1;
        long count = 9;
        long start = 1;

        while (qi > length * count) {
            qi -= (int) (length * count);
            length++;
            count *= 10;
            start *= 10;
        }

        long num = start + (qi - 1) / length;
        int digitIndex = (qi - 1) % length;
        return String.valueOf(num).charAt(digitIndex) - '0';
    }
}
