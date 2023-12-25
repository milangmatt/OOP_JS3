package module_4;

public class M4_p3_StringBuffer {
    public static void main(String[] args) {
        // Example 1: Creating a StringBuffer using default constructor
        StringBuffer stringBuffer1 = new StringBuffer();
        System.out.println("StringBuffer 1: " + stringBuffer1);

        // Example 2: Creating a StringBuffer with initial capacity
        StringBuffer stringBuffer2 = new StringBuffer(20);
        System.out.println("StringBuffer 2: " + stringBuffer2);

        // Example 3: Creating a StringBuffer from a String
        StringBuffer stringBuffer3 = new StringBuffer("Hello");
        System.out.println("StringBuffer 3: " + stringBuffer3);

        // Example 4: Using length() and capacity()
        System.out.println("Length of StringBuffer 3: " + stringBuffer3.length());
        System.out.println("Capacity of StringBuffer 3: " + stringBuffer3.capacity());

        // Example 5: Using ensureCapacity()
        stringBuffer3.ensureCapacity(30);
        System.out.println("Updated Capacity of StringBuffer 3: " + stringBuffer3.capacity());

        // Example 6: Using setLength()
        stringBuffer3.setLength(3);
        System.out.println("Updated Length of StringBuffer 3: " + stringBuffer3);

        // Example 7: Using charAt()
        char charAtIndex = stringBuffer3.charAt(1);
        System.out.println("Character at index 1: " + charAtIndex);

        // Example 8: Using setCharAt()
        stringBuffer3.setCharAt(1, 'i');
        System.out.println("After setting character at index 1: " + stringBuffer3);

        // Example 9: Using getChars()
        char[] charArray = new char[3];
        stringBuffer3.getChars(0, 3, charArray, 0);
        System.out.print("Characters extracted using getChars(): ");
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();

        // Example 10: Using append()
        stringBuffer3.append("p!");
        System.out.println("After appending 'p!': " + stringBuffer3);

        // Example 11: Using insert()
        stringBuffer3.insert(0, "Hi ");
        System.out.println("After inserting 'Hi ' at the beginning: " + stringBuffer3);

        // Example 12: Using reverse()
        stringBuffer3.reverse();
        System.out.println("After reversing: " + stringBuffer3);

        // Example 13: Using delete()
        stringBuffer3.delete(0, 3);
        System.out.println("After deleting characters from 0 to 2: " + stringBuffer3);

        // Example 14: Using deleteCharAt()
        stringBuffer3.deleteCharAt(2);
        System.out.println("After deleting character at index 2: " + stringBuffer3);

        // Example 15: Using replace()
        stringBuffer3.replace(0, 2, "He");
        System.out.println("After replacing characters from 0 to 1 with 'He': " + stringBuffer3);

        // Example 16: Using substring()
        String substring = stringBuffer3.substring(1, 4);
        System.out.println("Substring from index 1 to 3: " + substring);
    }
}
