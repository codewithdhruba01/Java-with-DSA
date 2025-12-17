public class Fibonacci {
    // Basic recursive fibonacci
    static int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Memoized fibonacci to improve performance
    static int[] memo = new int[1000];

    static int fibonacciMemo(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Check if already computed
        if (memo[n] != 0) return memo[n];

        // Compute and store
        memo[n] = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
        return memo[n];
    }

    // Iterative fibonacci
    static int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Print fibonacci series up to n terms
    static void printFibonacciSeries(int n) {
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciMemo(i) + " ");
        }
        System.out.println();
    }

    // Check if a number is fibonacci number
    static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) return true;

        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == n;
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("=== Fibonacci Examples ===");

        System.out.println("Basic Recursive Fibonacci:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println("\nMemoized Fibonacci:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciMemo(i) + " ");
        }
        System.out.println();

        System.out.println("\nIterative Fibonacci:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
        System.out.println();

        System.out.println("\n=== Performance Comparison ===");
        int testN = 40;

        // Time basic recursive (will be slow for large n)
        long startTime = System.nanoTime();
        int result1 = fibonacci(testN);
        long endTime = System.nanoTime();
        System.out.println("Basic Recursive F(" + testN + ") = " + result1 +
                          " (Time: " + (endTime - startTime) / 1000000 + " ms)");

        // Time memoized recursive
        startTime = System.nanoTime();
        int result2 = fibonacciMemo(testN);
        endTime = System.nanoTime();
        System.out.println("Memoized Recursive F(" + testN + ") = " + result2 +
                          " (Time: " + (endTime - startTime) / 1000000 + " ms)");

        // Time iterative
        startTime = System.nanoTime();
        int result3 = fibonacciIterative(testN);
        endTime = System.nanoTime();
        System.out.println("Iterative F(" + testN + ") = " + result3 +
                          " (Time: " + (endTime - startTime) / 1000000 + " ms)");

        System.out.println("\n=== Fibonacci Number Check ===");
        int[] testNumbers = {0, 1, 2, 3, 5, 8, 13, 21, 34, 4, 6, 7, 9};
        for (int num : testNumbers) {
            System.out.println(num + " is " + (isFibonacci(num) ? "" : "not ") + "a Fibonacci number");
        }
    }
}
