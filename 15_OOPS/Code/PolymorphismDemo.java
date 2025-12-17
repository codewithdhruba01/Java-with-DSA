// Compile-time Polymorphism - Method Overloading
class Calculator {
    // Method overloading - same method name, different parameters

    // Method 1: Two integers
    int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }

    // Method 2: Three integers
    int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }

    // Method 3: Two doubles
    double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }

    // Method 4: Array of integers
    int add(int[] numbers) {
        int sum = 0;
        System.out.print("Adding array: ");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) System.out.print(" + ");
        }
        System.out.println();
        return sum;
    }

    // Method overloading with different data types
    String concatenate(String a, String b) {
        return a + " " + b;
    }

    String concatenate(String a, String b, String c) {
        return a + " " + b + " " + c;
    }

    String concatenate(int a, String b) {
        return a + " " + b;
    }
}

// Runtime Polymorphism - Method Overriding
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }

    @Override
    void eat() {
        System.out.println(name + " eats dog food");
    }

    void fetch() {
        System.out.println(name + " is fetching the ball");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows: Meow Meow!");
    }

    @Override
    void eat() {
        System.out.println(name + " eats cat food");
    }

    void climbTree() {
        System.out.println(name + " is climbing the tree");
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " chirps: Tweet Tweet!");
    }

    @Override
    void eat() {
        System.out.println(name + " eats seeds");
    }

    void fly() {
        System.out.println(name + " is flying");
    }
}

// Shape hierarchy for more polymorphism examples
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }

    void area() {
        System.out.println("Calculating area of generic shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle " + length + "x" + width);
    }

    @Override
    void area() {
        System.out.println("Area of rectangle: " + (length * width));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }

    @Override
    void area() {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== Compile-time Polymorphism (Method Overloading) ===");

        Calculator calc = new Calculator();

        System.out.println("Result: " + calc.add(5, 10));
        System.out.println("Result: " + calc.add(5, 10, 15));
        System.out.println("Result: " + calc.add(5.5, 10.3));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + calc.add(numbers));

        System.out.println("\nString concatenation:");
        System.out.println(calc.concatenate("Hello", "World"));
        System.out.println(calc.concatenate("Hello", "Beautiful", "World"));
        System.out.println(calc.concatenate(2024, "Year"));

        System.out.println("\n=== Runtime Polymorphism (Method Overriding) ===");

        // Animal polymorphism
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Tweety");

        Animal[] animals = {dog, cat, bird};

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.sleep();
            System.out.println();
        }

        // Specific methods (not available through Animal reference)
        System.out.println("Specific animal behaviors:");
        ((Dog) dog).fetch();
        ((Cat) cat).climbTree();
        ((Bird) bird).fly();

        System.out.println("\n=== Shape Polymorphism ===");

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0);

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            shape.draw();
            shape.area();
            System.out.println();
        }

        System.out.println("=== Dynamic Method Dispatch ===");
        // The method called depends on the actual object type at runtime
        Shape s1 = new Circle(3.0);    // Circle object
        Shape s2 = new Rectangle(5.0, 8.0); // Rectangle object

        s1.draw(); // Calls Circle's draw()
        s1.area(); // Calls Circle's area()

        s2.draw(); // Calls Rectangle's draw()
        s2.area(); // Calls Rectangle's area()
    }
}
