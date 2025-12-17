import java.util.*;

public class AdvancedBitManipulation {
    // 1. Generate all subsets using bit manipulation
    static void generateSubsets(int[] arr) {
        int n = arr.length;
        int totalSubsets = 1 << n; // 2^n

        System.out.println("All subsets of " + Arrays.toString(arr) + ":");
        for (int mask = 0; mask < totalSubsets; mask++) {
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }
    }

    // 2. Generate all subsets and calculate their sums
    static void subsetSum(int[] arr) {
        int n = arr.length;
        int totalSubsets = 1 << n;

        System.out.println("Subset sums:");
        for (int mask = 0; mask < totalSubsets; mask++) {
            int sum = 0;
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                    sum += arr[i];
                }
            }
            System.out.println("} = " + sum);
        }
    }

    // 3. Check if subset sum exists
    static boolean subsetSumExists(int[] arr, int target) {
        int n = arr.length;
        int totalSubsets = 1 << n;

        for (int mask = 0; mask < totalSubsets; mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                }
            }
            if (sum == target)
                return true;
        }
        return false;
    }

    // 4. Find all pairs with given XOR
    static List<int[]> findPairsWithXOR(int[] arr, int targetXOR) {
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = num ^ targetXOR;
            if (seen.contains(complement)) {
                pairs.add(new int[] { Math.min(num, complement), Math.max(num, complement) });
            }
            seen.add(num);
        }

        return pairs;
    }

    // 5. Maximum XOR of two numbers in array
    static int findMaximumXOR(int[] nums) {
        int maxXOR = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                maxXOR = Math.max(maxXOR, nums[i] ^ nums[j]);
            }
        }
        return maxXOR;
    }

    // 6. Bitwise AND of numbers in range [left, right]
    static int rangeBitwiseAnd(int left, int right) {
        while (right > left) {
            right = right & (right - 1); // Remove rightmost set bit
        }
        return left & right;
    }

    // 7. Single Number II (every element appears three times except one)
    static int singleNumberII(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    // 8. Single Number III (every element appears twice except two)
    static int[] singleNumberIII(int[] nums) {
        // Get XOR of the two single numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Find rightmost set bit
        int rightmostSetBit = xor & -xor;

        // Divide numbers into two groups
        int group1 = 0, group2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                group1 ^= num;
            } else {
                group2 ^= num;
            }
        }

        return new int[] { group1, group2 };
    }

    // 9. Counting bits for numbers from 0 to n
    static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    // 10. Find the difference (one string is one char different from another)
    static char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;
    }

    // 11. Gray Code generation
    static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int totalCodes = 1 << n;

        for (int i = 0; i < totalCodes; i++) {
            result.add(i ^ (i >> 1));
        }

        return result;
    }

    // 12. Bit manipulation for permutations
    static void generatePermutations(int[] arr) {
        int n = arr.length;
        int totalPerms = 1;
        for (int i = 1; i <= n; i++)
            totalPerms *= i;

        System.out.println("All permutations using bit manipulation:");
        for (int mask = 0; mask < totalPerms; mask++) {
            int[] perm = Arrays.copyOf(arr, n);
            int tempMask = mask;
            for (int i = 0; i < n; i++) {
                int factorial = 1;
                for (int j = 1; j <= n - 1 - i; j++)
                    factorial *= j;

                int index = tempMask / factorial;
                System.out.print(perm[index] + " ");
                // Remove the used element
                for (int j = index; j < n - 1 - i; j++) {
                    perm[j] = perm[j + 1];
                }
                tempMask %= factorial;
            }
            System.out.println();
        }
    }

    // 13. Find duplicate in array (numbers from 1 to n, one duplicate)
    static int findDuplicate(int[] nums) {
        int duplicate = 0;
        for (int num : nums) {
            int bitPosition = Math.abs(num) - 1;
            if ((duplicate & (1 << bitPosition)) != 0) {
                return Math.abs(num);
            }
            duplicate |= (1 << bitPosition);
        }
        return -1; // Should not reach here
    }

    // 14. Minimum bit flips to convert number
    static int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        return Integer.bitCount(xor);
    }

    // 15. Check if number is sparse (no two adjacent 1s)
    static boolean isSparse(int n) {
        return (n & (n >> 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println("=== Advanced Bit Manipulation ===\n");

        // Subset generation
        int[] arr = { 1, 2, 3 };
        generateSubsets(arr);
        System.out.println();

        subsetSum(arr);
        System.out.println();

        // Subset sum check
        System.out.println("Does subset sum to 5 exist? " + subsetSumExists(arr, 5));
        System.out.println("Does subset sum to 7 exist? " + subsetSumExists(arr, 7));
        System.out.println();

        // XOR pairs
        int[] xorArr = { 1, 2, 3, 4, 5 };
        List<int[]> xorPairs = findPairsWithXOR(xorArr, 6); // 1^7=6, 2^4=6, 3^5=6, etc.
        System.out.println("Pairs with XOR 6:");
        for (int[] pair : xorPairs) {
            System.out.println(Arrays.toString(pair));
        }
        System.out.println();

        // Maximum XOR
        int[] maxXorArr = { 3, 10, 5, 25, 2, 8 };
        System.out.println("Maximum XOR in array: " + findMaximumXOR(maxXorArr));
        System.out.println();

        // Range bitwise AND
        System.out.println("Bitwise AND of range [5, 7]: " + rangeBitwiseAnd(5, 7));
        System.out.println("Bitwise AND of range [10, 15]: " + rangeBitwiseAnd(10, 15));
        System.out.println();

        // Single Number II (appears once, others thrice)
        int[] singleIIArr = { 2, 2, 3, 2 };
        System.out.println("Single number II in [2,2,3,2]: " + singleNumberII(singleIIArr));

        int[] singleIIArr2 = { 0, 1, 0, 1, 0, 1, 99 };
        System.out.println("Single number II in [0,1,0,1,0,1,99]: " + singleNumberII(singleIIArr2));
        System.out.println();

        // Single Number III (two numbers appear once)
        int[] singleIIIArr = { 1, 2, 1, 3, 2, 5 };
        int[] singles = singleNumberIII(singleIIIArr);
        System.out.println("Single numbers III in [1,2,1,3,2,5]: " + singles[0] + " and " + singles[1]);
        System.out.println();

        // Counting bits
        int[] bitCounts = countBits(10);
        System.out.println("Bit counts from 0 to 10:");
        for (int i = 0; i < bitCounts.length; i++) {
            System.out.println(i + ": " + bitCounts[i] + " bits");
        }
        System.out.println();

        // Find the difference
        System.out.println("Extra character in 'abcd' vs 'abcde': " + findTheDifference("abcd", "abcde"));
        System.out.println();

        // Gray code
        List<Integer> grayCodes = grayCode(3);
        System.out.println("Gray codes for 3 bits: " + grayCodes);
        System.out.println();

        // Find duplicate
        int[] dupArr = { 1, 3, 4, 2, 2 };
        System.out.println("Duplicate in [1,3,4,2,2]: " + findDuplicate(dupArr));
        System.out.println();

        // Min bit flips
        System.out.println("Bit flips needed to convert 10 to 7: " + minBitFlips(10, 7));
        System.out.println("Bit flips needed to convert 3 to 4: " + minBitFlips(3, 4));
        System.out.println();

        // Sparse numbers
        int[] sparseTests = { 5, 8, 9, 10, 16 };
        System.out.println("Sparse number check:");
        for (int num : sparseTests) {
            System.out.println(num + " is sparse: " + isSparse(num));
        }
    }
}
