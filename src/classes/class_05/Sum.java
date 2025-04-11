package classes.class_05;

public class Sum {
    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    /*
    * S(0) = 0
    * S(1) = 1 + 0 = 1
    * S(2) = 2 + 1 = 3
    * S(3) = 3 + 3 = 6
    * S(4) = 4 + 6 = 10
    * S(5) = 5 + 10 = 15
    * S(6) = 6 + 15 = 21
    * S(7) = 7 + 21 = 28
    * S(8) = 8 + 28 = 36
    * S(9) = 9 + 36 = 45
    * S(10) = 10 + 45 = 55
    * */
}
