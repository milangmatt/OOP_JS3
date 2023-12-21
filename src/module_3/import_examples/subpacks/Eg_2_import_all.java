package module_3.import_examples.subpacks;

import module_3.import_examples.mainpack.*;

// Importing all classes from a subpackage using the "*" wildcard character

public class Eg_2_import_all {
    public static void main(String[] args) {
        ImportIn impin = new ImportIn();
        impin.msg();
        System.out.println("c= "+impin.c);
        //trying to access a will give an error
        //trying to access d will also give error
        //this is because only one instance variable and a method is the only public specified 
    }
}
// The Importin class comes from mainpack package that is not even a member of subpacks package