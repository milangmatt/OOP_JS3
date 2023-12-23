package module_3.M3_p5_Input_output;

import java.io.PrintWriter;
// this is a program that is used to demonstrate the use of a printWriter
public class Print_Writer_demo {
    public static void main(String args[]) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("This is a string");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
        //the character stream of the values passed to print ln is printed out
    }

}
