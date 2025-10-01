## 🔹 1. Function Method in Java

* In **general programming**, a **function** is a block of code that performs a specific task and can be called multiple times.
* In **Java**, every function is actually called a **method**, because all functions must be defined inside a **class or object**.

> So technically, **Java does not have free-standing functions** (like in C or Python).

---

## 🔹 2. Syntax of a Method in Java

```java
returnType methodName(parameters) {
    // method body (statements)
    return value; // (if returnType is not void)
}
```

**Example:**

```java
int add(int a, int b) {
    return a + b;
}
```

---

## 🔹 3. Types of Methods

### (A) Based on Definition

1. **Predefined Methods (Library Methods)**

   * Already provided by Java libraries.
   * Example: `System.out.println()`, `Math.sqrt(25)`, `Arrays.sort()`.

2. **User-defined Methods**

   * Methods created by programmers.
   * Example:

     ```java
     void greet() {
         System.out.println("Hello, Java!");
     }
     ```

---

### (B) Based on Return Type

1. **Void Method** → No return value

   ```java
   void showMessage() {
       System.out.println("Welcome to Java");
   }
   ```
2. **Return Method** → Returns a value

   ```java
   int square(int x) {
       return x * x;
   }
   ```

---

### (C) Based on Parameters

1. **No Parameter, No Return**

   ```java
   void sayHello() {
       System.out.println("Hello");
   }
   ```
2. **Parameter, No Return**

   ```java
   void greet(String name) {
       System.out.println("Hello " + name);
   }
   ```
3. **No Parameter, Return**

   ```java
   int getNumber() {
       return 100;
   }
   ```
4. **Parameter, Return**

   ```java
   int add(int a, int b) {
       return a + b;
   }
   ```

---

## 🔹 4. Method Signature

* A **method signature** is the combination of:

  * **Method name**
  * **Parameter list (number, type, and order of parameters)**

👉 Example:
`add(int, int)` and `add(double, double)` are **different signatures**.

---

## 🔹 5. Method Overloading

* Same method name, different parameter list.
* Happens **within the same class**.
* Example:

  ```java
  class Calculator {
      int add(int a, int b) {
          return a + b;
      }

      double add(double a, double b) {
          return a + b;
      }
  }
  ```

---

## 🔹 6. Static vs Non-static Methods

1. **Static Method**

   * Belongs to the class, not an object.
   * Called using **ClassName.methodName()**.
   * Example:

     ```java
     class MathUtil {
         static int square(int n) {
             return n * n;
         }
     }
     public class Test {
         public static void main(String[] args) {
             System.out.println(MathUtil.square(5));
         }
     }
     ```

2. **Non-static Method**

   * Belongs to an object (instance).
   * Called using **object.methodName()**.
   * Example:

     ```java
     class Person {
         void introduce() {
             System.out.println("I am a person.");
         }
     }
     public class Test {
         public static void main(String[] args) {
             Person p = new Person();
             p.introduce();
         }
     }
     ```

---

## 🔹 7. Access Modifiers with Methods

* **public** → accessible everywhere
* **private** → accessible only inside the same class
* **protected** → accessible in same package + subclass
* **default (no modifier)** → accessible only in same package

Example:

```java
public void show() { }   // accessible everywhere
private void hide() { }  // only within same class
```

---

## 🔹 8. Special Methods in Java

1. **main() Method**

   ```java
   public static void main(String[] args) {
       // entry point of Java program
   }
   ```
2. **Constructor**

   * Special method used to initialize objects.
   * Same name as class, no return type.

---

## 🔹 9. Key Differences: Function vs Method in Java

| Aspect            | Function (General)            | Method (Java)                |
| ----------------- | ----------------------------- | ---------------------------- |
| Belongs to        | Independent (can exist alone) | Always inside a class/object |
| Called by         | Function name                 | Object/Class name + method   |
| Java Availability | Not supported directly        | Supported                    |

---

## 🔹 10. Full Example

```java
class Calculator {

    // Method with return type and parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with no return type
    void display() {
        System.out.println("This is a calculator");
    }

    // Static method
    static int multiply(int x, int y) {
        return x * y;
    }
}

public class MethodExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling non-static methods
        calc.display();
        System.out.println("Sum: " + calc.add(10, 20));

        // Calling static method
        System.out.println("Product: " + Calculator.multiply(5, 6));
    }
}
```

**Output:**

```
This is a calculator
Sum: 30
Product: 30
```