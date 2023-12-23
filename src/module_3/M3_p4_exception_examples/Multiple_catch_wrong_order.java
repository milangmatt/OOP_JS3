package module_3.M3_p4_exception_examples;

import java.io.IOException;
import java.util.Scanner;
//this program is useed to demonstrate the wrong usage order of arranging catch clauses
class EqualnumbersException extends Throwable {
    EqualnumbersException(){
        super("The numbers are equal");
    }
}

public class Multiple_catch_wrong_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int b=3;
        try {
            System.out.println("a/b="+ (b/a));
            if (a==b){
                throw new EqualnumbersException();
            }
            throw new IOException();
        } 
        catch (Exception e){
            System.err.println("Other Exception");
        }
        catch (EqualnumbersException e){
            System.out.println("Caught exception:  "+e);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        //here this code is considered as an error as the Exception class is the superclass of ArithmeticException 
        //as it it caught first the ArithmeticException is unreachable
        //if this code was to be executed it would have always shown Other Exception as the first catch clause catches all the errors
        //thus all the subclass exception should be caught before the superclass exception
        finally{
            System.out.println("All exceptions are managed");
        }
        sc.close();
    }
}
