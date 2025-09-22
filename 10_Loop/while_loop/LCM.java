//Find the LCM (Least Common Multiple) of two numbers.

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Find GCD
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;

        // LCM formula
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }
}