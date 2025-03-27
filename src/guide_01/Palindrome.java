package guide_01;

import java.util.Scanner;

public class Palindrome {

    static boolean palindrome(int n) {
        int palindrome = 0, count = 0, temp = n;
        while (temp > 0) {
            temp/=10;
            count++;
        }
        temp = n;
        while (temp > 0) {
            palindrome += (int) ((temp % 10) * (Math.pow(10, (count--) - 1)));
            temp /= 10;
        }
        return palindrome == n;
    }

    public static void main(String[] args) {
        System.out.println("Input your number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(palindrome(sc.nextInt()));
        sc.close();
    }
}
