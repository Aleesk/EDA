package classes.class_05;

public class Potential {
    public static int potential(int base, int exponent) {
       if (exponent == 0) return 1;
       return base * potential(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(potential(2,5));
    }

    /* base = 2
    * P(2,0) = 2 * P(0) = 2 * 1 = 2
    * P(2,1) = 2 * P(0) = 2 * 1 = 2
    * P(2,2) = 2 * P(1) = 2 * 2 = 4
    * P(2,3) = 2 * P(2) = 2 * 4 = 8
    * P(2,4) = 2 * P(3) = 2 * 8 = 16
    * P(2,5) = 2 * P(4) = 2 * 16 = 32
    * */
}
