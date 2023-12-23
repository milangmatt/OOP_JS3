package module_3.M3_p7_FIle_handling;

import java.io.FileInputStream;
import java.io.IOException;

public class Read_from_file {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "output.txt";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Read bytes from the file
            int data;
            while ((data = fis.read()) != -1) {
                // Convert byte to char and print
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//these programs have not used a fileobject.close() method as it is in a try block and it closes all the files on its own