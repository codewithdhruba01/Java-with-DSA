public class TowerOfHanoi {
    // Recursive function to solve Tower of Hanoi
    static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: If only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary rod
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);

        // Step 2: Move nth disk from source to destination rod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Step 3: Move n-1 disks from auxiliary to destination rod
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    // Function to calculate minimum moves required
    static int calculateMoves(int n) {
        // Formula: 2^n - 1
        if (n == 0) return 0;
        return (int) Math.pow(2, n) - 1;
    }

    // Visualize the state (conceptual representation)
    static void visualizeTowers(int[] towerA, int[] towerB, int[] towerC, int n) {
        System.out.println("\nTower State:");
        System.out.println("A: " + java.util.Arrays.toString(towerA));
        System.out.println("B: " + java.util.Arrays.toString(towerB));
        System.out.println("C: " + java.util.Arrays.toString(towerC));
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks

        System.out.println("=== Tower of Hanoi Problem ===");
        System.out.println("Number of disks: " + n);
        System.out.println("Minimum moves required: " + calculateMoves(n));
        System.out.println("Solution steps:");
        System.out.println();

        // Solve the problem
        towerOfHanoi(n, 'A', 'C', 'B'); // A = source, B = auxiliary, C = destination

        System.out.println("\n=== Analysis ===");
        System.out.println("For " + n + " disks:");
        System.out.println("- Total moves: " + calculateMoves(n));
        System.out.println("- Time Complexity: O(2^n)");
        System.out.println("- Space Complexity: O(n) due to recursion stack");

        System.out.println("\n=== Tower of Hanoi for Different Sizes ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Disks: " + i + " -> Moves: " + calculateMoves(i));
        }

        // Demonstrate with 4 disks (commented out as it produces many lines)
//        System.out.println("\n=== 4 Disks Solution ===");
//        towerOfHanoi(4, 'A', 'C', 'B');
    }
}
