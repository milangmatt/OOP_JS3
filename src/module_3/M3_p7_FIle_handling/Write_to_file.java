package module_3.M3_p7_FIle_handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write_to_file {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "Assets\\output.txt";
        //the file will be created in the src folder
        try (FileOutputStream fout = new FileOutputStream(filePath)) {
            // Convert string data to bytes and write to the file
            String data = "Hello, this is line 1.\nAnd this is line 2.";
            byte[] bytes = data.getBytes();
            fout.write(bytes);

            System.out.println("Data has been written to the file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//these programs have not used a fileobject.close() method as it is in a try block and it closes all the files on its own