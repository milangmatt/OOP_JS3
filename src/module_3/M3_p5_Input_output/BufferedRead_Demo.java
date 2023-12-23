package module_3.M3_p5_Input_output;

import java.io.*;

//this is a program used to demonstrate the use of a Buffered Reader
public class BufferedRead_Demo {
    public static void main(String args[]) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, 'q' to quit.");
        // read characters
        int i = 1;// counter
        do {
            c = (char) br.read();
            // the reader accepts characters and stores them in the buffer and when ENTER is
            // pressed the buffer is cleared character by characters
            System.out.println("Charachter in at " + i + ": " + c);
            i++;
        } while (c != 'q');
        // whenever a "q" is parsed the reading terminates
    }

}
