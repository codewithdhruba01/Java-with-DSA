## 🔹 What is **switch-case**?

In Java, `switch-case` is a **decision-making statement** that allows you to execute one block of code out of many options based on the value of a variable.
It’s an alternative to writing multiple `if-else` statements.

---

## 🔹 Syntax of switch-case

```java
switch(expression) {
    case value1:
        // code block
        break;

    case value2:
        // code block
        break;

    case value3:
        // code block
        break;

    default:
        // code block
}
```

---

## 🔹 Important Points

1. **Expression** inside `switch()` can be:

   * `byte`, `short`, `int`, `char`, `String`, or enums.
   * Not allowed: `float`, `double`, `long`, `boolean` (before Java 7).
    From Java 7 onwards, `String` is also supported.

2. **case value**: Each `case` must have a constant value (not a variable).

3. **break statement**:

   * Ends the `switch` block immediately.
   * Without `break`, execution will "fall through" to the next case.

4. **default case**:

   * Runs if no other `case` matches.
   * Optional but recommended.

---

## 🔹 Example with **break**

```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
```

> Output (because `day = 3`):

```
Wednesday
```

---

## 🔹 What if we remove `break`?

```java
int number = 2;

switch(number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
    default:
        System.out.println("Invalid");
}
```

> Output will be:

```
Two
Three
Invalid
```

> Because there’s **no `break`**, execution continues to the next cases (this is called **fall-through**).

---

## 🔹 When to use `break`?

* Use `break` if you **only want one matching case to run**.
* Skip `break` if you intentionally want to **execute multiple cases** together.

---

## **Summary**:

* `switch-case` is used instead of multiple `if-else`.
* `break` is important to stop execution after one case.
* Without `break`, fall-through occurs.
* `default` handles unmatched values.

---

## **Switch-Case** Practice Questions

1. Write a Java program to display the day of the week (1–7).

2. Write a Java program to display the month name based on month number (1–12).

3. Write a Java program to check whether a number is odd or even using switch.

4. Write a Java program to perform a simple calculator (+, -, *, /) using switch.

5. Write a Java program to print the number of days in a month using switch.

6. Write a Java program to check whether a character is a vowel or consonant using switch.

7. Write a Java program to check whether a character is uppercase or lowercase using switch.

8. Write a Java program to assign grades using switch (A, B, C, D, F).

9. Write a Java program to find the type of triangle (equilateral, isosceles, scalene) using switch.

10. Write a Java program to print season name based on month using switch.