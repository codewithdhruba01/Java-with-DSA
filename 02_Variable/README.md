
# 📘 Variables in Java 

## 1. What is a Variable?

A **variable** is like a **box** in your computer’s memory.
 You can **store data** in this box, and later **use or change it**. Each variable has:

  1. **Name** → (what we call the box)
  2. **Type** → (what kind of things can be stored in it)
  3. **Value** → (the actual data inside the box)

👉 Example:

```java
int age = 20;
```

* `int` → type (numbers without decimal)
* `age` → name of the variable
* `20` → value stored inside

---

## 2. Declaring and Initializing Variables

* **Declaration** = creating the box

```java
int age;   // only declared
```

* **Initialization** = putting something inside the box for the first time

```java
age = 20;  // initialized
```

* **Both together**

```java
int age = 20; // declared + initialized
```

---

## 3. Rules for Naming Variables

✔ Allowed:

* Start with a **letter, underscore (\_), or dollar sign (\$)**
* Can contain **letters and numbers**
* Case-sensitive (`age` and `Age` are different)

❌ Not Allowed:

* Starting with a number (`1age` ❌)
* Using Java keywords (`class`, `int` ❌)
* Spaces (`student age` ❌)

👉 Example of valid names:

```java
int studentAge;
double salary_2025;
String $name;
```

---

## 4. Types of Variables in Java

There are **3 types of variables** in Java, based on where we declare them:

---

### (A) Local Variables

* Declared **inside a method, block, or constructor**
* Exist **only while the method is running**
* Must be **initialized before use**

👉 Example:

```java
public void show() {
    int x = 10;   // local variable
    System.out.println(x);
}
```

---

### (B) Instance Variables

* Declared **inside a class but outside methods**
* Each **object** gets its own copy
* Also called **non-static variables**

👉 Example:

```java
class Student {
    String name;   // instance variable
    int age;       // instance variable
}
```

Each student object will have its **own name and age**.

---

### (C) Static Variables

* Declared with `static` keyword
* **Shared by all objects** of the class (only **one copy**)
* Useful for common properties (like school name, company name)

👉 Example:

```java
class Student {
    static String school = "ABC School"; // static variable
}
```

All students share the **same school name**.

---

## 5. Variable Scope

* **Local Variable** → Used only inside the method/block
* **Instance Variable** → Available to each object
* **Static Variable** → Shared by all objects (class-level)

---

## 6. Constant Variables

If you don’t want the value to change, use `final`.

```java
final double PI = 3.14159; // constant variable
```

---

## 7. Example Program

```java
public class VariableDemo {
    int instanceVar = 50;        // instance variable
    static int staticVar = 100;  // static variable

    public void display() {
        int localVar = 10;       // local variable
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.display();
    }
}
```

👉 Output:

```
Local: 10
Instance: 50
Static: 100
```

---

# Quick Summary

1. Variable = container (box) to store data.
2. Must be declared with **type + name**.
3. 3 Types of Variables:

   * **Local** → inside method, temporary
   * **Instance** → belongs to object
   * **Static** → shared by all objects
4. Use `final` for constants.