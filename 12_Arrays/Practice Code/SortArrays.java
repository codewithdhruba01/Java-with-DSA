// Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {

        // Numeric Array
        int[] numbers = {10, 5, 2, 30, 25, 1};

        // String Array
        String[] names = {"Amit", "Aman", "Sneha", "Kiran", "Deepak"};

        // Sorting Arrays
        Arrays.sort(numbers);
        Arrays.sort(names);

        // Printing Sorted Numeric Array
        System.out.println("Sorted Numeric Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // New line for formatting
        System.out.println("\n");

        // Printing Sorted String Array
        System.out.println("Sorted String Array:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
