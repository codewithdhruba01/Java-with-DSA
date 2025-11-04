// Write a program to check wheather a number is leep year or not
import java.util.Scanner;

public class leepyear {
    public static void main (String[] args){
        try (Scanner x = new Scanner(System.in)) {

        System.out.print("Enter Year: ");
        int year = x.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
}
