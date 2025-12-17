# Sorting Algorithms in Java

Sorting is the process of arranging elements in a specific order (ascending or descending). There are many sorting algorithms, each with different time/space complexities and use cases.

## Classification of Sorting Algorithms

### 1. **Comparison-based Sorting**
   - Compare elements to determine order
   - Examples: Bubble, Selection, Insertion, Merge, Quick, Heap sort

### 2. **Non-comparison-based Sorting**
   - Don't compare elements directly
   - Examples: Counting, Radix, Bucket sort

### 3. **Stable vs Unstable Sorting**
   - **Stable**: Preserves relative order of equal elements
   - **Unstable**: May change relative order of equal elements

### 4. **In-place vs Out-of-place Sorting**
   - **In-place**: Uses constant extra space O(1)
   - **Out-of-place**: Uses additional space O(n)

## Sorting Algorithms Comparison

| Algorithm | Time Complexity | Space Complexity | Stable | In-place | Best For |
|-----------|----------------|------------------|--------|----------|----------|
| Bubble Sort | O(n²) | O(1) | Yes | Yes | Small arrays, educational |
| Selection Sort | O(n²) | O(1) | No | Yes | Small arrays |
| Insertion Sort | O(n²) | O(1) | Yes | Yes | Nearly sorted arrays |
| Merge Sort | O(n log n) | O(n) | Yes | No | Large arrays, linked lists |
| Quick Sort | O(n log n) avg, O(n²) worst | O(log n) | No | Yes | General purpose |
| Heap Sort | O(n log n) | O(1) | No | Yes | Large arrays, priority queues |
| Counting Sort | O(n + k) | O(k) | Yes | No | Small range integers |
| Radix Sort | O(n * d) | O(n + k) | Yes | No | Large range integers |
| Bucket Sort | O(n + k) | O(n + k) | Yes | No | Uniform distribution |

## Bubble Sort

**Idea**: Repeatedly swap adjacent elements if they are in wrong order.

```java
public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

**Time Complexity**: O(n²)
**Space Complexity**: O(1)
**Stable**: Yes
**Best Case**: O(n) when already sorted

## Selection Sort

**Idea**: Find minimum element and place it at beginning.

```java
public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
```

**Time Complexity**: O(n²)
**Space Complexity**: O(1)
**Stable**: No

## Insertion Sort

**Idea**: Build sorted array one element at a time.

```java
public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
```

**Time Complexity**: O(n²) worst, O(n) best
**Space Complexity**: O(1)
**Stable**: Yes

## Merge Sort

**Idea**: Divide and conquer - divide array into halves, sort them, then merge.

```java
public class MergeSort {
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
}
```

**Time Complexity**: O(n log n)
**Space Complexity**: O(n)
**Stable**: Yes

## Quick Sort

**Idea**: Choose pivot, partition array around pivot.

```java
public class QuickSort {
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
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
}
```

**Time Complexity**: O(n log n) average, O(n²) worst
**Space Complexity**: O(log n)
**Stable**: No

## Heap Sort

**Idea**: Build max heap, repeatedly extract maximum element.

```java
public class HeapSort {
    static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}
```

**Time Complexity**: O(n log n)
**Space Complexity**: O(1)
**Stable**: No

## Counting Sort

**Idea**: Count occurrences of each element, use counts to place elements.

```java
public class CountingSort {
    static void countingSort(int[] arr) {
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[n];

        // Count occurrences
        for (int num : arr) {
            count[num - min]++;
        }

        // Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy back to original array
        System.arraycopy(output, 0, arr, 0, n);
    }
}
```

**Time Complexity**: O(n + k) where k is range
**Space Complexity**: O(n + k)
**Stable**: Yes

## Radix Sort

**Idea**: Sort by individual digits starting from least significant digit.

```java
public class RadixSort {
    static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences of digits
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        // Cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back
        System.arraycopy(output, 0, arr, 0, n);
    }
}
```

**Time Complexity**: O(n * d) where d is number of digits
**Space Complexity**: O(n + k)
**Stable**: Yes

## Bucket Sort

**Idea**: Distribute elements into buckets, sort each bucket, concatenate.

```java
public class BucketSort {
    static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // Create buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Distribute elements into buckets
        for (float num : arr) {
            int bucketIndex = (int) (n * num);
            buckets[bucketIndex].add(num);
        }

        // Sort each bucket
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate buckets
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }
}
```

**Time Complexity**: O(n + k) average case
**Space Complexity**: O(n + k)
**Stable**: Yes

## Which Sorting Algorithm to Use?

### For Small Arrays (n ≤ 20)
- **Insertion Sort** or **Selection Sort**

### For General Purpose
- **Quick Sort** (fastest in practice)
- **Merge Sort** (stable, predictable)

### When Stability Matters
- **Merge Sort**, **Bubble Sort**, **Insertion Sort**

### For Limited Memory
- **Quick Sort**, **Heap Sort**, **Selection Sort**

### For Known Range
- **Counting Sort**, **Radix Sort**

### For Nearly Sorted Data
- **Insertion Sort**

## Interview Questions

1. **Implement different sorting algorithms**
2. **Compare time/space complexities**
3. **When to use which sorting algorithm**
4. **Stable vs unstable sorting**
5. **In-place sorting algorithms**
6. **External sorting** (for large files)

## Practice Problems

1. **Sort Array by Parity** (LeetCode 905)
2. **Sort Colors** (LeetCode 75) - Dutch National Flag
3. **Kth Largest Element** (LeetCode 215)
4. **Top K Frequent Elements** (LeetCode 347)
5. **Merge Intervals** (LeetCode 56)
6. **Sort List** (LeetCode 148) - Linked list sorting
7. **Maximum Gap** (LeetCode 164)

## Key Takeaways

- Know trade-offs between different algorithms
- Quick Sort is fastest in practice despite O(n²) worst case
- Merge Sort is stable and good for linked lists
- Use built-in sort functions in production code
- Understand when to implement custom sorting
- Consider stability requirements

Mastering sorting algorithms is fundamental to understanding algorithms and data structures!
