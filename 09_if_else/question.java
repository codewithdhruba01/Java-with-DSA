//Write a  program to check whather a number is Even or odd.

import java.util.*;

public class question {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        if (x % 2 == 0){
            System.out. println("Even");
        }
        else {
            System.out.print("Odd");
        }
    }
}