package module_3.M3_p6_serialization;

import java.io.Serializable;
//this is a public class declaration that is being serialized in Serializer.java
public class Student implements Serializable {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}