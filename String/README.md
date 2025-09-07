# 🔹 What is a String in Java?

* A **String** is a **sequence of characters** (like text).
* In Java, String is a **class** in `java.lang` package.
* Strings are **immutable** → once created, they cannot be changed (new object is created if you modify it).

👉 Example:

```java
String name = "Java Programming";
```

---

# 🔹 How to Create Strings

1. **Using String literal**

   ```java
   String s1 = "Hello";
   ```

   (stored in String pool, memory efficient)

2. **Using new keyword**

   ```java
   String s2 = new String("Hello");
   ```

   (creates a new object in heap memory)

---

# 🔹 String Concatenation

Concatenation means **joining strings** together.

### 1. Using `+` operator

```java
String first = "Java";
String second = "Programming";
String result = first + " " + second;
System.out.println(result); // Java Programming
```

### 2. Using `concat()` method

```java
String s1 = "Hello";
String s2 = "World";
String result = s1.concat(" ").concat(s2);
System.out.println(result); // Hello World
```

---

# 🔹 Numbers and Strings

When you use `+` with numbers and strings, Java behaves differently:

👉 Example:

```java
int a = 10, b = 20;
System.out.println(a + b);         // 30 (number addition)
System.out.println("Sum: " + a+b); // Sum: 1020 (string concatenation)
System.out.println("Sum: " + (a+b)); // Sum: 30 (because of brackets)
```

> Rule: If one operand is a **String**, `+` works as **concatenation** instead of addition.

---

# 🔹 Special Characters in Strings

Java uses **escape sequences** (with `\`) to represent special characters inside Strings.

| Escape Sequence | Meaning      | Example Output                     |
| --------------- | ------------ | ---------------------------------- |
| `\n`            | New line     | "Hello\nWorld" → prints in 2 lines |
| `\t`            | Tab space    | "Hello\tWorld" → Hello    World    |
| `\"`            | Double quote | "She said "Hi"" → She said "Hi"    |
| `\\`            | Backslash    | "C:\Java" → C:\Java                |
| `\'`            | Single quote | 'I'm fine' → I'm fine              |

👉 Example:

```java
public class SpecialChars {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld");
        System.out.println("She said \"Java is fun\"");
        System.out.println("Path: C:\\Users\\Java");
    }
}
```

---

# 🔹 Common String Methods

Java provides many useful methods in `String` class:

| Method                 | Example                              | Output |
| ---------------------- | ------------------------------------ | ------ |
| `length()`             | `"Hello".length()`                   | 5      |
| `toUpperCase()`        | `"java".toUpperCase()`               | JAVA   |
| `toLowerCase()`        | `"JAVA".toLowerCase()`               | java   |
| `charAt(index)`        | `"Hello".charAt(1)`                  | e      |
| `substring(start,end)` | `"Programming".substring(0,4)`       | Prog   |
| `equals()`             | `"java".equals("java")`              | true   |
| `equalsIgnoreCase()`   | `"Java".equalsIgnoreCase("java")`    | true   |
| `contains()`           | `"Java Programming".contains("Pro")` | true   |
| `replace()`            | `"Java".replace("a","o")`            | Jovo   |
| `trim()`               | `"   hello   ".trim()`               | hello  |

---

# 🔹 Example Program (Covers All Concepts)

```java
public class StringExample {
    public static void main(String[] args) {
        String name = "Java";
        String lang = "Programming";

        // Concatenation
        String result = name + " " + lang;
        System.out.println("Concatenation: " + result);

        // Numbers and Strings
        int a = 10, b = 20;
        System.out.println("Without brackets: " + a + b); // 1020
        System.out.println("With brackets: " + (a + b));  // 30

        // Special Characters
        System.out.println("Hello\nWorld");
        System.out.println("She said \"Java is great!\"");

        // Some String methods
        System.out.println("Length: " + result.length());
        System.out.println("Upper: " + result.toUpperCase());
        System.out.println("Substring: " + result.substring(0,4));
        System.out.println("Contains 'Pro': " + result.contains("Pro"));
    }
}
```

---

# 🔹 Summary

1. Strings = sequence of characters, immutable.
2. Create using **literal** or **new keyword**.
3. Concatenation → `+` operator or `concat()` method.
4. Numbers + Strings → if one is String, result is concatenation.
5. Special characters → use escape sequences (`\n`, `\t`, `\"`, etc.).
6. String class has many useful methods (`length()`, `substring()`, `toUpperCase()`, etc.).