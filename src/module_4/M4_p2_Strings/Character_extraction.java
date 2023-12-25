package module_4.M4_p2_Strings;

public class Character_extraction {
    public static void main(String[] args) {
        // Example 1: charAt()
        String str = "Hello, World!";
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Example 2: getChars()
        char[] charArray = new char[5];
        str.getChars(7, 12, charArray, 0);
        System.out.print("Characters extracted using getChars(): ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        // Example 3: getBytes()
        byte[] byteArr = str.getBytes();
        System.out.print("Bytes extracted using getBytes(): ");
        for (byte b : byteArr) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Example 4: toCharArray()
        char[] charArray2 = str.toCharArray();
        System.out.print("Characters extracted using toCharArray(): ");
        for (char c : charArray2) {
            System.out.print(c);
        }
        System.out.println();
    }
}
