package module_4.M4_p6_Multithreading;

public class Runnable_interface_demo {
    public static void main(String[] args) {
        System.out.println("Main Thread starting :"+Thread.currentThread());
        // Calling the constructor of the Runnable Class
        new NumbersRunnable();
        

        // Main thread prints alphabets A to J
        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println(Thread.currentThread().getName() + ": " + ch);
            try {
                Thread.sleep(500); // Introducing a delay for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main Thread Stopping :"+Thread.currentThread());
    }
}

// Runnable class for printing numbers 1 to 10
class NumbersRunnable implements Runnable {

    Thread t;
    NumbersRunnable(){
        // Create a thread and pass the Runnable object to it
        Thread t = new Thread(this,"Child thread");
        // Start the thread
        t.start();
       
    }
    @Override
    public void run() {
        System.out.println("Start of Child Thread:"+Thread.currentThread());
        // Child thread prints numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Introducing a delay for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
         System.out.println("End of Child Thread:"+Thread.currentThread());
    }
}
