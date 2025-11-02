#  Functions in Java

## 1. **What is a Function in Java?**

* A **function** (also called a **method** in Java) is a **block of reusable code** that performs a specific task.
* Instead of writing the same logic again and again, we write it once inside a function and then call it whenever needed.

 **Example in real life:**

> Suppose you need to calculate the area of a circle many times in your program. Instead of writing the formula everywhere (`area = πr²`), you can put it inside a function called `calculateArea()` and call it whenever required.

## 2. **Why Functions are Needed?**

Functions make programming:

1. **Reusable** → Write once, use many times.
2. **Readable** → Code is easier to understand because complex logic is broken into small pieces.
3. **Debuggable** → If something goes wrong, you can find the bug in one function instead of searching in the whole program.
4. **Maintainable** → Easy to update or change in one place.

* Without functions → Big and messy code.
* With functions → Clean and modular code.


## 3. **Syntax of a Function**

```java
returnType functionName(parameters) {
    // function body (statements)
    return value; // (if returnType is not void)
}
```

### Explanation:

* **returnType** → The type of value returned by the function (`int`, `double`, `String`, etc.). If no value is returned, we use `void`.
* **functionName** → Any valid name (follow camelCase, like `calculateArea`, `getName`).
* **parameters** → Inputs passed into the function. (Optional)
* **function body** → The actual logic of the function.
* **return statement** → Used to return the result (only if the return type is not `void`).
  

## 4. **Types of Functions in Java**

### (A) Based on Return Type

1. **Void function (no return value)**
   > Performs a task but does not return anything.

   ```java
   void greet() {
       System.out.println("Hello, welcome to Java!");
   }
   ```

2. **Function with return type**
   > Performs a task and returns a result.

   ```java
   int square(int n) {
       return n * n;  // returns an integer
   }
   ```

![Java Method Difference](/images/difference.png)

### Method :

```java
class MathExample {
    // Method definition
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathExample obj = new MathExample();
        System.out.println(obj.add(5, 3)); // Method call
    }
}
```

→ Ye **method** hai, kyunki ye ek **class (MathExample)** ke andar likha gaya hai.

---

### In Short:

> Java me **function = method**,
> bas farak ye hai ki **Java me sab kuch class ke andar hota hai**,
> isliye “function” word ke jagah “method” use kiya jata hai.

![Java Method Diagram](/images/method.png)

### What happens in memory?
 **Jab function chalta hai to memory me yeh hota hai:**

1. **Program start hote hi** JVM sabse pehle `main()` function ko **stack memory** me load karta hai.
2. Jab aap `new` likhte ho (jaise `new Scanner()`), tab **heap memory** me ek object banta hai, aur uska **address** stack me store hota hai.
3. Jab aap **function call** karte ho, to ek **naya stack frame** banta hai jisme us function ke variables aur parameters store hote hain.
4. Jab function ka kaam khatam hota hai, uska stack frame **delete** ho jata hai (memory free ho jati hai).
5. Jab program pura khatam hota hai, to heap me bache huye unused objects ko **Garbage Collector** automatically delete kar deta hai.

**Simple words me:**

* Stack → short-term memory (for method calls & local variables)
* Heap → long-term memory (for objects)
* Function call → stack me naya box banta hai
* Function return → box delete ho jata hai

![Java Memory Diagram](/images/memory_management.png)

### (B) Based on Parameters

1. **Without parameters**
 > Function does not take any input.

   ```java
   void sayHello() {
       System.out.println("Hello!");
   }
   ```

2. **With parameters**
> Function takes inputs (arguments) when called.

   ```java
   void displaySum(int a, int b) {
       System.out.println("Sum: " + (a + b));
   }
   ```


## 5. **How to Call a Function**

* Defining a function alone is not enough.
* We must **call** it to execute.

### Example:

```java
public class FunctionExample {
    // function definition
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // function call
        int result = add(5, 10);
        System.out.println("Sum is: " + result);
    }
}
```

### Output:

```
Sum is: 15
```

## 6. **Static vs Non-Static Functions**

### 1. Static Function

* Belongs to the **class**, not the object.
* Can be called directly using the class name.
* Example: `main()` function is always static.

```java
class MyClass {
    static void greet() {
        System.out.println("Hello from static function!");
    }
}
public class Test {
    public static void main(String[] args) {
        MyClass.greet();  // no object needed
    }
}
```

### 2. Non-Static Function

* Belongs to an **object**, not the class.
* Must create an object to call it.

```java
class MyClass {
    void greet() {
        System.out.println("Hello from non-static function!");
    }
}
public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // object creation
        obj.greet();  // call function
    }
}
```

## 7. **Function Overloading**

* When two or more functions have the **same name** but different **parameter lists** (number or type of arguments).
* Compiler decides which one to run based on the arguments.

Example:

```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class Test {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.add(5, 10));      // calls int version
        System.out.println(m.add(5.5, 4.5));  // calls double version
    }
}
```

## 8. **Built-in Functions in Java**

Java provides many pre-defined functions inside libraries (packages).
Examples:

* `Math.sqrt(16)` → returns 4.0
* `Math.max(5, 9)` → returns 9
* `"Hello".length()` → returns 5
* `"Java".toUpperCase()` → returns `"JAVA"`

---

## 9. **Advantages of Using Functions**

1. **Code Reusability** → Don’t repeat yourself (DRY principle).
2. **Readability** → Small, meaningful blocks of code.
3. **Modularity** → Divide the program into independent functions.
4. **Debugging & Maintenance** → Easy to test, fix, or update.


## 10. **Complete Example**

```java
public class FunctionDemo {
    
    // function without return
    static void greet() {
        System.out.println("Hello, welcome!");
    }

    // function with return
    static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        greet(); // calling greet()

        int product = multiply(4, 6); // calling multiply()
        System.out.println("Product is: " + product);
    }
}
```

### Output:

```
Hello, welcome!
Product is: 24
```

## 11. **Diagram (Function Call Flow)**

```
main()  ---------calls---------->  greet()
       ---------calls---------->  multiply(4,6)
                                     |
                                     v
                                returns 24
       <--------------------------- back to main()
```


 **In summary:**

* A function in Java is a block of code that performs a task.
* It may or may not take input (parameters).
* It may or may not return output (return type).
* Functions make code reusable, readable, and modular.
