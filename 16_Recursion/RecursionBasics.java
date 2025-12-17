public class RecursionBasics {
    // 1. Sum of first N natural numbers
    static int sumNaturalNumbers(int n) {
        // Base case
        if (n == 0)
            return 0;

        // Recursive case: n + sum of (n-1) numbers
        return n + sumNaturalNumbers(n - 1);
    }

    // 2. Power function (x^n)
    static int power(int x, int n) {
        // Base case
        if (n == 0)
            return 1;

        // Recursive case: x * x^(n-1)
        return x * power(x, n - 1);
    }

    // 3. Optimized power using exponentiation by squaring
    static int fastPower(int x, int n) {
        // Base case
        if (n == 0)
            return 1;

        // If n is even
        if (n % 2 == 0) {
            int halfPower = fastPower(x, n / 2);
            return halfPower * halfPower;
        }
        // If n is odd
        else {
            return x * fastPower(x, n - 1);
        }
    }

    // 4. Sum of digits
    static int sumOfDigits(int n) {
        // Base case
        if (n == 0)
            return 0;

        // Recursive case: last digit + sum of remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }

    // 5. Reverse a number
    static int reverseNumber(int n, int reversed) {
        // Base case
        if (n == 0)
            return reversed;

        // Recursive case: build reversed number
        int lastDigit = n % 10;
        return reverseNumber(n / 10, reversed * 10 + lastDigit);
    }

    // Wrapper function for reverse
    static int reverseNumber(int n) {
        return reverseNumber(n, 0);
    }

    // 6. Count digits
    static int countDigits(int n) {
        // Base case
        if (n == 0)
            return 0;

        // Recursive case: 1 + count of remaining digits
        return 1 + countDigits(n / 10);
    }

    // 7. Check if number is palindrome
    static boolean isPalindrome(int n, int original, int reversed) {
        // Base case
        if (n == 0)
            return original == reversed;

        // Recursive case
        int lastDigit = n % 10;
        return isPalindrome(n / 10, original, reversed * 10 + lastDigit);
    }

    // Wrapper for palindrome check
    static boolean isPalindrome(int n) {
        if (n < 0)
            return false; // Negative numbers are not palindromes
        return isPalindrome(n, n, 0);
    }

    // 8. Print numbers from N to 1
    static void printNTo1(int n) {
        // Base case
        if (n == 0)
            return;

        // Print current number, then recurse
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    // 9. Print numbers from 1 to N
    static void print1ToN(int n) {
        // Base case
        if (n == 0)
            return;

        // Recurse first, then print
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    // 10. Check if array is sorted
    static boolean isSorted(int[] arr, int index) {
        // Base case: reached end of array or single element
        if (index >= arr.length - 1)
            return true;

        // Check current pair and recurse
        if (arr[index] > arr[index + 1])
            return false;

        return isSorted(arr, index + 1);
    }

    // Wrapper for isSorted
    static boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    public static void main(String[] args) {
        System.out.println("=== Recursion Basics Examples ===\n");

        // Sum of natural numbers
        System.out.println("1. Sum of first N natural numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Sum of first " + i + " numbers: " + sumNaturalNumbers(i));
        }

        System.out.println("\n2. Power function (2^n):");
        for (int i = 0; i <= 10; i++) {
            System.out.println("2^" + i + " = " + power(2, i));
        }

        System.out.println("\n3. Fast Power (optimized):");
        for (int i = 0; i <= 10; i++) {
            System.out.println("2^" + i + " = " + fastPower(2, i));
        }

        System.out.println("\n4. Sum of digits:");
        int[] testNumbers = { 123, 4567, 890123, 0, 5 };
        for (int num : testNumbers) {
            System.out.println("Sum of digits of " + num + ": " + sumOfDigits(num));
        }

        System.out.println("\n5. Reverse numbers:");
        for (int num : testNumbers) {
            if (num != 0) {
                System.out.println("Reverse of " + num + ": " + reverseNumber(num));
            }
        }

        System.out.println("\n6. Count digits:");
        for (int num : testNumbers) {
            System.out.println(num + " has " + countDigits(num) + " digits");
        }

        System.out.println("\n7. Palindrome check:");
        int[] palindromeTests = { 121, 12321, 12345, 1, 0, 1221, 123 };
        for (int num : palindromeTests) {
            System.out.println(num + " is " + (isPalindrome(num) ? "" : "not ") + "a palindrome");
        }

        System.out.println("\n8. Print N to 1:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Print " + i + " to 1: ");
            printNTo1(i);
            System.out.println();
        }

        System.out.println("\n9. Print 1 to N:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Print 1 to " + i + ": ");
            print1ToN(i);
            System.out.println();
        }

        System.out.println("\n10. Check if array is sorted:");
        int[][] testArrays = {
                { 1, 2, 3, 4, 5 }, // sorted
                { 5, 4, 3, 2, 1 }, // reverse sorted
                { 1, 3, 2, 4, 5 }, // not sorted
                { 1 }, // single element
                {} // empty array
        };

        for (int i = 0; i < testArrays.length; i++) {
            boolean sorted = testArrays[i].length == 0 ? true : isSorted(testArrays[i]);
            System.out.println("Array " + java.util.Arrays.toString(testArrays[i]) +
                    " is " + (sorted ? "" : "not ") + "sorted");
        }
    }
}
