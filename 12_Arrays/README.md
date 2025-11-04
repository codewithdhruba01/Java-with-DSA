# **ARRAY IN JAVA**

## 1. What is an Array?

An **array** in Java is a **collection of elements of the same data type**, stored in **contiguous (continuous) memory locations**.
It acts like a container that holds **multiple values** of the same kind under a single name.

**Example:**

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Here:

* `numbers` → array variable
* `{10, 20, 30, 40, 50}` → list of integers
* Each value is stored **side-by-side in memory**


## 2. Why Use Arrays?
An array in Java is a data structure that allows you to store multiple values of the same data type in a single variable.
That means, if you want to store 100 integer values, you don’t need to create 100 separate variables — one array can hold them all.


Without arrays:

```java
int num1 = 10;
int num2 = 20;
int num3 = 30;
int num4 = 40;
int num5 = 50;
```

This is hard to manage when you have many numbers!

**With arrays:**

```java
int[] numbers = new int[100];
```

You can easily store and manage 100 numbers in a single variable.


### Advantages and Disadvantages of Arrays

| **Advantages**                                                               | **Disadvantages**                                                                           |
| ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| 1. Stores multiple values of the same type in a single variable.             | 1. Fixed size — cannot be changed after creation.                                           |
| 2. Easy to access elements using index numbers.                              | 2. Can store only one data type (no mixed types).                                           |
| 3. Elements are stored in continuous memory, which makes access fast.        | 3. Inserting or deleting elements requires shifting elements.                               |
| 4. Easy to use loops for traversing (for, while, for-each).                  | 4. Wastes memory if the array size is larger than needed.                                   |
| 5. Simplifies searching and sorting of data.                                 | 5. No built-in methods for dynamic resizing or advanced operations (use ArrayList instead). |
| 6. Provides better performance for large data when compared to linked lists. | 6. Cannot directly store objects of different classes together.                             |


## 3. Benefits of Using Arrays

| Benefit               | Explanation                                               |
| --------------------- | --------------------------------------------------------- |
| **Organized Data**    | Stores multiple values of the same type together.         |
| **Fast Access**       | Access any element instantly using its index (O(1) time). |
| **Easy Looping**      | You can process all elements using loops.                 |
| **Memory Efficiency** | Stored in continuous memory blocks.                       |


## 4. How to Define an Array in Java

There are **two ways** to define (declare) an array.

### **First Way (Recommended)**

```java
int[] arr;     // Declaration
arr = new int[5];  // Memory allocation
```

> This is the preferred modern Java style.

* `int[]` → means an array of integers
* `arr` → variable name
* `new int[5]` → allocates memory for 5 integers (default value = 0)


### **Second Way (Also Valid)**

```java
int arr[];     // Declaration
arr = new int[5];  // Memory allocation
```

> This is the older C/C++ style but still valid in Java.
Most developers use the **first one** for clarity.


## 5. Declaring, Initializing, and Printing an Array

```java
public class ArrayExample {
    public static void main(String[] args) {
        // Step 1: Declare and allocate memory
        int[] marks = new int[5];

        // Step 2: Initialize elements
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        marks[3] = 60;
        marks[4] = 50;

        // Step 3: Print array elements
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }
}
```

**Output:**

```
marks[0] = 90
marks[1] = 80
marks[2] = 70
marks[3] = 60
marks[4] = 50
```

## 6. How Array Index Works

Each element in the array has an **index number**, starting from **0** and ending at **length - 1**.

| Index | Value |
| ----- | ----- |
| 0     | 90    |
| 1     | 80    |
| 2     | 70    |
| 3     | 60    |
| 4     | 50    |

**Example:**

```java
System.out.println(marks[2]); // Output: 70
```

⚠️ Accessing an invalid index:

```java
System.out.println(marks[5]); // Error: ArrayIndexOutOfBoundsException
```


## 7. Checking Array Size and Using Index

```java
System.out.println("Length of array: " + marks.length);
```

 **Output:**

```
Length of array: 5
```

Loop through all valid indexes:

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println("Index " + i + " = " + marks[i]);
}
```

## 8. Example — Array with Direct Initialization

You can define and initialize at the same time:

```java
int[] arr = {10, 20, 30, 40, 50};
```

Loop to print all:

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println("Index " + i + " → " + arr[i]);
}
```

## 9. How Java Accesses Array Elements (Internally)

When you access an element, Java uses **index calculation**.
If:

* Base address = 1000
* Each element size = 4 bytes
* You access `arr[3]`

Then:

```
Address = BaseAddress + (index × sizeOfEachElement)
         = 1000 + (3 × 4)
         = 1012
```

* Java directly jumps to address **1012** and reads the value.

* That’s why array access is **very fast** — **O(1)** time complexity.


## 10. What Happens in Memory

When you write:

```java
int[] arr = {10, 20, 30, 40, 50};
```

Memory representation:

| Index | Address | Value |
| ----- | ------- | ----- |
| 0     | 1000    | 10    |
| 1     | 1004    | 20    |
| 2     | 1008    | 30    |
| 3     | 1012    | 40    |
| 4     | 1016    | 50    |

`arr` stores the **base address (1000)** of the array.


## 11. Using Loop to Print Array Elements

You can print arrays using **two loop styles**:

### (a) Normal `for` Loop

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println("Element at index " + i + " = " + arr[i]);
}
```

### (b) Enhanced `for-each` Loop

```java
for (int value : arr) {
    System.out.println("Value: " + value);
}
```

**Both loops display all elements easily.**


## 12. Example — Finding Sum of Array Elements

```java
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Total Sum = " + sum);
    }
}
```

**Output:**

```
Total Sum = 75
```


## 13. Memory Visualization 

Think of memory as small boxes.
Each box = 1 byte,
Each `int` = 4 bytes.

| Index | Address | Value |
| ----- | ------- | ----- |
| 0     | 2000    | 5     |
| 1     | 2004    | 10    |
| 2     | 2008    | 15    |
| 3     | 2012    | 20    |
| 4     | 2016    | 25    |

So if you ask for `arr[3]`,
→ Java calculates: `2000 + (3 × 4)` = `2012`
→ Reads the value `20`.

![Java Method Difference](/images/memory-visualization.png)


## 14. Key Points Summary

| Concept                | Explanation                                                           |
| ---------------------- | --------------------------------------------------------------------- |
| **Definition**         | Array = collection of same-type elements stored in continuous memory. |
| **Two ways to define** | `int[] arr;` and `int arr[];`                                         |
| **Memory**             | Stored in contiguous memory blocks.                                   |
| **Access**             | Fast (O(1)) using index calculation.                                  |
| **Index start**        | 0                                                                     |
| **Invalid index**      | Throws `ArrayIndexOutOfBoundsException`                               |
| **Loop printing**      | Use `for` or `for-each`                                               |
| **Default values**     | 0 (int), 0.0 (float), false (boolean), null (object)                  |
| **Limitation**         | Fixed size, same data type only.                                      |

---

**In Short:**

> An array in Java is a fixed-size collection of same-type elements stored in continuous memory.
> Each element is accessed using its index, and Java calculates the memory address using the base address + index formula.
> Arrays are fast, easy to loop, and help organize data efficiently.

<div class = "center">
“Dream is not that which you see while sleeping; it is something that does not let you sleep.” – Dr. A. P. J. Abdul Kalam 🌟
</div>


