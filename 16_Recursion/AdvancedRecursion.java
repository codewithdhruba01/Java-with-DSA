import java.util.Arrays;

public class AdvancedRecursion {
    // 1. Recursive Binary Search
    static int binarySearch(int[] arr, int target, int low, int high) {
        // Base case: element not found
        if (low > high) return -1;

        // Calculate mid
        int mid = low + (high - low) / 2;

        // Base case: element found
        if (arr[mid] == target) return mid;

        // If target is smaller, search left half
        if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1);
        }
        // If target is larger, search right half
        else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }

    // Wrapper for binary search
    static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    // 2. Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    // 3. Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(arr, low, high);

            // Sort left and right partitions
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // 4. Generate all subsets (Power Set)
    static void generateSubsets(int[] arr, int index, java.util.List<Integer> current) {
        // Base case: processed all elements
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Exclude current element
        generateSubsets(arr, index + 1, current);

        // Include current element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);
        current.remove(current.size() - 1); // Backtrack
    }

    // Wrapper for generateSubsets
    static void generateSubsets(int[] arr) {
        generateSubsets(arr, 0, new java.util.ArrayList<>());
    }

    // 5. Solve N-Queens Problem
    static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check diagonal (left upper)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check diagonal (right upper)
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    static boolean solveNQueens(char[][] board, int row, int n) {
        // Base case: all queens placed
        if (row == n) return true;

        // Try placing queen in each column of current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                // Place queen
                board[row][col] = 'Q';

                // Recurse for next row
                if (solveNQueens(board, row + 1, n)) return true;

                // Backtrack: remove queen
                board[row][col] = '.';
            }
        }

        return false;
    }

    static void printBoard(char[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Advanced Recursion Examples ===\n");

        // 1. Binary Search
        System.out.println("1. Recursive Binary Search:");
        int[] sortedArr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        System.out.println("Array: " + Arrays.toString(sortedArr));
        int index = binarySearch(sortedArr, target);
        System.out.println("Target " + target + " found at index: " + index);

        // 2. Merge Sort
        System.out.println("\n2. Merge Sort:");
        int[] unsortedArr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original: " + Arrays.toString(unsortedArr));
        mergeSort(unsortedArr, 0, unsortedArr.length - 1);
        System.out.println("Sorted: " + Arrays.toString(unsortedArr));

        // 3. Quick Sort
        System.out.println("\n3. Quick Sort:");
        int[] quickArr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original: " + Arrays.toString(quickArr));
        quickSort(quickArr, 0, quickArr.length - 1);
        System.out.println("Sorted: " + Arrays.toString(quickArr));

        // 4. Generate Subsets
        System.out.println("\n4. All subsets:");
        int[] subsetArr = {1, 2, 3};
        generateSubsets(subsetArr);

        // 5. N-Queens Problem
        System.out.println("\n5. N-Queens Problem (4x4):");
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        if (solveNQueens(board, 0, n)) {
            System.out.println("Solution found:");
            printBoard(board, n);
        } else {
            System.out.println("No solution exists");
        }

        System.out.println("=== Time Complexities ===");
        System.out.println("Binary Search: O(log n)");
        System.out.println("Merge Sort: O(n log n)");
        System.out.println("Quick Sort: O(n log n) average, O(n²) worst");
        System.out.println("Subsets Generation: O(2^n)");
        System.out.println("N-Queens: O(n!) in worst case");
    }
}
