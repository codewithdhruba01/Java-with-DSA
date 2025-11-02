//Make a function to multiply two numbers and return the product
import java.util.*;

public class Multiply {
    public static int calculateProduct(int a, int b) { // Function Definition
        return a * b; // Return the product directly
    }   

    public static void main(String args[]) { // Main Method
        Scanner sc = new Scanner(System.in); // Scanner Object
        System.out.print("Enter First numbers: "); 
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Product of 2 Number: " + calculateProduct(a, b) ); // Function Call and print
    }
    
}
