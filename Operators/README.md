# What are Operators?

Operators are **symbols** in Java that perform **operations on variables and values**.

👉 Example:

```java
int a = 10, b = 5;
int sum = a + b;  // here + is an operator
```

---

## 🔹 Types of Operators in Java

Java has **7 main categories of operators**:

---

## 1. **Arithmetic Operators**

Used for basic **mathematical operations**.

| Operator | Meaning             | Example (`a=10, b=5`) | Result |
| -------- | ------------------- | --------------------- | ------ |
| `+`      | Addition            | `a + b`               | 15     |
| `-`      | Subtraction         | `a - b`               | 5      |
| `*`      | Multiplication      | `a * b`               | 50     |
| `/`      | Division            | `a / b`               | 2      |
| `%`      | Modulus (remainder) | `a % b`               | 0      |

👉 Example:

```java
int a = 10, b = 3;
System.out.println(a / b);  // 3
System.out.println(a % b);  // 1
```

---

## 2. **Relational (Comparison) Operators**

Used to **compare two values** (result is `true` or `false`).

| Operator | Meaning          | Example (a=10, b=5) | Result |
| -------- | ---------------- | ------------------- | ------ |
| `==`     | Equal to         | `a == b`            | false  |
| `!=`     | Not equal to     | `a != b`            | true   |
| `>`      | Greater than     | `a > b`             | true   |
| `<`      | Less than        | `a < b`             | false  |
| `>=`     | Greater or equal | `a >= b`            | true   |
| `<=`     | Less or equal    | `a <= b`            | false  |

---

## 3. **Logical Operators**

Used to combine multiple conditions.

| Operator | Meaning     | Example                    | Result     |           |   |                  |      |
| -------- | ----------- | -------------------------- | ---------- | --------- | - | ---------------- | ---- |
| `&&`     | Logical AND | `(a > 5 && b < 10)` → true | true       |           |   |                  |      |
| \`       |             | \`                         | Logical OR | \`(a > 15 |   | b < 10)\` → true | true |
| `!`      | Logical NOT | `!(a > b)`                 | false      |           |   |                  |      |

---

## 4. **Assignment Operators**

Used to assign values to variables.

| Operator | Example  | Meaning        |
| -------- | -------- | -------------- |
| `=`      | `a = 5`  | Assigns 5 to a |
| `+=`     | `a += 3` | `a = a + 3`    |
| `-=`     | `a -= 2` | `a = a - 2`    |
| `*=`     | `a *= 4` | `a = a * 4`    |
| `/=`     | `a /= 2` | `a = a / 2`    |
| `%=`     | `a %= 3` | `a = a % 3`    |

---

## 5. **Unary Operators**

Work with **only one operand**.

| Operator | Meaning                       | Example (`a=10`) | Result |
| -------- | ----------------------------- | ---------------- | ------ |
| `+`      | Unary plus (no effect)        | `+a`             | 10     |
| `-`      | Unary minus (negation)        | `-a`             | -10    |
| `++`     | Increment (increase by 1)     | `a++` or `++a`   | 11     |
| `--`     | Decrement (decrease by 1)     | `a--` or `--a`   | 9      |
| `!`      | Logical NOT (reverse boolean) | `!(a>5)`         | false  |

👉 Example:

```java
int x = 5;
System.out.println(x++); // 5 (then becomes 6)
System.out.println(++x); // 7 (first increment, then print)
```

---

## 6. **Bitwise Operators** (works on bits)

Used for **binary (bit-level) operations**.

| Operator | Meaning     | Example (a=5=0101, b=3=0011) | Result   |     |          |
| -------- | ----------- | ---------------------------- | -------- | --- | -------- |
| `&`      | Bitwise AND | `a & b`                      | 1 (0001) |     |          |
| \`       | \`          | Bitwise OR                   | \`a      | b\` | 7 (0111) |
| `^`      | Bitwise XOR | `a ^ b`                      | 6 (0110) |     |          |
| `~`      | Bitwise NOT | `~a`                         | -6       |     |          |
| `<<`     | Left shift  | `a << 1`                     | 10       |     |          |
| `>>`     | Right shift | `a >> 1`                     | 2        |     |          |

---

## 7. **Ternary Operator (?:)**

Shortcut for `if-else`.
👉 Syntax:

```java
variable = (condition) ? value_if_true : value_if_false;
```

👉 Example:

```java
int age = 18;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result);  // Adult
```

---

# 🔹 Summary

1. Arithmetic → +, -, \*, /, %
2. Relational → ==, !=, >, <, >=, <=
3. Logical → &&, ||, !
4. Assignment → =, +=, -=, \*=, /=
5. Unary → ++, --, -, +, !
6. Bitwise → &, |, ^, \~, <<, >>
7. Ternary → ? :