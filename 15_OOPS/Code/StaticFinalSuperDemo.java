// Static Keyword Examples
class Counter {
    // Static variable - shared by all objects of the class
    static int objectCount = 0;

    // Instance variable - unique to each object
    int instanceId;

    // Static constant
    static final String CLASS_NAME = "Counter";

    Counter() {
        objectCount++; // Increment static variable
        instanceId = objectCount; // Assign unique ID
    }

    // Static method - can be called without creating object
    static void showTotalObjects() {
        System.out.println("Total objects created: " + objectCount);
        // Cannot access instance variables in static methods
        // System.out.println(instanceId); // Error!
    }

    // Static method accessing static variables
    static void resetCounter() {
        objectCount = 0;
        System.out.println("Counter reset to zero");
    }

    // Instance method
    void showInstanceInfo() {
        System.out.println("Instance ID: " + instanceId + ", Total objects: " + objectCount);
    }
}

class MathUtils {
    // Static constants
    static final double PI = 3.14159;
    static final double E = 2.71828;

    // Static methods - utility functions
    static int add(int a, int b) {
        return a + b;
    }

    static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    static double calculatePower(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Static block - executed when class is loaded
    static {
        System.out.println("MathUtils class loaded with constants:");
        System.out.println("PI = " + PI);
        System.out.println("E = " + E);
    }
}

// Final Keyword Examples
final class Constants {
    // Final variables - cannot be changed
    final static double GRAVITY = 9.81;
    final static int MAX_STUDENTS = 100;
    final String universityName;

    // Final variable must be initialized in constructor or declaration
    Constants(String universityName) {
        this.universityName = universityName;
    }

    // Final method - cannot be overridden
    final void showConstants() {
        System.out.println("Gravity: " + GRAVITY);
        System.out.println("Max Students: " + MAX_STUDENTS);
        System.out.println("University: " + universityName);
    }
}

// Cannot extend final class
// class ExtendedConstants extends Constants { // Error!
// }

class Calculator {
    final int MAX_VALUE = 1000;
    final String CALCULATOR_TYPE;

    Calculator(String type) {
        this.CALCULATOR_TYPE = type; // Final instance variable initialized in constructor
    }

    // Method with final parameter
    int add(final int a, final int b) {
        // a = 10; // Error! Cannot modify final parameter
        // b = 20; // Error! Cannot modify final parameter
        return a + b;
    }

    void showLimits() {
        System.out.println("Calculator Type: " + CALCULATOR_TYPE);
        System.out.println("Max Value: " + MAX_VALUE);
    }
}

// Super Keyword Examples
class Parent {
    String name = "Parent";
    int age = 50;

    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent parameterized constructor: " + name);
    }

    void display() {
        System.out.println("Parent - Name: " + name + ", Age: " + age);
    }

    void work() {
        System.out.println(name + " is working as a parent");
    }

    void showInfo() {
        System.out.println("This is parent class info");
    }
}

class Child extends Parent {
    String name = "Child"; // Variable hiding
    int age = 20;
    String school;

    Child() {
        // super(); // Implicitly called if not specified
        System.out.println("Child default constructor");
    }

    Child(String name, int age, String school) {
        super(name + "'s Parent", age + 20); // Call parent constructor
        this.name = name;
        this.age = age;
        this.school = school;
        System.out.println("Child parameterized constructor: " + name);
    }

    @Override
    void display() {
        System.out.println("Child - Name: " + name + ", Age: " + age + ", School: " + school);
        System.out.println("Parent - Name: " + super.name + ", Age: " + super.age); // Access parent variables
    }

    @Override
    void work() {
        System.out.println(name + " is studying");
        super.work(); // Call parent method
    }

    void showAllInfo() {
        showInfo();        // Calls child's showInfo (if overridden) or parent's
        super.showInfo();  // Explicitly calls parent's showInfo
    }

    @Override
    void showInfo() {
        System.out.println("This is child class info - Student at " + school);
    }
}

class GrandChild extends Child {
    String hobby;

    GrandChild(String name, int age, String school, String hobby) {
        super(name, age, school); // Call Child constructor
        this.hobby = hobby;
    }

    @Override
    void display() {
        super.display(); // Call Child's display
        System.out.println("GrandChild - Hobby: " + hobby);
    }

    void showFamilyInfo() {
        System.out.println("Family hierarchy:");
        display(); // Shows all info from GrandChild -> Child -> Parent
    }
}

public class StaticFinalSuperDemo {
    public static void main(String[] args) {
        System.out.println("=== Static Keyword Examples ===");

        // Static variables and methods
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Call static method using class name
        Counter.showTotalObjects();

        c1.showInstanceInfo();
        c2.showInstanceInfo();
        c3.showInstanceInfo();

        Counter.resetCounter();
        Counter.showTotalObjects();

        System.out.println("\n=== MathUtils Static Examples ===");
        // Static methods and constants
        System.out.println("Addition: " + MathUtils.add(10, 20));
        System.out.println("Circle Area: " + MathUtils.calculateCircleArea(5));
        System.out.println("Power: " + MathUtils.calculatePower(2, 3));
        System.out.println("PI value: " + MathUtils.PI);

        System.out.println("\n=== Final Keyword Examples ===");

        Constants constObj = new Constants("Harvard University");
        constObj.showConstants();

        Calculator calc = new Calculator("Scientific");
        calc.showLimits();
        System.out.println("Addition result: " + calc.add(50, 30));

        System.out.println("\n=== Super Keyword Examples ===");

        System.out.println("1. Default constructors:");
        Child child1 = new Child();

        System.out.println("\n2. Parameterized constructors with super():");
        Child child2 = new Child("Alice", 15, "Springfield High");

        System.out.println("\n3. Method overriding and variable hiding:");
        child2.display();

        System.out.println("\n4. Calling parent methods with super:");
        child2.work();

        System.out.println("\n5. Multilevel inheritance:");
        GrandChild grandChild = new GrandChild("Bob", 10, "Elementary School", "Drawing");
        grandChild.showFamilyInfo();

        System.out.println("\n6. Super in method calls:");
        grandChild.showAllInfo();

        System.out.println("\n=== Key Points Summary ===");
        System.out.println("Static: Shared by all objects, accessed without instance");
        System.out.println("Final: Cannot be changed/modified/overridden");
        System.out.println("Super: Access parent class members and constructors");
    }
}
