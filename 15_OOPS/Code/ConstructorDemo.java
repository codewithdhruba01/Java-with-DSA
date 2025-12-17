class Student {
    String name;
    int age;
    String course;
    String college;
    double gpa;

    // Default Constructor
    Student() {
        System.out.println("Default constructor called");
        this.college = "Default College";
        this.gpa = 0.0;
    }

    // Parameterized Constructor - Single parameter
    Student(String name) {
        this(); // Constructor chaining - calls default constructor
        this.name = name;
        System.out.println("Single parameter constructor called for: " + name);
    }

    // Parameterized Constructor - Two parameters
    Student(String name, int age) {
        this(name); // Constructor chaining - calls single parameter constructor
        this.age = age;
        System.out.println("Two parameter constructor called for: " + name + ", age: " + age);
    }

    // Parameterized Constructor - Three parameters
    Student(String name, int age, String course) {
        this(name, age); // Constructor chaining - calls two parameter constructor
        this.course = course;
        System.out.println("Three parameter constructor called for: " + name + " in " + course);
    }

    // Full parameterized constructor
    Student(String name, int age, String course, String college, double gpa) {
        this(name, age, course); // Constructor chaining
        this.college = college;
        this.gpa = gpa;
        System.out.println("Full constructor called for: " + name);
    }

    // Copy Constructor
    Student(Student other) {
        this(other.name, other.age, other.course, other.college, other.gpa);
        System.out.println("Copy constructor called - created copy of: " + other.name);
    }

    // Method overloading example
    void updateDetails(String name) {
        this.name = name;
        System.out.println("Name updated to: " + name);
    }

    void updateDetails(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name and age updated: " + name + ", " + age);
    }

    void updateDetails(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        System.out.println("All details updated: " + name + ", " + age + ", GPA: " + gpa);
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Course: " + this.course +
                          ", College: " + this.college + ", GPA: " + this.gpa);
    }
}

class Car {
    String brand;
    String model;
    int year;
    String color;
    double price;

    // Default constructor
    Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 2024;
        this.color = "White";
        this.price = 0.0;
        System.out.println("Default Car constructor called");
    }

    // Constructor with brand and model
    Car(String brand, String model) {
        this(); // Call default constructor first
        this.brand = brand;
        this.model = model;
        System.out.println("Car constructor with brand and model called");
    }

    // Constructor with all details
    Car(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        System.out.println("Full Car constructor called for " + brand + " " + model);
    }

    // Using 'this' to differentiate instance variables from parameters
    void updateCar(String brand, String model, int year) {
        this.brand = brand;  // 'this.brand' refers to instance variable
        this.model = model;  // 'this.model' refers to instance variable
        this.year = year;    // 'this.year' refers to instance variable
        System.out.println("Car updated: " + this.brand + " " + this.model + " " + this.year);
    }

    // Method that returns 'this' for method chaining
    Car setBrand(String brand) {
        this.brand = brand;
        return this; // Return current object for chaining
    }

    Car setModel(String model) {
        this.model = model;
        return this;
    }

    Car setYear(int year) {
        this.year = year;
        return this;
    }

    Car setPrice(double price) {
        this.price = price;
        return this;
    }

    void display() {
        System.out.println("Car: " + brand + " " + model + " (" + year + "), Color: " + color + ", Price: $" + price);
    }
}

class Rectangle {
    int length;
    int width;

    // Constructor overloading
    Rectangle() {
        this(1, 1); // Call parameterized constructor
    }

    Rectangle(int side) {
        this(side, side); // Call parameterized constructor for square
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }

    int perimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Rectangle: " + length + " x " + width + ", Area: " + area() + ", Perimeter: " + perimeter());
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("=== Constructor Chaining and this() Examples ===");

        System.out.println("\n1. Default constructor:");
        Student s1 = new Student();

        System.out.println("\n2. Single parameter constructor:");
        Student s2 = new Student("Alice");

        System.out.println("\n3. Two parameter constructor:");
        Student s3 = new Student("Bob", 20);

        System.out.println("\n4. Three parameter constructor:");
        Student s4 = new Student("Charlie", 22, "Computer Science");

        System.out.println("\n5. Full constructor:");
        Student s5 = new Student("Diana", 21, "Engineering", "MIT", 3.8);

        System.out.println("\n6. Copy constructor:");
        Student s6 = new Student(s5);

        System.out.println("\n=== Method Overloading with this ===");
        s2.updateDetails("Alice Johnson");
        s2.updateDetails("Alice Johnson", 21);
        s2.updateDetails("Alice Johnson", 21, 3.7);

        System.out.println("\n=== All Student Details ===");
        Student[] students = {s1, s2, s3, s4, s5, s6};
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            students[i].display();
        }

        System.out.println("\n=== Car Constructor Examples ===");

        System.out.println("\n1. Default Car:");
        Car car1 = new Car();
        car1.display();

        System.out.println("\n2. Car with brand and model:");
        Car car2 = new Car("Toyota", "Camry");
        car2.display();

        System.out.println("\n3. Full Car details:");
        Car car3 = new Car("Honda", "Civic", 2023, "Blue", 25000);
        car3.display();

        System.out.println("\n4. Using 'this' to update car:");
        car1.updateCar("Ford", "Mustang", 2024);

        System.out.println("\n5. Method chaining with 'this' return:");
        Car car4 = new Car()
            .setBrand("BMW")
            .setModel("X5")
            .setYear(2024)
            .setPrice(60000);
        car4.display();

        System.out.println("\n=== Rectangle Constructor Overloading ===");

        Rectangle rect1 = new Rectangle();        // Default 1x1
        Rectangle rect2 = new Rectangle(5);       // Square 5x5
        Rectangle rect3 = new Rectangle(4, 6);    // Rectangle 4x6

        Rectangle[] rectangles = {rect1, rect2, rect3};
        for (int i = 0; i < rectangles.length; i++) {
            System.out.print("Rectangle " + (i+1) + ": ");
            rectangles[i].display();
        }

        System.out.println("\n=== Key Points about Constructors ===");
        System.out.println("1. Constructor name must match class name");
        System.out.println("2. Constructor has no return type");
        System.out.println("3. 'this()' must be first statement in constructor");
        System.out.println("4. 'this' refers to current object instance");
        System.out.println("5. Constructor overloading allows multiple ways to create objects");
        System.out.println("6. Constructor chaining reduces code duplication");
    }
}
