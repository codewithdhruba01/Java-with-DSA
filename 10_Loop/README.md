# Loop

* In Java, there are three iteration statements: **for**, **while**, and **do-while**. These statements are also called **loops**.

* A **loop** means repeating the same set of instructions again and again until a certain condition is true. When the condition becomes false, the loop stops.

* Java provides different types of loops to handle different programming needs. So, no matter what kind of repetition is required, Java has a loop that can be used.

> **In simple way:** A **loop** is a way to **repeat a block of code** multiple times until a certain condition is true (or false).


# Types of Loops in Java

Java provides **3 main loops**:

1. **for loop**
2. **while loop**
3. **do-while loop**

Also, there’s an **enhanced for loop (for-each)** for arrays/collections.


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

# Loop Control Statements

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

# 50 Loop Practice Questions (Java)

This list covers **simple printing → number operations → patterns → advanced math problems**.
If you solve all 50, you’ll become very strong in **loops + logic building** in Java.

---

## Easy (1–15) – Basic Loops Problems

1. Print numbers from 1 to 10 using a loop.
2. Print even numbers from 1 to 20.
3. Print odd numbers from 1 to 20.
4. Print numbers in reverse from 10 to 1.
5. Print the multiplication table of a given number (e.g., 7).
6. Find the sum of first 10 natural numbers.
7. Find the sum of even numbers between 1 to 50.
8. Find the sum of odd numbers between 1 to 50.
9. Print the squares of numbers from 1 to 10.
10. Print the cube of numbers from 1 to 5.
11. Print the first 10 multiples of 5.
12. Print alphabets A to Z using a loop.
13. Print digits of a number (e.g., 12345 → 1, 2, 3, 4, 5).
14. Find the factorial of a given number.
15. Count the number of digits in a given number.

---

## Medium (16–35) – Pattern Problems

16. Reverse a number (e.g., 123 → 321).
17. Find the sum of digits of a number.
18. Check if a number is palindrome (same forward & backward).
19. Check if a number is Armstrong (e.g., 153 → 1³+5³+3³=153).
20. Print Fibonacci series up to N terms.
21. Find the GCD (Greatest Common Divisor) of two numbers.
22. Find the LCM (Least Common Multiple) of two numbers.
23. Print all prime numbers between 1 and 50.
24. Check if a number is prime.
25. Find the sum of first N prime numbers.
26. Check if a number is perfect (sum of divisors = number).
27. Print the factors of a number.
28. Count the factors of a number.
29. Print a right-angled triangle pattern of `*`.

```
*
**
***
****
```

30. Print an inverted right-angled triangle pattern.

```
****
***
**
*
```

31. Print a square pattern of stars (NxN).
32. Print a pyramid pattern of stars.

```
   *
  ***
 *****
```

33. Print a diamond pattern of stars.
34. Print a number pyramid.

```
   1
  121
 12321
```

35. Print Floyd’s triangle.

```
1
2 3
4 5 6
```

---

## Hard (36–50) – Advanced

36. Print Pascal’s Triangle.
37. Print prime factors of a number.
38. Find HCF and LCM using loop (without formula).
39. Find the power of a number (a^b) using loop.
40. Convert a decimal number to binary using loop.
41. Convert a binary number to decimal using loop.
42. Check if a number is strong (sum of factorial of digits = number).
43. Print all Armstrong numbers between 1 and 1000.
44. Print all palindrome numbers between 1 and 1000.
45. Print all perfect numbers between 1 and 1000.
46. Generate a multiplication table from 1 to 10 using nested loops.
47. Print the pattern of a hollow square.
48. Print a hollow pyramid using stars.
49. Print the pattern of a chessboard (8x8).
50. Generate the first N rows of Pascal’s Triangle (advanced version).
