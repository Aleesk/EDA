package classes.class_05;

public class Factorial {

    public static int factorial(int n) { //O(n)
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    /*
    F(0) = 1
    F(1) = 1 * 1 = 1
    F(2) = 2 * 1 = 2
    F(3) = 3 * 2 = 6
    F(4) = 4 * 6 = 24
    F(5) = 5 * 24 = 120
    F(6) = 6 * 120 = 720
    F(7) = 7 * 720 = 5040
     */
}
