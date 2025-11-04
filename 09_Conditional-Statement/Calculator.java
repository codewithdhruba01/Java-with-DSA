// Write a program in java to make a simple Calculator using if else statement.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter First Number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter Operator: ");
        char operator = sc.next().charAt(0);

        double result;

          if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            sc.close();
            return;
        }
        System.out.println("The result is: " + result);
        sc.close();
    }
}
}
