# 🔹 What is an `if-else` Statement?

In Java, `if-else` is a **decision-making control statement**.
It allows your program to **execute a block of code only if a certain condition is true**.
If the condition is false, it will either **skip the block** or **execute another block (else part)**.

---

# 🔹 Syntax of `if` Statement

```java
if (condition) {
    // code to be executed if condition is true
}
```

* **condition** → It must be a boolean expression (`true` or `false`).
* If condition is `true` → statements inside `{ }` run.
* If condition is `false` → Java skips those statements.

**Example:**

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

**Output:** `You are eligible to vote.`

---

# 🔹 `if-else` Statement

This is used when we want **two choices**:

* If condition is `true` → run one block.
* If condition is `false` → run another block.

### Syntax:

```java
if (condition) {
    // runs if condition is true
} else {
    // runs if condition is false
}
```

**Example:**

```java
int age = 15;

if (age >= 18) {
    System.out.println("You can vote.");
} else {
    System.out.println("You cannot vote.");
}
```

**Output:** `You cannot vote.`

---

# 🔹 `if-else if-else` Ladder

When you have **multiple conditions**, use `if-else if`.
It checks conditions **one by one** from top to bottom.
The first true condition’s block will run, others will be skipped.

### Syntax:

```java
if (condition1) {
    // runs if condition1 is true
} else if (condition2) {
    // runs if condition2 is true
} else if (condition3) {
    // runs if condition3 is true
} else {
    // runs if all conditions are false
}
```

**Example:**

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 75) {
    System.out.println("Grade: B");
} else if (marks >= 50) {
    System.out.println("Grade: C");
} else {
    System.out.println("Fail");
}
```

**Output:** `Grade: B`

---

# 🔹 Nested `if` Statement

An **if inside another if** is called a nested if.
This is useful when you want to check multiple conditions **inside one block**.

### Syntax:

```java
if (condition1) {
    if (condition2) {
        // runs only if condition1 and condition2 are true
    }
}
```

**Example:**

```java
int age = 20;
boolean hasVoterID = true;

if (age >= 18) {
    if (hasVoterID) {
        System.out.println("You can vote.");
    } else {
        System.out.println("You need a Voter ID to vote.");
    }
} else {
    System.out.println("You are too young to vote.");
}
```

 **Output:** `You can vote.`

---

# 🔹 Points to Remember

1. Condition inside `if` must return `true` or `false`.

   * Example: `if (x > 10)` 
   * `if (x)`  (not allowed in Java, unlike C/C++)

2. Braces `{ }` are optional if only **one statement** is inside.

   ```java
   if (x > 0)
       System.out.println("Positive number");
   ```

3. `else` always belongs to the **closest `if`** (unless you use `{ }` to group).

4. Execution always goes **top to bottom**.

---

# 🔹 Real-Life Example

```java
int time = 19;

if (time < 12) {
    System.out.println("Good Morning Dhrub!");
} else if (time < 18) {
    System.out.println("Good Afternoon Dhrub!");
} else {
    System.out.println("Good Evening Dhrub!");
}
```

**Output:** `Good Evening Dhrub!`

# 40 Java Conditional Statement Practice Questions

### 🔹 Basic `if` and `if-else`

1. Write a Java program to check if a number is positive.
2. Write a Java program to check if a number is negative or zero.
3. Write a Java program to check whether a person is eligible to vote (age ≥ 18).
4. Write a Java program to check whether a given number is even or odd.
5. Write a Java program to check whether a number is divisible by 5.
6. Write a Java program to check if a character is a vowel or consonant.
7. Write a Java program to check whether a number is a multiple of both 3 and 7.
8. Write a Java program to find the greatest of two numbers.
9. Write a Java program to find the smallest of two numbers.
10. Write a Java program to check if a year is a leap year or not.

---

### 🔹 `if-else-if` Ladder

11. Write a Java program to find the greatest among three numbers.
12. Write a Java program to check whether a number is positive, negative, or zero.
13. Write a Java program to assign grades based on marks:

* 90–100 → A
* 80–89 → B
* 70–79 → C
* 60–69 → D
* Below 60 → F

14. Write a Java program to display the largest among three different numbers.
15. Write a Java program to check the type of triangle (equilateral, isosceles, scalene).
16. Write a Java program to check whether a character is uppercase, lowercase, digit, or special symbol.
17. Write a Java program to determine the season based on month number (1–12).
18. Write a Java program to calculate discount based on purchase amount:

* > 5000 → 20%
* > 2000 → 10%
* Otherwise → 5%

19. Write a Java program to check whether a student passed or failed (pass if marks ≥ 40).
20. Write a Java program to classify age into child, teenager, adult, or senior citizen.

---

### 🔹 Nested `if`

21. Write a Java program to find the largest of four numbers using nested `if`.
22. Write a Java program to check if a number is positive and divisible by 2.
23. Write a Java program to check if a year is a leap year (using nested `if`).
24. Write a Java program to check if a number is divisible by both 2 and 3.
25. Write a Java program to check if a number is within 100–200 and divisible by 5.
26. Write a Java program to check whether a person is eligible for blood donation (age >18 and weight >50).
27. Write a Java program to check if a character is an alphabet, and if it is, check whether it is a vowel or consonant.
28. Write a Java program to input marks of 5 subjects and determine division (First, Second, Third, Fail).
29. Write a Java program to check if a number is positive, and if positive, check whether it is odd or even.
30. Write a Java program to check if a person is eligible for marriage (male: 21+, female: 18+).

---

### 🔹 Mixed / Application-based

31. Write a Java program to calculate electricity bill based on units:

* First 100 → ₹1.5 per unit
* Next 200 → ₹2.5 per unit
* Above 300 → ₹3.5 per unit

32. Write a Java program to check whether a number is Armstrong number (using conditional).
33. Write a Java program to check whether a number is palindrome (using conditional).
34. Write a Java program to input three sides and check whether they can form a valid triangle.
35. Write a Java program to check whether a number is prime or not (basic version with `if`).
36. Write a Java program to check whether a person is eligible for a driving license (age ≥18).
37. Write a Java program to input three numbers and display them in ascending order.
38. Write a Java program to check whether a character is alphabet, digit, or special character.
39. Write a Java program to check whether a number is perfect square or not.
40. Write a Java program to check whether a number is divisible by 2, 3, and 5
