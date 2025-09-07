##  What is Type Casting?

In Java, **Type Casting** means **converting one data type into another**.
For example:

* Converting an `int` to a `double`
* Converting a `double` to an `int`

---

## 🔹 Why do we need Type Casting?

* Sometimes we need to **store a value of one type into another type**.
* Example: Adding an integer to a decimal number → Java automatically converts `int` into `double`.


## 🔹 Types of Type Casting in Java

There are **two main types**:

### 1. **Widening Casting (Implicit Casting)**

* **Smaller type → Bigger type**
* Done **automatically** by Java (no risk of data loss).
* Example:
  `int → long → float → double`

👉 Example:

```java
public class WideningExample {
    public static void main(String[] args) {
        int num = 10;        // int
        double d = num;      // int is automatically converted to double

        System.out.println("Integer: " + num);
        System.out.println("Double : " + d);
    }
}
```

 Output:

```
Integer: 10
Double : 10.0
```

---

### 2. **Narrowing Casting (Explicit Casting)**

* **Bigger type → Smaller type**
* Done **manually** using `(type)`
* Risk of **data loss**

👉 Example:

```java
public class NarrowingExample {
    public static void main(String[] args) {
        double d = 9.78;          // double
        int num = (int) d;        // manually convert double to int

        System.out.println("Double : " + d);
        System.out.println("Integer: " + num);
    }
}
```

 Output:

```
Double : 9.78
Integer: 9
```

👉 Here `.78` is lost because `int` cannot store decimal part.

---

## 🔹 Type Casting Hierarchy

Java data types hierarchy from smaller to bigger:

```
byte → short → int → long → float → double
          char → int
```

---

## 🔹 Example with Both Castings

```java
public class CastingExample {
    public static void main(String[] args) {
        // Widening (automatic)
        int x = 100;
        double y = x; // int → double
        System.out.println("Widening: " + y);

        // Narrowing (manual)
        double a = 99.99;
        int b = (int) a; // double → int
        System.out.println("Narrowing: " + b);
    }
}
```

---

## 🔹 Important Points

1. **Widening** → automatic, no data loss.
2. **Narrowing** → manual, may lose data.
3. You must use `(type)` when converting bigger → smaller.
4. Works only between **compatible types** (like number types).