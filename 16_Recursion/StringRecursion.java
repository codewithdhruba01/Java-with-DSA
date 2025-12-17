public class StringRecursion {
    // 1. Print all characters of string
    static void printString(String str, int index) {
        // Base case
        if (index == str.length()) return;

        // Print current character
        System.out.print(str.charAt(index) + " ");
        printString(str, index + 1);
    }

    // 2. Reverse a string
    static String reverseString(String str) {
        // Base case
        if (str.isEmpty()) return str;

        // Recursive case: last char + reverse of remaining string
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    // 3. Check if string is palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base case
        if (start >= end) return true;

        // Check if characters match
        if (str.charAt(start) != str.charAt(end)) return false;

        // Recurse for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    // Wrapper for palindrome check
    static boolean isPalindrome(String str) {
        if (str == null) return false;
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Clean string
        return isPalindrome(str, 0, str.length() - 1);
    }

    // 4. Count occurrences of a character
    static int countChar(String str, char ch, int index) {
        // Base case
        if (index == str.length()) return 0;

        // Count current character + recurse
        int count = (str.charAt(index) == ch) ? 1 : 0;
        return count + countChar(str, ch, index + 1);
    }

    // Wrapper for countChar
    static int countChar(String str, char ch) {
        return countChar(str, ch, 0);
    }

    // 5. Remove all occurrences of a character
    static String removeChar(String str, char ch) {
        // Base case
        if (str.isEmpty()) return str;

        // If current char matches, skip it
        if (str.charAt(0) == ch) {
            return removeChar(str.substring(1), ch);
        } else {
            // Keep current char and recurse
            return str.charAt(0) + removeChar(str.substring(1), ch);
        }
    }

    // 6. Generate all subsequences (power set)
    static void generateSubsequences(String str, int index, String current) {
        // Base case: reached end of string
        if (index == str.length()) {
            System.out.print("\"" + current + "\" ");
            return;
        }

        // Exclude current character
        generateSubsequences(str, index + 1, current);

        // Include current character
        generateSubsequences(str, index + 1, current + str.charAt(index));
    }

    // Wrapper for generateSubsequences
    static void generateSubsequences(String str) {
        generateSubsequences(str, 0, "");
    }

    // 7. Generate all permutations
    static void generatePermutations(String str, int left, int right) {
        // Base case: single character or fully permuted
        if (left == right) {
            System.out.print(str + " ");
            return;
        }

        // Fix each character at position 'left' and recurse
        for (int i = left; i <= right; i++) {
            // Swap characters
            str = swap(str, left, i);

            // Recurse for next position
            generatePermutations(str, left + 1, right);

            // Backtrack (swap back)
            str = swap(str, left, i);
        }
    }

    // Helper function to swap characters
    static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    // Wrapper for generatePermutations
    static void generatePermutations(String str) {
        generatePermutations(str, 0, str.length() - 1);
    }

    // 8. Convert string to integer (atoi)
    static int stringToInt(String str, int index, int result) {
        // Base case
        if (index == str.length()) return result;

        // Convert char to digit and add to result
        int digit = str.charAt(index) - '0';
        return stringToInt(str, index + 1, result * 10 + digit);
    }

    // Wrapper for stringToInt
    static int stringToInt(String str) {
        return stringToInt(str, 0, 0);
    }

    public static void main(String[] args) {
        System.out.println("=== String Recursion Examples ===\n");

        String testStr = "Hello";
        char testChar = 'l';

        // 1. Print string characters
        System.out.println("1. Characters in \"" + testStr + "\":");
        printString(testStr, 0);
        System.out.println();

        // 2. Reverse string
        System.out.println("\n2. Reverse of \"" + testStr + "\": " + reverseString(testStr));

        // 3. Palindrome check
        System.out.println("\n3. Palindrome check:");
        String[] palindromeTests = {"radar", "level", "hello", "A man a plan a canal Panama", "12321", "abc"};
        for (String str : palindromeTests) {
            System.out.println("\"" + str + "\" is " + (isPalindrome(str) ? "" : "not ") + "a palindrome");
        }

        // 4. Count character occurrences
        System.out.println("\n4. Count occurrences of '" + testChar + "' in \"" + testStr + "\": " + countChar(testStr, testChar));

        // 5. Remove character
        System.out.println("\n5. Remove '" + testChar + "' from \"" + testStr + "\": " + removeChar(testStr, testChar));

        // 6. Generate subsequences
        String smallStr = "abc";
        System.out.println("\n6. All subsequences of \"" + smallStr + "\":");
        generateSubsequences(smallStr);
        System.out.println();

        // 7. Generate permutations
        String permStr = "abc";
        System.out.println("\n7. All permutations of \"" + permStr + "\":");
        generatePermutations(permStr);
        System.out.println();

        // 8. String to integer
        System.out.println("\n8. String to integer:");
        String[] numStrings = {"123", "4567", "0", "999"};
        for (String numStr : numStrings) {
            System.out.println("\"" + numStr + "\" -> " + stringToInt(numStr));
        }

        System.out.println("\n=== Complexity Analysis ===");
        System.out.println("Reverse String: O(n) time, O(n) space");
        System.out.println("Palindrome Check: O(n) time, O(1) space");
        System.out.println("Subsequences: O(2^n) time, O(n) space");
        System.out.println("Permutations: O(n!) time, O(n) space");
    }
}
