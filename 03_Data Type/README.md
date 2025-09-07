#  What is a Data Type?
In Java, **data type** tells the **kind of data** a variable can hold. Example: If you want to store age → you use `int` (integer type). If you want to store price → you use `float` (decimal type). If you want to store name → you use `String`.

---

# Types of Data Types in Java

Java has **two categories** of data types:

1. **Primitive Data Types** (basic, predefined by Java)
2. **Non-Primitive Data Types** (created by programmers or classes)

---

## 1️. Primitive Data Types

There are **8 primitive data types** in Java:

| Data Type   | Size    | Example Value | Description                         |
| ----------- | ------- | ------------- | ----------------------------------- |
| **byte**    | 1 byte  | 10, -20       | Small integers (-128 to 127)        |
| **short**   | 2 bytes | 1000          | Medium integers (-32,768 to 32,767) |
| **int**     | 4 bytes | 100000        | Commonly used for whole numbers     |
| **long**    | 8 bytes | 10000000000L  | Large integers (end with `L`)       |
| **float**   | 4 bytes | 12.5f         | Decimal numbers (end with `f`)      |
| **double**  | 8 bytes | 19.99         | Decimal numbers (higher precision)  |
| **char**    | 2 bytes | 'A', '9'      | Stores a single character           |
| **boolean** | 1 bit   | true / false  | Stores only `true` or `false`       |

👉 **Example in Java:**

```java
public class DataTypesExample {
    public static void main(String[] args) {
        byte age = 25;
        int salary = 50000;
        long distance = 15000000000L;
        float price = 99.99f;
        double pi = 3.14159;
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Distance: " + distance);
        System.out.println("Price: " + price);
        System.out.println("PI: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Java Fun? " + isJavaFun);
    }
}
```

---

## 2️. Non-Primitive Data Types

These are **not predefined** in Java; they are created by the programmer or provided by Java libraries.

Examples:

* **String** → `"Hello Java"`
* **Arrays** → `{1, 2, 3, 4}`
* **Classes** → Custom user-defined data types
* **Interfaces** → Used in OOP

👉 **Example in Java:**

```java
public class NonPrimitiveExample {
    public static void main(String[] args) {
        String name = "Dhrub";   // String
        int[] numbers = {1, 2, 3, 4};  // Array

        System.out.println("Name: " + name);
        System.out.println("First Number: " + numbers[0]);
    }
}
```

---

# 🎯 Key Points to Remember

* **Primitive** = simple/basic (8 fixed types).
* **Non-Primitive** = complex (String, Arrays, Classes, etc.).
* Data type decides:

  * How much memory will be used.
  * What kind of operations are allowed.