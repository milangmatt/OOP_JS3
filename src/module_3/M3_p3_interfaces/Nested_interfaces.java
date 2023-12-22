package module_3.M3_p3_interfaces;

/*
 * Callable is an interface that has a member method showmsg() that is wrapped inside the Wrap class
 */
class Wrap{
    public interface Callable {
        void showmsg(); 
    }
    //callable is a member interface or a nested interface
}

//The MyCall class is used to implement the interface
class MyCall implements Wrap.Callable{//here the Wrap class is used to qualify Callable interface
    public void showmsg(){
        System.out.println("Implemented successfully in MyCall");
    }
}
public class Nested_interfaces {
    public static void main(String[] args) {
        MyCall mecaller=new MyCall();
        mecaller.showmsg();
    }
}
