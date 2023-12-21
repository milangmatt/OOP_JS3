package module_3.import_examples.subpacks;

// this example does not use import 
//statement but uses the proper classpath
public class Eg_1_no_import {
    public static void main(String[] args) {
        module_3.import_examples.mainpack.ImportIn impin = new module_3.import_examples.mainpack.ImportIn();
        impin.msg();
        System.out.println("c= "+impin.c);
        //trying to access a will give an error
        //trying to access d will also give error
        //this is because only one instance variable and a method is the only public specified 
    }
   
}
