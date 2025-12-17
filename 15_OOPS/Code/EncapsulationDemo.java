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

    // Getter for account number (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }
}

class Employee {
    // Private fields
    private int id;
    private String name;
    private double salary;
    private String department;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // Setters with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        }
    }

    // Method to give raise
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            double raise = salary * (percentage / 100);
            salary += raise;
            System.out.println(name + " got a raise of " + percentage + "%. New salary: " + salary);
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Bank Account Example
        System.out.println("=== Bank Account Example ===");
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000); // Should fail

        System.out.println("Final Balance: " + account.getBalance());

        System.out.println("\n=== Employee Example ===");
        Employee emp = new Employee(101, "Alice Johnson", 50000, "IT");

        emp.displayInfo();
        emp.giveRaise(10); // 10% raise
        emp.setDepartment("Software Development");
        emp.displayInfo();

        // Trying to set invalid data
        emp.setSalary(-1000); // Should not work
        emp.setName(""); // Should not work
        emp.displayInfo();
    }
}
