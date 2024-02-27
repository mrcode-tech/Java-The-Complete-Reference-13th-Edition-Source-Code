/**
 *
 In Java, the volatile keyword is used as a modifier for instance variables. It indicates that
 a variable's value may be changed by multiple threads simultaneously. The volatile keyword ensures
 visibility and ordering constraints for shared variables, making it a crucial tool for concurrent programming.

 When a variable is declared as volatile, the Java memory model ensures the following:

 Visibility:

 Changes made by one thread to a volatile variable are immediately visible to other threads.
 Atomicity (for read and write operations):

 Reading from or writing to a volatile variable is an atomic operation. This means that the read or write
 operation is completed entirely before any other thread can access the variable.
 However, it's important to note that the volatile keyword does not provide atomicity for compound operations.
 For example, if you have a sequence of operations that need to be atomic, you should
 use other mechanisms like synchronization or the java.util.concurrent library classes.
 */
class SharedResource {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public boolean isFlag() {
        return flag;
    }
}

 class MyThread extends Thread {
    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Simulating some work
            sharedResource.setFlagTrue();
            System.out.println("Flag set to true by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThreadVolatile {
    public static void main(String[] args) {
        //volatile is a keyword in Java used in the context of multithreading to indicate that a variable's value may be
        // changed by multiple threads simultaneously. When a variable is declared as volatile,
        // it ensures that any thread that reads the variable sees the most recent modification made by any other thread.

        /**
         * In this example:
         *
         * SharedResource has a boolean flag marked as volatile.
         * Two threads (thread1 and thread2) modify the flag with setFlagTrue() after some simulated work.
         * The main thread continuously checks the flag using isFlag() until it becomes true.
         * By marking the flag variable as volatile, we ensure that changes made by one thread are immediately visible to other threads.
         * Without the volatile keyword, the main thread might not see the updated value of the flag, leading to a potential infinite loop in the main thread.
         *
         * It's important to note that while volatile provides visibility guarantees, it doesn't provide atomicity for compound actions.
         * If multiple operations need to be performed atomically, additional
         * synchronization mechanisms like synchronized blocks or the java.util.concurrent package should be considered.
         */
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new MyThread(sharedResource);
        Thread thread2 = new MyThread(sharedResource);

        thread1.start();
        thread2.start();

        // Main thread checks the flag
        while (!sharedResource.isFlag()) {
            // Wait until the flag is set
        }

        System.out.println("Flag is true in the main thread.");

        // Perform actions after the flag is set
    }
}
