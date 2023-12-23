package module_3.M3_p4_exception_examples;


import java.io.IOException;
import java.util.Scanner;

//this program is used to demonstrate the usage of mutliple catch clauses to deal with different exception 
//the exception that is thown here depends on the value we give to a
//also to show the use of throw ,throws ,finally
//a nested try-catch block is also implemented in the code 

//an example of creating an exception is also demonstrated, here the exception is made a subclass of Throwable class

class EqualnumbersException extends Throwable {
    EqualnumbersException(){
        super("The numbers are equal");
    }
}
public class exception_handler {
    //all the exceptions that can be thrown in the main method is notified to the compliler
    public static void main(String[] args) throws ArithmeticException,EqualnumbersException,IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int b=3;
        try {
            //the program also demonstrates the use of nested try statements
            try{
                System.out.println("a/b="+ (b/a));
            }
            catch(ArithmeticException e){
                System.out.println("You can't divide by zero!");
            }
            //When a=0 this throws an ArithmeticException, it is caught by the first catch clause
            if (a==b){
                throw new EqualnumbersException();
            }
            //if no ArithmeticException is thrown then it checks if the numbers are equal if yes a user-defined exception is thrown
            throw new IOException();
            //if they are not equal then a exception is thrown manually by the developer. This exception is predifined in Exception class
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        catch (EqualnumbersException e){
            System.out.println("Caught exception:  "+e);
        }
        catch (Exception e){
            System.err.println("Other Exception");
        }
        //this program also shows the usage of finally statement , a finally statement executes even after catching an error and handliing it or not
        finally{
            System.out.println("All exceptions are managed");
        }
        sc.close();
    }
}
