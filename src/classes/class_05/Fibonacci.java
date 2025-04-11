package classes.class_05;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*
    F(0) = 1
    F(1) = 1
    F(2) = 1 + 1 = 2
    F(3) = 2 + 1 = 3
    F(4) = 3 + 2 = 5
    F(5) = 5 + 3 = 8
    F(6) = 8 + 5 = 13
    F(7) = 13 + 8 = 21
    F(8) = 21 + 13 = 34
    F(9) = 34 + 21 = 55
    F(10) = 55 + 34 = 89
     */
}
