//Write a program that takes a month number (1–12) and prints the month name and how many days it has.

import java.util.Scanner;

public class question3 {
    public static void main (String args []){
        Scanner  sc = new Scanner (System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch(month){
            case 1 : System.out.println("January - 31 days");
                break;
            case 2: System.out.println("February - 28 days (29 in leap years)");
                break;
            case 3: System.out.println("march - 31 days");
                break;
            case 4: System.out.println("Aprile - 30 days");
                break;
            case 5: System.out.println("May - 31 days");
                break;
            case 6: System.out.println("June - 30 days");
                break;
            case 7: System.out.println("July - 31");
                break;
            case 8: System.out.println("Agust - 31 days");
                break;
            case 9: System.out.println("September - 30 days");
                break;
            case 10: System.out.println("October - 31 days");
                break;
            case 11: System.out.println("November - 30 days");
                break;
            case 12: System.out.println("December - 31 days");
                break;
            default: System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }
    }
}
