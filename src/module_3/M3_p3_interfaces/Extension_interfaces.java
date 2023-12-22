package module_3.M3_p3_interfaces;

interface A{
    void method_1();
    void method_2();
}
interface B extends A{
    void method_3();
}
//here interface B extends A so any class implementing class B has to implement all the methods in both interfaces A and B
class Implementer implements B{
    //method 1 implementation
    public void method_1(){
        System.out.println("method 1");
    }
    //method 2 implementation
    public void method_2(){
        System.out.println("method 2");
    }
    //method 3 implementation
    public void method_3(){
        System.out.println("method 3");
    }
}
public class Extension_interfaces {
    public static void main(String[] args) {
        Implementer imply = new Implementer();
        imply.method_1();
        imply.method_2();
        imply.method_3();
    }
}
