## Keywords in Java

**Keywords** are **reserved words** in Java that have a predefined meaning in the language. These words are part of the Java syntax and **cannot be used as variable names, class names, or identifiers**.

### 🔹 Characteristics of Keywords:

* Always written in **lowercase** (e.g., `class`, `int`, `if`)
* Cannot be used for naming variables, methods, classes, etc.
* Control the structure and flow of a Java program

### Example:

```java
int number = 5; // 'int' is a keyword
```

### Common Java Keywords:

| Keyword  | Description                            |
| -------- | -------------------------------------- |
| `class`  | Declares a class                       |
| `public` | Access modifier                        |
| `static` | Used for class-level methods/variables |
| `void`   | Specifies no return value              |
| `int`    | Declares an integer variable           |
| `if`     | Conditional statement                  |
| `else`   | Alternative branch of `if`             |
| `return` | Returns a value from a method          |
| `new`    | Creates new objects                    |
| `for`    | Loop control structure                 |
| `while`  | Looping statement                      |
| `try`    | Begins a block to test for errors      |
| `catch`  | Handles exceptions                     |

>  There are **50+ reserved keywords** in Java. Some like `goto` and `const` are reserved but not used.

---

## Identifiers in Java

**Identifiers** are the **names** used for **variables, classes, methods, objects, and other elements** in your code. They are defined by the programmer.

### 🔹 Rules for Identifiers:

* Must begin with a **letter (A-Z or a-z)**, **underscore (\_)**, or a **dollar sign (\$)**
* Subsequent characters can be **letters**, **digits (0-9)**, **underscores**, or **\$**
* Cannot use **Java keywords** as identifiers
* Java is **case-sensitive**: `Variable` and `variable` are different

### ✔ Valid Identifiers:

```java
int age;
String firstName;
double $salary;
boolean _isActive;
```

### Invalid Identifiers:

```java
int 1number;      // Cannot start with a digit
String class;     // 'class' is a keyword
double first-name; // Hyphen is not allowed
```

## Summary

| Term           | Description                                  |
| -------------- | -------------------------------------------- |
| **Keyword**    | Reserved by Java with special meaning        |
| **Identifier** | User-defined names for elements in a program |
