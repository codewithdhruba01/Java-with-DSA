public class PrimeFactors {
    public static void printPrimeFactors(long n) {
        if (n == 0) {
            System.out.println("0 has no prime factors");
            return;
        }
        if (n < 0) {
            System.out.print("-1 ");
            n = Math.abs(n);
        }
        if (n == 1) {
            System.out.println("1 has no prime factors");
            return;
        }

        for (long p = 2; p * p <= n; p++) {
            while (n % p == 0) {
                System.out.print(p + " ");
                n /= p;
            }
        }
        if (n > 1) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printPrimeFactors(100);  // output: 2 2 5 5
        printPrimeFactors(17);   // output: 17
    }
}