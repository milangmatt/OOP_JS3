package module_3;

import java.io.Serializable;
public class M3_p6_Serialization implements Serializable{
int id;
String name;
public M3_p6_Serialization(int id, String name) {
this.id = id;
this.name = name;
}
}

import java.io.*;
class Persist{
public static void main(String args[]){
try{
//Creating the object
M3_p6_Serialization s1 =new M3_p6_Serialization(211,"ravi");
//Creating stream and writing the object
FileOutputStream fout=new FileOutputStream("f.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
//closing the stream
out.close();
System.out.println("success");
}catch(Exception e){System.out.println(e);}
}
}
import java.io.*;
class Depersist{
public static void main(String args[]){
try{
//Creating stream to read the object
ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));

Student s=(Student)in.readObject();
//printing the data of the serialized object
System.out.println(s.id+" "+s.name);
//closing the stream
in.close();
}catch(Exception e){System.out.println(e);}
}
}