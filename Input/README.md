## 🔹 What is Input in Java?

In Java, **Input** means taking data from the user (like numbers, text, etc.) and using it in your program.
For example:

* Asking the user to enter their name
* Asking for a number to calculate something

---

## 🔹 Ways to Take Input in Java

There are mainly 3 ways:

### 1. **Using Scanner class** (most commonly used)

* Scanner is a built-in class in Java (`java.util.Scanner`) that makes it easy to take input from the user.

👉 Steps:

1. Import Scanner class

   ```java
   import java.util.Scanner;
   ```
2. Create Scanner object

   ```java
   Scanner sc = new Scanner(System.in);
   ```
3. Use methods to take input

👉 Example:

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking double input
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.println("Hello " + name + ", age: " + age + ", marks: " + marks);
    }
}
```

👉 Scanner Methods:

* `nextInt()` → for integers
* `nextDouble()` → for decimals
* `nextLine()` → for full line (string with spaces)
* `next()` → for single word string
* `nextBoolean()` → for true/false input

---

### 2. **Using BufferedReader**

This is an older way, faster than Scanner, but little more complex.

```java
import java.io.*;

public class InputBuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine()); // need parsing

        System.out.println("Hello " + name + ", age: " + age);
    }
}
```

---

### 3. **Using Command-Line Arguments**

Inputs can also come from the command line when you run the program.

```java
public class CommandLineInput {
    public static void main(String[] args) {
        String name = args[0]; // first input
        int age = Integer.parseInt(args[1]); // second input

        System.out.println("Hello " + name + ", age: " + age);
    }
}
```

Run like this:

```
java CommandLineInput John 20
```

---

## 🔹 Conclusion

* **For beginners → Scanner is best** (simple and easy).
* **For performance → BufferedReader is better.**
* **For arguments at runtime → Command-line arguments.**