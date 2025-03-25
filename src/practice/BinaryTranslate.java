package practice;

import java.util.Scanner;

public class BinaryTranslate {

    public static void translate() {
        System.out.println("Your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String binary = String.valueOf(n % 2);

        while (n / 2 > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        System.out.println(binary);
    }
}
