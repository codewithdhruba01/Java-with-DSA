
import java.util.*;


public class Factorial {
    public static void  calculateFactorial(int n) { // Function Definition
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial is: " + factorial);
    }   

    public static void main(String args[]) { // Main Method
        Scanner sc = new Scanner(System.in); // Scanner Object
        System.out.print("Enter a number to find its factorial: "); 
        int n = sc.nextInt();

       
    }
}
