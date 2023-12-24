package module_4;

// this program demonstrate all of the constructors of the String Class we have learned so far
public class M4_p1_String_Constructors {
    public static void main(String[] args) {
        // Default constructor
        String defaultConstructor = new String();
        System.out.println("Default Constructor: " + defaultConstructor);

        // Constructors using character array
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String charArrayConstructor1 = new String(charArray);
        String charArrayConstructor2 = new String(charArray, 1, 3); // Starting from index 1, length 3
        System.out.println("CharArray Constructor 1: " + charArrayConstructor1);
        System.out.println("CharArray Constructor 2: " + charArrayConstructor2);

        // Constructors accepting byte array
        byte[] byteArray = { 72, 101, 108, 108, 111 }; // ASCII values for "Hello"
        String byteArrayConstructor1 = new String(byteArray);
        String byteArrayConstructor2 = new String(byteArray, 1, 3); // Starting from index 1, length 3
        System.out.println("ByteArray Constructor 1: " + byteArrayConstructor1);
        System.out.println("ByteArray Constructor 2: " + byteArrayConstructor2);

        // Constructor accepting String object
        String originalString = "Original String";
        String stringConstructor = new String(originalString);
        System.out.println("String Constructor: " + stringConstructor);

        // Constructor accepting StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("StringBuffer Content");
        String stringBufferConstructor = new String(stringBuffer);
        System.out.println("StringBuffer Constructor: " + stringBufferConstructor);

        // Constructor accepting StringBuilder object
        StringBuilder stringBuilder = new StringBuilder("StringBuilder Content");
        String stringBuilderConstructor = new String(stringBuilder);
        System.out.println("StringBuilder Constructor: " + stringBuilderConstructor);

        // Constructor using Unicode integer array
        int[] unicodeIntArray = { 72, 101, 108, 108, 111 }; // Unicode code points for "Hello"
        String unicodeArrayConstructor = new String(unicodeIntArray, 0, unicodeIntArray.length);
        System.out.println("Unicode Array Constructor: " + unicodeArrayConstructor);
    }
}
// The difference between the Unicode character set constructor and Ascii value
// btye array constructor is visible form the program the former is defined by
// an integer array where the latter is using a byte array