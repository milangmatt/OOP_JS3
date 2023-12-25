package module_4.M4_p2_Strings;

public class String_searching {
    public static void main(String[] args) {
        // Example String
        String mainString = "Java is fun, and Java is powerful.";

        // Example 1: indexOf() with substring
        int indexOfJava = mainString.indexOf("Java");
        System.out.println("indexOf(\"Java\"): " + indexOfJava);

        // Example 2: indexOf() with character
        int indexOfComma = mainString.indexOf(',');
        System.out.println("indexOf(','): " + indexOfComma);

        // Example 3: indexOf() with start index
        int indexOfSecondJava = mainString.indexOf("Java", indexOfJava + 1);
        System.out.println("indexOf(\"Java\", startIndex): " + indexOfSecondJava);

        // Example 4: lastIndexOf() with substring
        int lastIndexOfJava = mainString.lastIndexOf("Java");
        System.out.println("lastIndexOf(\"Java\"): " + lastIndexOfJava);

        // Example 5: lastIndexOf() with character
        int lastIndexOfComma = mainString.lastIndexOf(',');
        System.out.println("lastIndexOf(','): " + lastIndexOfComma);

        // Example 6: lastIndexOf() with start index
        int lastIndexOfSecondJava = mainString.lastIndexOf("Java", lastIndexOfJava - 1);
        System.out.println("lastIndexOf(\"Java\", startIndex): " + lastIndexOfSecondJava);
    }
}
