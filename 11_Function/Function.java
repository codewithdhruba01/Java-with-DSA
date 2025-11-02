import java.util.*;

public class Function {
    public static void printMyName(String name) { // Function Definition
        System.out.println("My name is " + name);
        return;
    }

    public static void main(String args[]) { // Main Function
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name); // Function Call
      
    }
}
