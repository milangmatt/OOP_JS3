package module_3.M3_p3_interfaces;

/*
 * Callable is an interface that has a member method showmsg()
 */
interface Callable {
    void showmsg(); 
}
//The MyCall class is used to implement the interface
class MyCall implements Callable{
    public void showmsg(){
        System.out.println("Implemented successfully in MyCall");
    }
}

public class Interface_variable {
    public static void main(String[] args) {
        Callable mecaller=new MyCall();//here the interface refernece is called instead of the Mycall object refernce
        mecaller.showmsg();
    }
}
