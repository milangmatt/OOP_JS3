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
//The YourCall class is used to implement the interface
class YourCall implements Callable{
    public void showmsg(){
        System.out.println("Implemented successfully in YourCall");
    }
}
public class Simple_implement {
    public static void main(String[] args) {
        //An object refernce of MyCall class is created to call the showmsg fuction
        MyCall mecaller=new MyCall();
        mecaller.showmsg();
        //An object refernce of YourCall class is created to call the showmsg fuction
        YourCall youcaller=new YourCall();
        youcaller.showmsg();
    }   //here the two implementation of the same named functions act as a representation of polymorpshism
}
