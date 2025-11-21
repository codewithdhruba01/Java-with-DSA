# OOPS in Java
Object Oriented Programming Concepts are very important. Without having an idea about OOPS concepts, you will not be able to design systems in the object-oriented programming model. It simplifies software development and maintenance.

The core OOPs concepts:
1. **Object**
2. **Class**
3. **Abstraction**
4. **Encapsulation**
5. **Inheritance**
6. **Polymorphism**

> Let's discuss above each OOPS concepts with a real-world example.

## 1. Object : 
The Object is the real-time entity having some state and behavior. In Java, Object is an instance of the class having the instance variables like the **state** of the object and the **methods** as the behavior of the object. The object of a class can be created by
using the `new` keyword in Java Programming language.

> A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

**I found various Object Definitions :**
1. An object is a real-world entity.
2. An object is a runtime entity.
3. The object is an entity which has state and behavior.
4. The object is an instance of a class.

### **Real-World Example: Car**

**Car ek real-life object hai.** Uski kuch **properties** aur **behaviours** hote hain.

**Car (Real World Object)**

**Properties (Variables / Data)**

* brand = "Tata"
* color = "Red"
* model = "Nexon"
* speed = 0

**Behaviors (Methods / Functions)**

* start()
* stop()
* accelerate()
* brake()


**Car Object Example**

```java
class Car {
    // Properties (Attributes)
    String brand;
    String color;
    String model;
    int speed;

    // Behaviors (Methods)
    void start() {
        System.out.println(brand + " Car Started");
    }

    void accelerate(int increase) {
        speed += increase;
        System.out.println("Speed: " + speed);
    }

    void brake() {
        speed = 0;
        System.out.println("Car Stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating object
        Car myCar = new Car();

        // Initializing object values
        myCar.brand = "Tata";
        myCar.color = "Red";
        myCar.model = "Nexon";

        myCar.start();
        myCar.accelerate(20);
        myCar.brake();
    }
}
```

---

#  Output

```
Tata Car Started
Speed: 20
Car Stopped
```

### How to Declare, Create and Initialize an Object in Java

A class is a blueprint for Object, you can create an object from a class. Let's take Studentclass and try to create Java object for it.
Let's create a simple **Student** class which has **name** and **college** fields. Let's write a program to create declare, create and initialize a **Student** object in Java.

```java
package net.javaguides.corejava.oops;
public class Student {
 private String name;
 private String college;
 public Student(String name, String college) {
 super();
 this.name = name;
 this.college = college;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getCollege() {
 return college;
 }
 public void setCollege(String college) {
 this.college = college;
 }
 public static void main(String[] args) {
 Student student = new Student("Ramesh", "BVB");
 Student student2 = new Student("Prakash", "GEC");
 Student student3 = new Student("Pramod", "IIT");
 }
}
```

From the above program, the Student objects are:

```java
Student student = new Student("Ramesh", "BVB");
Student student2 = new Student("Prakash", "GEC");
Student student3 = new Student("Pramod", "IIT");
```
**Each of these statements has three parts (discussed in detail below):**

**Declaration:** The code Student student; declarations that associate a variable name with an object type.

**Instantiation:** The new keyword is a Java operator that creates the object.

**Initialization:** The new operator is followed by a call to a constructor, which initializes the new object.
