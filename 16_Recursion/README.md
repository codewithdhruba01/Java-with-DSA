# Recursion in Java

Recursion is a programming technique where a function calls itself to solve a problem. It breaks down complex problems into simpler subproblems.

## What is Recursion?

Recursion occurs when a method calls itself within its own definition. Every recursive function must have:

1. **Base Case**: A condition that stops the recursion
2. **Recursive Case**: The part where the function calls itself

## Components of Recursive Function

```java
public void recursiveFunction(parameters) {
    // Base case - stops recursion
    if (baseCondition) {
        return;
    }

    // Recursive case - calls itself
    recursiveFunction(modifiedParameters);
}
```

## Why Recursion?

- **Elegant Solutions**: Many problems have elegant recursive solutions
- **Divide and Conquer**: Breaks problems into smaller subproblems
- **Tree/Graph Traversal**: Natural fit for hierarchical structures
- **Mathematical Problems**: Many mathematical concepts are recursive

## Recursion vs Iteration

| Recursion | Iteration |
|-----------|-----------|
| Uses function call stack | Uses loop constructs |
| More memory intensive | Less memory intensive |
| Sometimes more readable | Sometimes less readable |
| Can cause stack overflow | No stack overflow risk |

## Common Recursive Problems

### 1. Factorial Calculation

**Mathematical Definition:**
```
n! = n × (n-1) × (n-2) × ... × 1
0! = 1
```

**Recursive Definition:**
```
fact(n) = n × fact(n-1) for n > 0
fact(0) = 1
```

### 2. Fibonacci Series

**Mathematical Definition:**
```
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) for n > 1
```

### 3. Tower of Hanoi

A classic problem with 3 towers and n disks. Rules:
- Only one disk can be moved at a time
- A larger disk cannot be placed on a smaller disk
- All disks must be moved from source to destination

### 4. Sum of Natural Numbers

**Recursive Definition:**
```
sum(n) = n + sum(n-1) for n > 0
sum(0) = 0
```

### 5. Power Calculation

**Recursive Definition:**
```
power(base, exp) = base × power(base, exp-1) for exp > 0
power(base, 0) = 1
```

### 6. String Reversal

**Recursive Definition:**
```
reverse(str) = str[last] + reverse(str[0..last-1]) for length > 0
reverse("") = ""
```

### 7. Binary Search (Recursive)

**Recursive Definition:**
```
binarySearch(arr, target, low, high) =
    if low > high: return -1
    mid = (low + high) / 2
    if arr[mid] == target: return mid
    if arr[mid] > target: binarySearch(arr, target, low, mid-1)
    else: binarySearch(arr, target, mid+1, high)
```

## Types of Recursion

### 1. Direct Recursion
A function calls itself directly.

```java
void directRecursion() {
    directRecursion(); // Direct call
}
```

### 2. Indirect Recursion
Function A calls Function B, and Function B calls Function A.

```java
void functionA() {
    functionB();
}

void functionB() {
    functionA();
}
```

### 3. Tail Recursion
The recursive call is the last operation in the function.

```java
void tailRecursion(int n) {
    if (n == 0) return;
    System.out.println(n);
    tailRecursion(n-1); // Last operation
}
```

### 4. Head Recursion
The recursive call is the first operation.

```java
void headRecursion(int n) {
    if (n == 0) return;
    headRecursion(n-1); // First operation
    System.out.println(n);
}
```

### 5. Linear Recursion
Each instance of the function makes at most one recursive call.

```java
int linearRecursion(int n) {
    if (n <= 1) return n;
    return linearRecursion(n-1) + n;
}
```

### 6. Tree Recursion
Each instance makes multiple recursive calls.

```java
int treeRecursion(int n) {
    if (n <= 1) return n;
    return treeRecursion(n-1) + treeRecursion(n-2);
}
```

## Recursion Examples with Code

### Factorial Example

```java
public class Factorial {
    // Recursive factorial
    static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
```

**Output:**
```
Factorial of 5 is: 120
```

### Fibonacci Example

```java
public class Fibonacci {
    // Recursive fibonacci
    static int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
```

**Output:**
```
Fibonacci sequence:
0 1 1 2 3 5 8 13 21 34 55
```

### Tower of Hanoi

```java
public class TowerOfHanoi {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }

        // Move n-1 disks from source to auxiliary
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);

        // Move n-1 disks from auxiliary to destination
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}
```

**Output:**
```
Move disk 1 from rod A to rod C
Move disk 2 from rod A to rod B
Move disk 1 from rod C to rod B
Move disk 3 from rod A to rod C
Move disk 1 from rod B to rod A
Move disk 2 from rod B to rod C
Move disk 1 from rod A to rod C
```

## Recursion Tree

A recursion tree helps visualize how recursive calls work:

```
factorial(5)
├── 5 * factorial(4)
    ├── 4 * factorial(3)
        ├── 3 * factorial(2)
            ├── 2 * factorial(1)
                └── 1 * factorial(0)
                    └── 1 (base case)
```

## Common Pitfalls

### 1. Missing Base Case
```java
// Infinite recursion - Stack Overflow!
int badRecursion(int n) {
    return n * badRecursion(n-1); // No base case
}
```

### 2. Wrong Base Case
```java
int wrongFactorial(int n) {
    if (n == 1) return 1; // Wrong! Should be n <= 1
    return n * wrongFactorial(n-1);
}
// factorial(0) will cause infinite recursion
```

### 3. Multiple Recursive Calls (Tree Recursion)
```java
// Fibonacci has exponential time complexity O(2^n)
// due to multiple recursive calls
```

## Optimization Techniques

### 1. Memoization
Store results of expensive function calls and reuse them.

```java
public class Memoization {
    static int[] memo = new int[100];

    static int fibonacciMemo(int n) {
        if (n <= 1) return n;

        // Check if already computed
        if (memo[n] != 0) return memo[n];

        // Compute and store
        memo[n] = fibonacciMemo(n-1) + fibonacciMemo(n-2);
        return memo[n];
    }
}
```

### 2. Tail Recursion Optimization
Some compilers optimize tail recursive calls to avoid stack overflow.

```java
// Tail recursive factorial
static int tailFactorial(int n, int accumulator) {
    if (n == 0) return accumulator;
    return tailFactorial(n-1, n * accumulator);
}
```

## When to Use Recursion?

**Good for:**
- Tree/Graph traversals
- Divide and conquer algorithms (Merge Sort, Quick Sort)
- Problems with recursive structure (Fibonacci, Factorial)
- Backtracking problems
- Mathematical computations

**Better to avoid:**
- When iterative solution is simpler
- When stack space is limited
- When performance is critical
- For large inputs (risk of stack overflow)

## Practice Problems

1. **Print numbers from N to 1**
2. **Print numbers from 1 to N**
3. **Sum of digits**
4. **Power function (x^n)**
5. **Check if array is sorted**
6. **Print array elements**
7. **Reverse a string**
8. **Check palindrome**
9. **Generate all subsets**
10. **Tower of Hanoi variations**

## Interview Tips

- Always identify base case first
- Think about what the function should return
- Draw recursion tree for small inputs
- Consider time and space complexity
- Be aware of stack overflow for large inputs
- Practice converting recursive solutions to iterative

Recursion is a powerful technique when used correctly. Start with simple problems and gradually move to complex ones!
