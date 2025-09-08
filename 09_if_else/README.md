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