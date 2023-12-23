package module_3.M3_p7_FIle_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader_file {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "outputWriter.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read lines from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//these programs have not used a fileobject.close() method as it is in a try block and it closes all the files on its own