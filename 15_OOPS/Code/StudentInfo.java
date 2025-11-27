class Student {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class StudentInfo {
    public static void main(String args[]) {
        Student student1 = new Student(); // new ke matlab hai ek naya object bna rhe hai
        student1.name = "Alice";
        student1.age = 20;

        Student student2 = new Student(); // student constructor call hoga
        student2.name = "Bob";
        student2.age = 22;

        student1.printInfo();
        student2.printInfo(); 
    }
}