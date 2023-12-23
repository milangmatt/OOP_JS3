package module_3.M3_p4_exception_examples;

public class Simple_exception_handle {

    public static void main(String[] args) {
        int a=0,b=3;
        try {
            System.out.println("a/b="+ (b/a)); 
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
    
}