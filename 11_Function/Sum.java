//Make a function to add two numbers and return the sum
import java.util.*;

public class Sum {
    public static int calculateSum(int a, int b) { // Function Definition
        int sum = a + b;
        return sum;
    }   

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter First numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum is 2 Number: " + sum);
    }
}
}
