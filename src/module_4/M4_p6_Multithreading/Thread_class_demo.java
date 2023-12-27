package module_4.M4_p6_Multithreading;

public class Thread_class_demo {
    public static void main(String[] args) {
        // Create an instance of the custom thread class for numbers
        new NumbersThread();

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
    public NumbersThread() {
        this.setName("Child Thread");
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
