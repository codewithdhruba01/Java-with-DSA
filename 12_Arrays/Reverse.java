// Print array elements in reverse order.

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Sample array

        System.out.println("Reverse Order:"); // Print elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--) { // Start from the last index to the first
            System.out.print(arr[i] + " "); // Print each element
        }
    }
}
