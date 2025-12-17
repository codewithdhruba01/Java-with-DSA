// Abstract Class Example
abstract class Shape {
    String color;
    String name;

    // Constructor in abstract class
    Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    // Abstract methods - must be implemented by subclasses
    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract void draw();

    // Concrete method
    void setColor(String color) {
        this.color = color;
    }

    void displayInfo() {
        System.out.println("Shape: " + name + ", Color: " + color);
    }

    // Final method - cannot be overridden
    final void showCategory() {
        System.out.println(name + " is a 2D geometric shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Red", "Circle");
        this.radius = radius;
    }

    Circle(double radius, String color) {
        super(color, "Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    // Additional method specific to Circle
    void roll() {
        System.out.println("Circle is rolling...");
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super("Blue", "Rectangle");
        this.length = length;
        this.width = width;
    }

    Rectangle(double length, double width, String color) {
        super(color, "Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle " + length + "x" + width);
    }

    // Additional method specific to Rectangle
    boolean isSquare() {
        return length == width;
    }
}

class Triangle extends Shape {
    double base, height, side1, side2;

    Triangle(double base, double height, double side1, double side2) {
        super("Green", "Triangle");
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return base + side1 + side2;
    }

    @Override
    void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }
}

// Interface Examples
interface Drawable {
    // All methods are public and abstract by default
    void draw();
    void resize(double factor);
    double PI = 3.14159; // public static final by default
}

interface Movable {
    void move(int x, int y);
    void rotate(double angle);
}

interface Playable {
    void play();
    void pause();
    void stop();
}

// Multiple inheritance through interfaces
class GameObject implements Drawable, Movable {
    String name;
    int x, y;
    double size;

    GameObject(String name, int x, int y, double size) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + " at (" + x + "," + y + ") with size " + size);
    }

    @Override
    public void resize(double factor) {
        size *= factor;
        System.out.println(name + " resized to " + size);
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println(name + " moved to (" + x + "," + y + ")");
    }

    @Override
    public void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees");
    }
}

class MediaPlayer implements Playable {
    String mediaFile;
    boolean isPlaying;

    MediaPlayer(String mediaFile) {
        this.mediaFile = mediaFile;
        this.isPlaying = false;
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Playing: " + mediaFile);
    }

    @Override
    public void pause() {
        isPlaying = false;
        System.out.println("Paused: " + mediaFile);
    }

    @Override
    public void stop() {
        isPlaying = false;
        System.out.println("Stopped: " + mediaFile);
    }

    public void showStatus() {
        System.out.println(mediaFile + " is " + (isPlaying ? "playing" : "not playing"));
    }
}

// Class implementing multiple interfaces
class VideoGame extends GameObject implements Playable {
    String genre;
    boolean isPaused;

    VideoGame(String name, int x, int y, double size, String genre) {
        super(name, x, y, size);
        this.genre = genre;
        this.isPaused = false;
    }

    // Implementing Playable interface
    @Override
    public void play() {
        isPaused = false;
        System.out.println("Starting " + genre + " game: " + name);
    }

    @Override
    public void pause() {
        isPaused = true;
        System.out.println("Paused game: " + name);
    }

    @Override
    public void stop() {
        isPaused = false;
        System.out.println("Stopped game: " + name);
    }

    void showGameInfo() {
        System.out.println("Game: " + name + ", Genre: " + genre + ", Position: (" + x + "," + y + ")");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class Example ===");

        // Cannot instantiate abstract class: Shape s = new Shape(); // Error!

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(6.0, 4.0, 5.0, 5.0);

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            shape.displayInfo();
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.showCategory(); // Final method
            System.out.println();
        }

        // Specific methods
        ((Circle) circle).roll();
        System.out.println("Rectangle is square: " + ((Rectangle) rectangle).isSquare());

        System.out.println("\n=== Interface Examples ===");

        // Interface constants
        System.out.println("PI constant from Drawable interface: " + Drawable.PI);

        // Single interface implementation
        GameObject player = new GameObject("Player", 10, 20, 1.0);
        player.draw();
        player.resize(2.0);
        player.move(5, -3);
        player.rotate(45);

        System.out.println();

        // Media player example
        MediaPlayer musicPlayer = new MediaPlayer("song.mp3");
        musicPlayer.play();
        musicPlayer.showStatus();
        musicPlayer.pause();
        musicPlayer.showStatus();
        musicPlayer.stop();

        System.out.println();

        // Multiple interface implementation
        VideoGame game = new VideoGame("Space Invaders", 0, 0, 1.0, "Arcade");
        game.showGameInfo();
        game.draw();
        game.play();
        game.move(10, 15);
        game.pause();
        game.resize(1.5);
        game.stop();

        System.out.println("\n=== Polymorphism with Abstraction ===");

        // Using interfaces for polymorphism
        Drawable[] drawables = {player, game};
        System.out.println("Drawing all drawable objects:");
        for (Drawable drawable : drawables) {
            drawable.draw();
        }

        Playable[] playables = {musicPlayer, game};
        System.out.println("\nPlaying all playable objects:");
        for (Playable playable : playables) {
            playable.play();
            playable.pause();
            playable.stop();
            System.out.println();
        }
    }
}
