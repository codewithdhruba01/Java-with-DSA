public class Factorial {
    // Recursive factorial function
    static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    // Iterative factorial for comparison
    static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Tail recursive factorial
    static int tailFactorial(int n, int accumulator) {
        if (n == 0) return accumulator;
        return tailFactorial(n - 1, n * accumulator);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("=== Factorial Calculation ===");
        System.out.println("Recursive Factorial of " + n + ": " + factorial(n));
        System.out.println("Iterative Factorial of " + n + ": " + factorialIterative(n));
        System.out.println("Tail Recursive Factorial of " + n + ": " + tailFactorial(n, 1));

        System.out.println("\n=== Factorial Series ===");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
}
