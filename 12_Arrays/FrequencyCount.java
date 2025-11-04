import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 20};

        // Create a HashMap to store number-frequency pairs
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print each element and its frequency
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key) + " times");
        }
    }
}
