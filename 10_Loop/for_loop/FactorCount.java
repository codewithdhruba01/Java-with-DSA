import java.util.Scanner;

public class FactorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) count++;  // perfect square
                else count += 2;          // i and n/i
            }
        }
        System.out.println("Number of factors = " + count);
    }
}
