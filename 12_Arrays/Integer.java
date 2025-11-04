// Write a Java program to store 5 integers in an array and print them one by one.

public class Integer{
    public static void main (String[] args){
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " : " + numbers[i]);
        }
    }
}