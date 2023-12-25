package module_4.M4_p2_Strings;

// this program is to demonstrate
//lenght
//concatenation
//valueOf 
//toString mehtods of String class
public class StringBasics {
    public static void main(String[] args) {
        // Example 1: length()
        String str1 = "Hello, World!";
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // Example 2: Concatenation using +
        String str2 = "Java";
        String resultConcatenation = str1 + " " + str2;
        System.out.println("Concatenated String: " + resultConcatenation);

        // Example 3: valueOf()
        int num = 42;
        String str3 = String.valueOf(num);
        System.out.println("String representation of num: " + str3);

        // Example 4: toString()
        double dbl = 3.14;
        String str4 = Double.toString(dbl);
        System.out.println("String representation of dbl: " + str4);
    }
}
