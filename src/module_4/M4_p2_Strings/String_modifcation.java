package module_4.M4_p2_Strings;

public class String_modifcation {
    public static void main(String[] args) {
        // Example String
        String originalString = "   Hello, World!   ";

        // Example 1: concat()
        String concatenatedString = originalString.concat(" Welcome");
        System.out.println("Concatenated String: " + concatenatedString);

        // Example 2: replace()
        String replacedString = originalString.replace("World", "Java");
        System.out.println("Replaced String: " + replacedString);

        // Example 3: trim()
        String trimmedString = originalString.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Example 4: substring()
        String substring = originalString.substring(7, 12);
        System.out.println("Substring: " + substring);
    }
}
