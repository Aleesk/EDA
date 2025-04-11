package guides.guide_01;

import java.util.Scanner;

public class Palindrome {

    static boolean palindrome(int n) {
        int palindrome = 0, temp = n;
        while (temp > 0) {
            palindrome = palindrome * 10 + temp % 10;
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
