package guide_01;

import java.util.Scanner;

public class DecimalToHexadecimal {
    static String formatHexadecimal(int n) {
        StringBuilder hexadecimal = new StringBuilder();
        String hexFormat = "0123456789ABCDEF";
        while (n > 0) {
            int index = n % 16;
            hexadecimal.insert(0, hexFormat.charAt(index));
            n /= 16;
        }
        return hexadecimal.toString();
    }

    public static void main(String[] a) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(formatHexadecimal(n));
        sc.close();
    }
}
