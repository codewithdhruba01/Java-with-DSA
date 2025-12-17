public class BitOperations {
    // 1. Check if number is even or odd
    static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    // 2. Check if number is power of 2
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // 3. Count set bits (Hamming weight) - Basic method
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    // 4. Count set bits - Brian Kernighan's algorithm (Optimized)
    static int countSetBitsOptimized(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // Remove rightmost set bit
            count++;
        }
        return count;
    }

    // 5. Get ith bit
    static boolean getBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    // 6. Set ith bit
    static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // 7. Clear ith bit
    static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // 8. Toggle ith bit
    static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }

    // 9. Find position of rightmost set bit
    static int rightmostSetBitPosition(int n) {
        if (n == 0) return -1;
        return Integer.numberOfTrailingZeros(n) + 1;
    }

    // 10. Find rightmost set bit value
    static int rightmostSetBit(int n) {
        return n & -n;
    }

    // 11. Check if ith bit is set
    static boolean isBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    // 12. Swap two numbers using XOR
    static void swapXOR(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    // 13. Add two numbers without using +
    static int addWithoutPlus(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    // 14. Multiply by 7 without using *
    static int multiplyBy7(int n) {
        return (n << 3) - n; // 8n - n = 7n
    }

    // 15. Absolute value without Math.abs
    static int abs(int n) {
        int mask = n >> 31; // -1 for negative, 0 for positive
        return (n ^ mask) - mask;
    }

    // 16. Check if two numbers have opposite signs
    static boolean oppositeSigns(int x, int y) {
        return (x ^ y) < 0;
    }

    // 17. Find missing number in array [1..n]
    static int findMissingNumber(int[] arr, int n) {
        int expectedXOR = 0;
        int actualXOR = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            expectedXOR ^= i;
        }

        // XOR all elements in array
        for (int num : arr) {
            actualXOR ^= num;
        }

        return expectedXOR ^ actualXOR;
    }

    // 18. Find single number (every element appears twice except one)
    static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    // 19. Reverse bits of a number
    static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        return result;
    }

    // 20. Check if number is power of 4
    static boolean isPowerOfFour(int n) {
        // Check if n is power of 2 and (n & 0xAAAAAAAA) == 0
        // 0xAAAAAAAA = 10101010101010101010101010101010 in binary
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xAAAAAAAA) == 0;
    }

    // 21. Count total set bits from 1 to n
    static int countTotalSetBits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += countSetBitsOptimized(i);
        }
        return count;
    }

    // 22. Find two non-repeating numbers in array where others appear twice
    static int[] findTwoSingleNumbers(int[] nums) {
        // Get XOR of all elements (will give XOR of two single numbers)
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Find rightmost set bit in xor
        int rightmostSetBit = xor & -xor;

        // Divide numbers into two groups based on rightmost set bit
        int group1 = 0, group2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                group1 ^= num;
            } else {
                group2 ^= num;
            }
        }

        return new int[]{group1, group2};
    }

    public static void main(String[] args) {
        System.out.println("=== Bit Operations Examples ===\n");

        // Test basic operations
        int a = 10, b = 5; // 10 = 1010, 5 = 0101
        System.out.println("Numbers: a = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("         b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");

        System.out.println("\n=== Basic Bitwise Operations ===");
        System.out.println("a & b  = " + (a & b) + " (AND)");
        System.out.println("a | b  = " + (a | b) + " (OR)");
        System.out.println("a ^ b  = " + (a ^ b) + " (XOR)");
        System.out.println("~a     = " + (~a) + " (NOT)");
        System.out.println("a << 1 = " + (a << 1) + " (Left shift)");
        System.out.println("a >> 1 = " + (a >> 1) + " (Right shift)");
        System.out.println("a >>> 1= " + (a >>> 1) + " (Unsigned right shift)");

        System.out.println("\n=== Bit Manipulation Functions ===");
        int testNum = 29; // 11101 in binary
        System.out.println("Test number: " + testNum + " (binary: " + Integer.toBinaryString(testNum) + ")");

        System.out.println("Is even: " + isEven(testNum));
        System.out.println("Is power of 2: " + isPowerOfTwo(testNum));
        System.out.println("Set bits count: " + countSetBits(testNum));
        System.out.println("Set bits count (optimized): " + countSetBitsOptimized(testNum));

        System.out.println("\nBit operations on bit 3:");
        System.out.println("Get bit 3: " + getBit(testNum, 3));
        System.out.println("Set bit 3: " + setBit(testNum, 3) + " (" + Integer.toBinaryString(setBit(testNum, 3)) + ")");
        System.out.println("Clear bit 3: " + clearBit(testNum, 3) + " (" + Integer.toBinaryString(clearBit(testNum, 3)) + ")");
        System.out.println("Toggle bit 3: " + toggleBit(testNum, 3) + " (" + Integer.toBinaryString(toggleBit(testNum, 3)) + ")");

        System.out.println("\nRightmost set bit:");
        System.out.println("Position: " + rightmostSetBitPosition(testNum));
        System.out.println("Value: " + rightmostSetBit(testNum));

        System.out.println("\n=== Advanced Operations ===");
        System.out.println("Add without +: 15 + 27 = " + addWithoutPlus(15, 27));
        System.out.println("Multiply by 7: 6 * 7 = " + multiplyBy7(6));
        System.out.println("Absolute value: abs(-15) = " + abs(-15));
        System.out.println("Opposite signs: 10 and -5 = " + oppositeSigns(10, -5));
        System.out.println("Opposite signs: 10 and 5 = " + oppositeSigns(10, 5));

        System.out.println("\n=== Array Problems ===");
        int[] arr1 = {1, 2, 4, 5, 6}; // Missing 3
        System.out.println("Missing number in [1,2,4,5,6]: " + findMissingNumber(arr1, 6));

        int[] arr2 = {2, 3, 2, 4, 4, 3, 5}; // 5 appears once
        System.out.println("Single number in [2,3,2,4,4,3,5]: " + findSingleNumber(arr2));

        int[] arr3 = {2, 4, 2, 6, 4, 8, 6}; // 8 and 4 appear once? Wait, let me fix this
        int[] arr4 = {1, 2, 1, 3, 2, 5}; // 3 and 5 appear once
        int[] singles = findTwoSingleNumbers(arr4);
        System.out.println("Two single numbers in [1,2,1,3,2,5]: " + singles[0] + " and " + singles[1]);

        System.out.println("\n=== Bit Tricks ===");
        System.out.println("Reverse bits of 10: " + reverseBits(10) + " (binary: " + Integer.toBinaryString(reverseBits(10)) + ")");
        System.out.println("Is 16 power of 4: " + isPowerOfFour(16));
        System.out.println("Is 8 power of 4: " + isPowerOfFour(8));
        System.out.println("Total set bits from 1 to 10: " + countTotalSetBits(10));
    }
}
