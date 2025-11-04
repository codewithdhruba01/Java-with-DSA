import java.util.*;

public class Multiply {
    public static int calculateProduct(int a, int b) {
        return a * b; // Return the product directly
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Product of 2 numbers: " + calculateProduct(a, b));
        }
    }
}

