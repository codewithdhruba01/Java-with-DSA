// Take a matrix as input from the user. Search for a given number x and point the indices at which it occurs.

import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take matrix size input
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Step 2: Take matrix elements input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 3: Take the number to search
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();

        // Step 4: Search the number in the matrix
        boolean found = false;
        System.out.println("Number " + x + " found at indices:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("(" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        // Step 5: If not found
        if (!found) {
            System.out.println("Number not found in the matrix.");
        }

        sc.close();
    }
}
