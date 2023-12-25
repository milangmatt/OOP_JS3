package module_4.M4_p2_Strings;

public class String_comparison {
    public static void main(String[] args) {
        // Example Strings
        String str1 = "Hello, World!";
        String str2 = "hello, world!";
        String str3 = "Hello, Java!";

        // Example 1: equals()
        System.out.println("Using equals(): " + str1.equals(str2));

        // Example 2: equalsIgnoreCase()
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

        // Example 3: compareTo()
        System.out.println("Using compareTo(): " + str1.compareTo(str3));

        // Example 4: regionMatches()
        System.out.println("Using regionMatches(): " + str1.regionMatches(0, str2, 0, 5));

        // Example 5: compareToIgnoreCase()
        System.out.println("Using compareToIgnoreCase(): " + str1.compareToIgnoreCase(str2));

        // Example 6: endsWith()
        System.out.println("Using endsWith(): " + str1.endsWith("World!"));

        // Example 7: startsWith()
        System.out.println("Using startsWith(): " + str1.startsWith("Hello"));
    }
}
