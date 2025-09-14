//Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}
