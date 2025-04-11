package guides.guide_01;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {
    static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        while (n > 1) {
            for (int j = 2; true; j++) {
                if (n % j == 0) {
                    factors.add(j);
                    n /= j;
                    break;
                }
            }
        }
        return factors;
    }

    public static void main(String[] a) {
        System.out.print("Entrada: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        ArrayList<Integer> primes = primeFactors(num);
        System.out.print("Salida: {");
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i));
            if (i < primes.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
