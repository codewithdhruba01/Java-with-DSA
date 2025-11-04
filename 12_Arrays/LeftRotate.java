// Rotate all elements of the array to the left by one place.

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Sample array
        int temp = arr[0]; // Store the first element

        for (int i = 0; i < arr.length - 1; i++) { // Shift elements to the left
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp; // Place the first element at the end

        System.out.print("After Rotation: "); 
        for (int num : arr) { // Print the rotated array
            System.out.print(num + " ");
        }
    }
}
