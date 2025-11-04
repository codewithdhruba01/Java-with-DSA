// Find the Largest and Smallest Element in an Array

public class Element {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23}; // Find the largest and smallest elements in an array
        int max = arr [0]; // Initialize max and min with the first element of the array
        int min = arr [0];

        for (int i = 1; i < arr.length; i++) { // Start from index 1 since we already used index 0 to initialize max and min
            if (arr[i] > max) //Check for Largest element
                max = arr[i];
            
            if (arr[i] < min) // Check for smallest element
                min = arr[i];
            }

            System.out.println("Largest Element: " + max); // Print the largest and smallest elements
            System.out.println("Smallest Element: " + min);
    }
}
