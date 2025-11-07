## **1. What is a 2D Array?**

In Java, a **2D Array** (Two-Dimensional Array) is an **array of arrays**.
That means a 2D array contains multiple **1D arrays** inside it.

It allows us to store data in the form of **rows and columns** —
just like a **table** or a **matrix**.

![2D arrays Access](/images/arrayaccess.png)

###  Example:

|    | C0 | C1 | C2 |
| -- | -- | -- | -- |
| R0 | 10 | 20 | 30 |
| R1 | 40 | 50 | 60 |
| R2 | 70 | 80 | 90 |

Here:

* **Rows = 3**
* **Columns = 3**
* This data is stored in a 2D array format.


## **2. Declaration of a 2D Array**

There are three common ways to declare a 2D array in Java 

### **Method 1:**

```java
int[][] arr;
```

### **Method 2:**

```java
int arr[][];
```

### **Method 3:**

```java
int[] arr[];
```

> All are valid, but the first one (`int[][] arr`) is the most recommended syntax.


## **3. Memory Allocation (How Data is Stored)**

When we create a 2D array, its memory structure in Java looks like this:

### Example:

```java
int[][] arr = new int[3][3];
```

* Here:

  * `3` rows (0 to 2)
  * `3` columns (0 to 2)
* So, total elements = 3 × 3 = **9 elements**

### Visualization in Memory:

```
arr[0][0] arr[0][1] arr[0][2]
arr[1][0] arr[1][1] arr[1][2]
arr[2][0] arr[2][1] arr[2][2]
```

> In Java, a 2D array is actually an **array of references**:

* `arr[0]`, `arr[1]`, `arr[2]` each store the address of a 1D array.
* That’s why a 2D array in Java can also be a **“jagged array”**,
  where each row can have a different number of columns.


## **4. Initialization (Assigning Values)**

### **Method 1: Static Initialization**

```java
int[][] arr = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
```

### **Method 2: Dynamic Initialization**

```java
int[][] arr = new int[3][3];
arr[0][0] = 10;
arr[0][1] = 20;
arr[0][2] = 30;
// and so on...
```


##  **5. Accessing Elements**

Elements of a 2D array are accessed using **row** and **column** indexes:

```java
System.out.println(arr[1][2]);  // prints element in 2nd row, 3rd column
```

> Indexing starts from **0** (zero-based indexing).


## **6. Traversing a 2D Array (Printing Using Loops)**

### **Using Nested For Loop:**

```java
for (int i = 0; i < arr.length; i++) {            // rows
    for (int j = 0; j < arr[i].length; j++) {     // columns
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

### Output:

```
10 20 30
40 50 60
70 80 90
```


## **7. Jagged Array (Irregular 2D Array)**

In Java, a 2D array doesn’t need to be of fixed size —
you can assign a different number of columns for each row.

```java
int[][] arr = new int[3][];
arr[0] = new int[2]; // 2 columns
arr[1] = new int[3]; // 3 columns
arr[2] = new int[4]; // 4 columns
```

> This is called a **Jagged Array** because each row has a different length.


## **8. Example Program:**

```java
public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("2D Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Output:

```
2D Array Elements:
1 2 3
4 5 6
7 8 9
```