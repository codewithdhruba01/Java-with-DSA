//Check if a number is palindrome (same forward & backward).

public class palindrome {
    public static void main(String[] args) {
        int n = 121; // number to check
        int originalNumber = n; // store original number
        int reversedNumber = 0; // to store reversed number

        while (n != 0) {
            int digit = n % 10; // last digit
            reversedNumber = reversedNumber * 10 + digit; //reversed number
            n = n / 10; // remove last digit
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}