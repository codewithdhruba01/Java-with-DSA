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

# 3. Encapsulation

Encapsulation is the process of wrapping code and data together into a single unit. It is the mechanism that binds together code and the data it manipulates.

**Key Points:**
- Data hiding: Instance variables are kept private
- Access through public methods (getters/setters)
- Provides control over data access and modification
- Improves maintainability and security

### Real-World Example: Bank Account

A bank account encapsulates account balance and provides methods to deposit/withdraw money while keeping the balance secure.

```java
class BankAccount {
    // Private data - encapsulated
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access private data - controlled access
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // Should fail
    }
}
```

**Output:**
```
Account Holder: John Doe
Initial Balance: 1000.0
Deposited: 500.0, New Balance: 1500.0
Withdrawn: 200.0, New Balance: 1300.0
Insufficient balance or invalid amount
```

# 4. Inheritance

Inheritance is a mechanism in which one class acquires the property of another class. It represents IS-A relationship.

**Key Points:**
- Code reusability
- Method overriding
- Types: Single, Multilevel, Hierarchical, Multiple (through interfaces)
- Use `extends` keyword

### Real-World Example: Vehicle Hierarchy

```java
// Parent class
class Vehicle {
    String brand;
    int speed;

    void start() {
        System.out.println(brand + " vehicle started");
    }

    void stop() {
        System.out.println(brand + " vehicle stopped");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int wheels = 4;

    void accelerate() {
        speed += 20;
        System.out.println("Car speed increased to: " + speed + " km/h");
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels + ", Speed: " + speed);
    }
}

// Another child class
class Bike extends Vehicle {
    int wheels = 2;

    void accelerate() {
        speed += 15;
        System.out.println("Bike speed increased to: " + speed + " km/h");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 0;

        Bike bike = new Bike();
        bike.brand = "Honda";
        bike.speed = 0;

        car.start();
        car.accelerate();
        car.showDetails();
        car.stop();

        System.out.println();

        bike.start();
        bike.accelerate();
        bike.stop();
    }
}
```

**Output:**
```
Toyota vehicle started
Car speed increased to: 20 km/h
Brand: Toyota, Wheels: 4, Speed: 20
Toyota vehicle stopped

Honda vehicle started
Bike speed increased to: 15 km/h
Honda vehicle stopped
```

### Types of Inheritance

1. **Single Inheritance**: One class extends another class
2. **Multilevel Inheritance**: A class extends another class which is already extended
3. **Hierarchical Inheritance**: Multiple classes extend the same class

# 5. Polymorphism

Polymorphism means "many forms". It allows one interface to be used for different data types or classes.

**Types:**
1. **Compile-time Polymorphism** (Method Overloading)
2. **Runtime Polymorphism** (Method Overriding)

### Method Overloading (Compile-time Polymorphism)

```java
class Calculator {
    // Method overloading - same method name, different parameters

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.3));
    }
}
```

### Method Overriding (Runtime Polymorphism)

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting

        animal1.makeSound(); // Calls Dog's makeSound()
        animal2.makeSound(); // Calls Cat's makeSound()

        // Direct instantiation
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
```

**Output:**
```
Dog barks: Woof Woof!
Cat meows: Meow Meow!
Dog barks: Woof Woof!
Cat meows: Meow Meow!
```

# 6. Abstraction

Abstraction is the process of hiding implementation details and showing only functionality to the user.

**Ways to achieve abstraction:**
1. **Abstract Classes**: Cannot be instantiated, can have abstract methods
2. **Interfaces**: 100% abstraction, all methods are abstract by default

### Abstract Class Example

```java
abstract class Shape {
    String color;

    // Abstract method - must be implemented by subclasses
    abstract double calculateArea();

    // Concrete method
    void setColor(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.setColor("Red");
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4.0, 6.0);
        rectangle.setColor("Blue");
        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
```

### Interface Example

```java
interface Drawable {
    void draw(); // Abstract method by default
    double PI = 3.14159; // Constant (public static final by default)
}

interface Resizable {
    void resize(double factor);
}

class Square implements Drawable, Resizable {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side: " + side);
    }

    @Override
    public void resize(double factor) {
        side *= factor;
        System.out.println("Square resized to side: " + side);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        square.draw();
        square.resize(2.0);
        square.draw();
        System.out.println("PI value: " + Drawable.PI);
    }
}
```

# 7. Constructor and 'this' Keyword

### Constructor Types

```java
class Student {
    String name;
    int age;
    String course;

    // Default Constructor
    Student() {
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name; // 'this' refers to current object
        this.age = age;
    }

    // Constructor with all parameters
    Student(String name, int age, String course) {
        this(name, age); // Constructor chaining using 'this'
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Course: " + this.course);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(); // Default constructor
        Student s2 = new Student("Alice", 20); // Parameterized constructor
        Student s3 = new Student("Bob", 22, "Computer Science"); // Constructor chaining

        s2.display();
        s3.display();
    }
}
```

# 8. Static Keyword

```java
class Counter {
    static int count = 0; // Static variable - shared by all objects

    Counter() {
        count++; // Increments static variable
    }

    static void showCount() { // Static method
        System.out.println("Total objects created: " + count);
    }

    void displayInstanceCount() {
        System.out.println("Instance count: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.showCount(); // Call static method using class name

        c1.displayInstanceCount();
        c2.displayInstanceCount();
    }
}
```

**Output:**
```
Total objects created: 3
Instance count: 3
Instance count: 3
```

# 9. Final Keyword

```java
final class Constants { // Final class cannot be inherited
    final double PI = 3.14159; // Final variable - cannot be changed
    final void showPI() { // Final method - cannot be overridden
        System.out.println("PI value: " + PI);
    }
}

// class ExtendedConstants extends Constants { // Error: cannot inherit final class
// }

class Calculator {
    final int MAX_VALUE = 100;

    void calculate(final int x) { // Final parameter - cannot be modified
        // x = 20; // Error: cannot modify final parameter
        System.out.println("Calculating with: " + x);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Constants constObj = new Constants();
        constObj.showPI();

        Calculator calc = new Calculator();
        calc.calculate(10);
    }
}
```

# 10. Super Keyword

```java
class Parent {
    String name = "Parent";

    Parent() {
        System.out.println("Parent constructor");
    }

    Parent(String name) {
        this.name = name;
        System.out.println("Parent parameterized constructor");
    }

    void display() {
        System.out.println("Parent display: " + name);
    }
}

class Child extends Parent {
    String name = "Child";

    Child() {
        super(); // Calls parent default constructor
        System.out.println("Child constructor");
    }

    Child(String name) {
        super(name); // Calls parent parameterized constructor
        this.name = name;
        System.out.println("Child parameterized constructor");
    }

    void display() {
        System.out.println("Child display: " + name);
        System.out.println("Parent name using super: " + super.name); // Access parent variable
        super.display(); // Call parent method
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child child1 = new Child();
        System.out.println();

        Child child2 = new Child("John");
        System.out.println();

        child2.display();
    }
}
```

**Output:**
```
Parent constructor
Child constructor

Parent parameterized constructor
Child parameterized constructor

Child display: John
Parent name using super: John
Parent display: John
```

# Summary

OOP concepts work together to make code:
- **Modular**: Through classes and objects
- **Reusable**: Through inheritance
- **Maintainable**: Through encapsulation
- **Flexible**: Through polymorphism
- **Simple**: Through abstraction

Practice these concepts thoroughly as they form the foundation of Java programming!