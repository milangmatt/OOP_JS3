package module_4.M4_p6_Multithreading;

// A class with a method to be called by multiple threads
class Callme {
    // Method to be called by threads (synchronized)
    void call(String msg) {
        // Print the message with brackets
        System.out.print("[" + msg);

        try {
            // Simulate some processing time (1 second)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Handle InterruptedException
            System.out.println("Interrupted");
        }

        // Print the closing bracket
        System.out.println("]");
    }
}

// A Runnable class that calls the method of the Callme class
class Caller implements Runnable {
    Callme target; // Reference to the Callme object
    Thread t; // Thread associated with this Caller
    String msg; // Message to be passed to the Callme method

    // Constructor to initialize the Caller object
    public Caller(Callme targ, String s) {
        target = targ; // Set the target Callme object
        msg = s; // Set the message
        t = new Thread(this); // Create a new thread associated with this Caller
        t.start(); // Start the thread
    }

    // Run method that will be executed when the thread starts
    public void run() {
        synchronized (target){
            target.call(msg); // Call the Callme method on the target object
        }
    }
}

// Main class that demonstrates synchronized multithreading
public class Synch_using_statements {
    public static void main(String args[]) {
        Callme target = new Callme(); // Create an instance of Callme
        Caller ob1 = new Caller(target, "Hello"); // Create the first caller with the message "Hello"
        Caller ob2 = new Caller(target, "Ok"); // Create the second caller with the message "Ok"
        Caller ob3 = new Caller(target, "World"); // Create the third caller with the message "World"

        try {
            // Wait for all threads to finish
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            // Handle InterruptedException
            System.out.println("Interrupted");
        }
    }
}
