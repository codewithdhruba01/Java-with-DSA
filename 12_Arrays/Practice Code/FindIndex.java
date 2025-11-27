// Find the index of an array element

import java.util.OptionalInt;

public class FindIndex {

    public static OptionalInt findIndex(int[] my_array, int t) {
        if (my_array == null)
            return OptionalInt.empty();

        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == t) {
                return OptionalInt.of(i);
            }
        }
        return OptionalInt.empty();
    }

    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        printIndex(my_array, 25);
        printIndex(my_array, 877);
        printIndex(my_array, 29);
    }

    // Helper method to print
    public static void printIndex(int[] arr, int value) {
        OptionalInt index = findIndex(arr, value);

        if (index.isPresent()) {
            System.out.println("Index position of " + value + " is: " + index.getAsInt());
        } else {
            System.out.println("Value " + value + " not found in array.");
        }
    }
}
