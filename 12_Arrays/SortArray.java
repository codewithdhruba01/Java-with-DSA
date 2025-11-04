// Sort the array manually (without using Arrays.sort()).

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        for (int i = 0; i < arr.length - 1; i++) { // Traverse through all array elements
            for (int j = i + 1; j < arr.length; j++) { // Compare the current element with the rest of the elements
                if (arr[i] > arr[j]) { // Swap if the element found is greater than the current element
                    int temp = arr[i]; // Swap operation
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int num : arr) { // Print the sorted array
            System.out.print(num + " "); 
        }
    }
}
