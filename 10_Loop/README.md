# 🔹 What is a Loop?

A **loop** is a way to **repeat a block of code** multiple times until a certain condition is true (or false).
> Instead of writing the same statement many times, we use loops.

---

# 🔹 Types of Loops in Java

Java provides **3 main loops**:

1. **for loop**
2. **while loop**
3. **do-while loop**

Also, there’s an **enhanced for loop (for-each)** for arrays/collections.

---

## 1. for loop

As you from your privious programming experience, loop statements are an improtant part of any programming language.  java is no 
exception. in fact, Java supplies a powerful assortment of loop constructs. Perhaps the most versatile is the **for loop**. The simplest form of the **for loop** is shown here:

`for(initialization; condition; update)`

### Syntax:

```java
for(initialization; condition; update) {
    // code to repeat
}
```

In its most common form, the `initialization` portion of the loop sets a loop control variable to an **initial** value. The condition is a Boolean expression that tests the loop control variable. If the outcome of that test is true, the for loop continues to iterate. If it is false, **the loop terminates**. The iteration expression determines how the loop control variable is changed each time the loop iterates. Here is a example the for loop:


### Example:

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello " + i);
        }
    }
}
```

 **Output:**

```
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
```

---

## 2. `while loop`

The **while** loop is java most fundamental loop statement. It repeats a statements or block while  its controlling expression is true.
> Here is its general form:

### Syntax:

```java
while(condition) {
    // code to repeat
}
```

### Example:

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }
    }
}
```

 **Output:**

```
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5
```

---

## 3. `do-while loop`

As you just saw, if the conditional expression controlling a **while** loop is initially false, then the body of the loop will not be executed at all. However, sometimes it is desirable to execute the body of a loop at least once, even if the conditional expression is false to begin with. In other words, there are times when you would like to test the termination expression at the end of the loop rather than at the beginning. Fortunately, Java supplies a loop that does just that: the **do-while**. The **do-while** loop always executes its body at least once, because its conditional expression is at the bottom of the loop. Its general form is

* Similar to `while`, but the **code runs at least once** even if the condition is false.
* Condition is checked **after** execution.

### Syntax:

```java
do {
    // body of loop
} while(condition);
```

### Example:

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Number: " + i);
            i++;
        } while(i <= 5);
    }
}
```

 **Output:**

```
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

---

## 4. Enhanced For Loop (for-each loop)

* Specially used to loop through arrays or collections.

### Example:

```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
```

 **Output:**

```
10
20
30
40
```

---

# 🔹 Loop Control Statements

1. **break** → exits the loop immediately.
2. **continue** → skips the current iteration and moves to the next.

### Example with `break`:

```java
for(int i = 1; i <= 5; i++) {
    if(i == 3) break;
    System.out.println(i);
}
```

 **Output:**

```
1
2
```

### Example with `continue`:

```java
for(int i = 1; i <= 5; i++) {
    if(i == 3) continue;
    System.out.println(i);
}
```

 **Output:**

```
1
2
4
5
```

---

**Summary:**

* Use `for` → when you know how many times to repeat.
* Use `while` → when repetitions depend on condition.
* Use `do-while` → when code must run at least once.
* Use `for-each` → for arrays/collections.

