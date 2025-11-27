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

# 1. Object : 
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

###  Output

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

## Declaring a Variable to Refer to an Object 

**General syntax:**
```java
type name;
```
This notifies the compiler that you will use a name to refer to data whose type is a type. With a primitive variable, this declaration also reserves the proper amount of memory for the variable. 

> From the above program, we can declare variables to refer to an object as: 

```java
Student student;
Student student2;
Student student3;
```

### Instantiating a Class

The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the object constructor.

**For example:**
```java
Student student = new Student("Ramesh", "BVB");
Student student2 = new Student("Prakash", "GEC");
Student student3 = new Student("Pramod", "IIT");
```
**Note that we have used a new keyword to create Student objects.**

### Initializing an Object
The new keyword is followed by a call to a constructor, which initializes the new object. For example:

```java
Student student = new Student("Ramesh", "BVB");
Student student2 = new Student("Prakash", "GEC");
Student student3 = new Student("Pramod", "IIT");
```

> From above code will call below constructor in Student class.
```java
public class Student { 
    private String name; 
    private String college; 

    public Student(String name, String college) { 
        super(); 
        this.name = name; 
        this.college = college; 
    } 
}
```
# 2. Class

A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. In short, a class is the **specification or template of an object**.

A real-world example is **Circle**. Let’s look at an example of a class and analyze its various parts in a below diagram. This example declares the class **Circle**, which has the member variables x, y, and radius of type Integer and the two member methods, `area()` and `fillColor()`.

```java
class Circle{  // class: Keyword, Circle: Class name
    int x, y, radius; //Member Variable

    void area() {
        //method body
    }
    void fillColor(){ //Member Methods
    }
}
```


### Class Example with Constructor

```java
class Mobile {

    String brand;
    int price;

    // Constructor
    Mobile(String b, int p) {
        brand = b;
        price = p;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 25000);
        Mobile m2 = new Mobile("iPhone", 80000);

        m1.showDetails();
        m2.showDetails();
    }
}
```