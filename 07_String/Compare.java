public class Compare {
    public static void main(String args[]) {
        String name1 = "Dhrubaraj";
        String name2 = "Dhrubaraj";

        // case status compare
        // case1 string1 > string2 : positive value
        // case2 string1 < string2 : negative value
        // case3 string1 == string2 : 0
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
