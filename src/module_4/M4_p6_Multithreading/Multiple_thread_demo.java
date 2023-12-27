package module_4.M4_p6_Multithreading;

public class Multiple_thread_demo {
    public static void main(String[] args) {
        // Create instances of the custom thread class for numbers with differnt names
        new NumbersThread("Child 1");
        new NumbersThread("Child 2");
        new NumbersThread("Child 3");

        // Main thread prints alphabets A to J
        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println(Thread.currentThread().getName() + ": " + ch);
            try {
                Thread.sleep(500); // Introducing a delay for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Start the child thread (numbersThread) in its constructor
        // The child thread will print numbers 1 to 10
    }
}
class NumbersThread extends Thread {
    // Constructor
    public NumbersThread(String name) {
        //setting a name for thread by using the constructor parameters
        super(name);
        // Start the thread when the constructor is called
        start();
    }

    // Run method defines the behavior of the child thread
    @Override
    public void run() {
        // Child thread prints numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Introducing a delay for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

