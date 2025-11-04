// Find the Sum and Average of Array Elements
// Find the total sum and average of all numbers in the array.

public class sum {
   public static void main (String[] args){
     int[] arr = {5, 10, 15, 20, 25};
     int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        double avg = sum / arr.length;

        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + avg);
   } 
}
