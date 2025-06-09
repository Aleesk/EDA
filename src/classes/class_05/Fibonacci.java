package classes.class_05;

public class Fibonacci {
    public static int fibonacci(int n) { // O
        if (n == 0 || n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        /*
        * F(0) = 1
        * F(1) = 1
        * F(2) = F(1) + F(0) = 1 + 1 = 2
        * F(3) = F(2) + F(1) = 2 + 1 = 3
        * F(4) = F(3) + F(2) = 3 + 2 = 5
        * F(5) = F(4) + F(3) = 5 + 3 = 8
        * F(6) = F(5) + F(4) = 8 + 5 = 13
        * F(7) = F(6) + F(5) = 13 + 8 = 21
        * F(8) = F(7) + F(6) = 21 + 13 = 34
        */
    }
}
