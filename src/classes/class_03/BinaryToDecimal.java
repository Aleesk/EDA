package classes.class_03;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Your binary code: ");
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int decimal = 0, pow = 0;
        for (int i = binary.length() - 1; i >=0; i--) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                decimal += (int) Math.pow(2, pow);
            } else if (digit != '0') {
                System.out.println("Error: please enter a valid binary number (1,0)");
                sc.close();
                return;
            }
            pow++;
        }
        System.out.println("Decimal: " + decimal);
        sc.close();
    }
}
