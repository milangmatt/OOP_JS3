package module_3.M3_p6_serialization;

import java.io.*;

public class Serializer {
    public static void main(String args[]) {
        try {
            // Creating the object
            Student s1 = new Student(211, "Ravi");
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("Assets\\f.txt");
            //the FileOutputStream is created to store the ObjectOutput
            ObjectOutputStream out = new ObjectOutputStream(fout);
            //this is used to serialize the newly created object and store it to f.txt
            out.writeObject(s1);
            out.flush();
            // closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
        //the serialised object is stored in a file named f.txt that is created at src, that is the default location where the execution takes place
    }
}
