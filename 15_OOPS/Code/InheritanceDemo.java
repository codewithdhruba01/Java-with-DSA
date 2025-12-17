// Base class for Single and Multilevel Inheritance
class Vehicle {
    String brand;
    int speed;
    String fuelType;

    void start() {
        System.out.println(brand + " vehicle started");
    }

    void stop() {
        System.out.println(brand + " vehicle stopped");
    }

    void accelerate(int increment) {
        speed += increment;
        System.out.println(brand + " speed increased to: " + speed + " km/h");
    }
}

// Single Inheritance Example
class Car extends Vehicle {
    int wheels = 4;
    String carType;

    Car(String brand, String fuelType, String carType) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.carType = carType;
        this.speed = 0;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Type: " + carType + ", Wheels: " + wheels + ", Fuel: " + fuelType + ", Speed: " + speed);
    }

    void openSunroof() {
        System.out.println(brand + " sunroof opened");
    }
}

// Multilevel Inheritance Example
class ElectricCar extends Car {
    int batteryCapacity;
    int range;

    ElectricCar(String brand, String carType, int batteryCapacity, int range) {
        super(brand, "Electric", carType);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    void chargeBattery() {
        System.out.println(brand + " battery charging... Capacity: " + batteryCapacity + " kWh");
    }

    void showElectricDetails() {
        System.out.println("Battery: " + batteryCapacity + " kWh, Range: " + range + " km");
    }

    @Override
    void showDetails() {
        super.showDetails();
        showElectricDetails();
    }
}

// Hierarchical Inheritance - Another class extending Vehicle
class Bike extends Vehicle {
    int wheels = 2;
    String bikeType;

    Bike(String brand, String fuelType, String bikeType) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.bikeType = bikeType;
        this.speed = 0;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Type: " + bikeType + ", Wheels: " + wheels + ", Fuel: " + fuelType + ", Speed: " + speed);
    }

    void doWheelie() {
        if (speed > 30) {
            System.out.println(brand + " doing wheelie!");
        } else {
            System.out.println("Speed too low for wheelie");
        }
    }
}

// Another class for Hierarchical Inheritance
class Truck extends Vehicle {
    int loadCapacity;
    int wheels = 6;

    Truck(String brand, String fuelType, int loadCapacity) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.loadCapacity = loadCapacity;
        this.speed = 0;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels + ", Fuel: " + fuelType + ", Load Capacity: " + loadCapacity + " tons, Speed: " + speed);
    }

    void loadCargo() {
        System.out.println(brand + " loading cargo. Capacity: " + loadCapacity + " tons");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance Example ===");
        Car car = new Car("Toyota", "Petrol", "Sedan");
        car.start();
        car.accelerate(50);
        car.showDetails();
        car.openSunroof();
        car.stop();

        System.out.println("\n=== Multilevel Inheritance Example ===");
        ElectricCar eCar = new ElectricCar("Tesla", "SUV", 75, 400);
        eCar.start();
        eCar.accelerate(80);
        eCar.showDetails();
        eCar.chargeBattery();
        eCar.stop();

        System.out.println("\n=== Hierarchical Inheritance Examples ===");

        System.out.println("Bike:");
        Bike bike = new Bike("Honda", "Petrol", "Sports");
        bike.start();
        bike.accelerate(60);
        bike.showDetails();
        bike.doWheelie();
        bike.stop();

        System.out.println("\nTruck:");
        Truck truck = new Truck("Volvo", "Diesel", 20);
        truck.start();
        truck.accelerate(40);
        truck.showDetails();
        truck.loadCargo();
        truck.stop();

        System.out.println("\n=== Demonstrating Inheritance Benefits ===");
        // All vehicles can be treated as Vehicle objects (Polymorphism foundation)
        Vehicle[] vehicles = {car, eCar, bike, truck};
        System.out.println("All vehicles starting:");
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
