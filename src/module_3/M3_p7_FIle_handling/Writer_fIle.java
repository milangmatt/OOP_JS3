package module_3.M3_p7_FIle_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer_fIle {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "Assets\\outputWriter.txt";
         //the file will be created in the src folder
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write lines to the file
            writer.write("Hello, this file is created with FileWriter");
            writer.newLine(); // Add a new line
            writer.write("And this can be read with FileReader");

            System.out.println("Data has been written to the file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//these programs have not used a fileobject.close() method as it is in a try block and it closes all the files on its own