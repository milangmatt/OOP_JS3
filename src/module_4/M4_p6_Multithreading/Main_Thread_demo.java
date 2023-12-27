package module_4.M4_p6_Multithreading;
// this is a sample program to demonstrate the use of currentThread() method to access the main thread 
public class Main_Thread_demo {
    public static void main(String args[]) {
        // the main thread refernce is obtained
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        // shows 5 in the output as the default priority of a thread is 5 of 10
        t.setName("My Thread");
        //changed the thread name and then printed
        System.out.println("After name change: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                //thread suspended for 1000 milliseconds
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
