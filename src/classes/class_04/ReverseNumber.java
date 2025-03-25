package classes.class_04;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Your number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String reverseN = "";
        while (n > 0) {
            reverseN += n % 10;
            n /= 10;
        }
        System.out.println("Reverse Number: " + reverseN);
        scanner.close();
    }
}
