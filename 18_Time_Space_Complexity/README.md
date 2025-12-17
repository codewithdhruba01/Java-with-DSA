# Time and Space Complexity Analysis

Understanding time and space complexity is crucial for writing efficient algorithms and performing well in technical interviews.

## What is Time Complexity?

Time complexity measures how the runtime of an algorithm grows with the input size. It helps us understand:

- How fast an algorithm runs
- How it scales with larger inputs
- Which algorithm to choose for different scenarios

## Big O Notation

Big O notation describes the upper bound of an algorithm's growth rate.

### Common Time Complexities

| Complexity | Name | Example |
|------------|------|---------|
| O(1) | Constant | Array access, HashMap lookup |
| O(log n) | Logarithmic | Binary search, BST operations |
| O(n) | Linear | Linear search, single loop |
| O(n log n) | Linearithmic | Merge sort, Quick sort |
| O(n²) | Quadratic | Bubble sort, Nested loops |
| O(n³) | Cubic | Matrix multiplication |
| O(2^n) | Exponential | Subset generation, Tower of Hanoi |
| O(n!) | Factorial | Traveling salesman, permutations |

## Analyzing Time Complexity

### 1. O(1) - Constant Time
```java
int getFirstElement(int[] arr) {
    return arr[0]; // Always takes same time regardless of array size
}
```

### 2. O(log n) - Logarithmic Time
```java
int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}
// Each iteration reduces search space by half
```

### 3. O(n) - Linear Time
```java
int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) max = arr[i];
    }
    return max;
}
// Time grows linearly with input size
```

### 4. O(n²) - Quadratic Time
```java
void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
            }
        }
    }
}
// Nested loops create quadratic complexity
```

### 5. O(n log n) - Linearithmic Time
```java
void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}
// Divide and conquer with logarithmic divisions and linear merges
```

## Space Complexity

Space complexity measures how much memory an algorithm uses relative to input size.

### Common Space Complexities

| Complexity | Description | Example |
|------------|-------------|---------|
| O(1) | Constant space | Few variables |
| O(n) | Linear space | Arrays, lists proportional to input |
| O(n²) | Quadratic space | 2D arrays, adjacency matrices |
| O(log n) | Logarithmic space | Recursion stack |

## Analyzing Space Complexity

### O(1) Space
```java
boolean isEven(int n) {
    return n % 2 == 0; // Only uses constant extra space
}
```

### O(n) Space
```java
int[] copyArray(int[] arr) {
    int[] copy = new int[arr.length]; // Space proportional to input
    for (int i = 0; i < arr.length; i++) {
        copy[i] = arr[i];
    }
    return copy;
}
```

### O(n²) Space
```java
int[][] createAdjacencyMatrix(int vertices) {
    return new int[vertices][vertices]; // 2D array for graph representation
}
```

## Recursion and Stack Space

```java
int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
// O(n) stack space due to recursion depth
```

## Best Case, Average Case, Worst Case

### Linear Search
```java
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}
```
- **Best Case**: O(1) - Element found at first position
- **Average Case**: O(n) - Element found in middle
- **Worst Case**: O(n) - Element not found or at last position

### Quick Sort
```java
// Worst case O(n²) when pivot is always smallest/largest element
// Average case O(n log n) with good pivot selection
// Best case O(n log n) when pivot divides array evenly
```

## Amortized Analysis

Some operations are expensive but infrequent. Amortized analysis averages cost over many operations.

### Dynamic Array (ArrayList)
- Individual operations: O(1) amortized
- Resize operations: O(n) but happen infrequently
- Overall: O(1) amortized time per operation

## Common Algorithm Complexities

| Algorithm | Time Complexity | Space Complexity |
|-----------|----------------|------------------|
| Linear Search | O(n) | O(1) |
| Binary Search | O(log n) | O(1) |
| Bubble Sort | O(n²) | O(1) |
| Selection Sort | O(n²) | O(1) |
| Insertion Sort | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n) |
| Quick Sort | O(n log n) avg, O(n²) worst | O(log n) |
| Heap Sort | O(n log n) | O(1) |
| Counting Sort | O(n + k) | O(k) |
| Radix Sort | O(n * d) | O(n + k) |
| DFS | O(V + E) | O(V) |
| BFS | O(V + E) | O(V) |
| Dijkstra | O((V + E) log V) | O(V) |
| Bellman-Ford | O(V * E) | O(V) |

## Complexity Classes

### P (Polynomial Time)
Problems solvable in polynomial time: O(n^k) for some constant k.

### NP (Nondeterministic Polynomial)
Problems where solutions can be verified in polynomial time.

### NP-Complete
Hardest problems in NP - if any NP-Complete problem is in P, then P = NP.

### NP-Hard
At least as hard as NP-Complete problems.

## Practical Considerations

### Time Limits in Competitive Programming
- C++/Java: ~10^8 operations per second
- Python: ~10^7 operations per second

### Memory Limits
- Usually 256MB to 1GB
- Be mindful of stack space in recursion

## Optimization Techniques

### 1. Precomputation
```java
// Precompute factorials
long[] fact = new long[1000001];
void precomputeFactorials() {
    fact[0] = 1;
    for (int i = 1; i <= 1000000; i++) {
        fact[i] = fact[i-1] * i;
    }
}
// Now factorial queries are O(1)
```

### 2. Space-Time Tradeoff
```java
// Store results to avoid recomputation
Map<String, Integer> memo = new HashMap<>();
int fibonacci(int n) {
    if (n <= 1) return n;
    String key = String.valueOf(n);
    if (memo.containsKey(key)) return memo.get(key);
    int result = fibonacci(n-1) + fibonacci(n-2);
    memo.put(key, result);
    return result;
}
```

### 3. Efficient Data Structures
- Use HashMap for O(1) lookups
- Use TreeMap for ordered operations
- Use ArrayList for random access
- Use LinkedList for frequent insertions/deletions

## Interview Tips

### 1. Always analyze your solution
- What's the time complexity?
- What's the space complexity?
- Can it be optimized?

### 2. Know common complexities
- Sorting algorithms and their complexities
- Search algorithms
- Graph algorithms
- Dynamic programming

### 3. Think about constraints
- Input size limits your approach
- Time limits guide algorithm choice

### 4. Common Interview Questions
- Why is binary search O(log n)?
- Why is merge sort O(n log n)?
- When to use iterative vs recursive?
- Space complexity of recursion

## Practice Problems

1. **Two Sum** - O(n) time, O(n) space with HashMap
2. **Maximum Subarray** - O(n) time, O(1) space (Kadane's algorithm)
3. **Merge Two Sorted Arrays** - O(m + n) time
4. **Find Duplicate** - O(n) time, O(1) space (Floyd's cycle detection)
5. **Valid Parentheses** - O(n) time, O(n) space with stack
6. **Climbing Stairs** - O(n) time, O(1) space (Fibonacci)
7. **House Robber** - O(n) time, O(1) space (DP optimization)

## Key Takeaways

- Big O gives upper bound, Big Ω gives lower bound, Big θ gives tight bound
- Focus on dominant terms: O(n² + n) = O(n²)
- Constants don't matter: O(2n) = O(n)
- Analyze loops, recursions, and data structure operations
- Consider both time and space constraints
- Practice analyzing complexities for different algorithms

Mastering complexity analysis will help you write better, more efficient code!
