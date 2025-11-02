import java.util.*;

public class Factorial {
    public static void  calculateFactorial(int n) { // Function Definition

        if (n < 0) { // Check for negative input
            System.out.println("not defined for negative numbers.");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) { // Loop to calculate factorial
            factorial = factorial * i;
        }
        System.out.println("Factorial is: " + factorial); // Print Result
    }   

    public static void main(String args[]) { // Main Method
        Scanner sc = new Scanner(System.in); // Scanner Object
        System.out.print("Enter a number to find its factorial: "); 
        int n = sc.nextInt(); // Input Number
        calculateFactorial(n); // Function Call
    }
}
