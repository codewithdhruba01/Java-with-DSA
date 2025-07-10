import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);
    }
}
