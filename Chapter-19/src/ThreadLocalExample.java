/**
 * In Java, ThreadLocal variables are not automatically inherited by child threads. Therefore, when you
 * access a ThreadLocal variable in a child thread,
 * it typically returns null unless you explicitly set a value for that variable in the child thread.
 *
 * On the other hand, InheritableThreadLocal variables are designed to be inherited by child threads. So,
 * when you set a value for an InheritableThreadLocal variable in the parent thread, it is automatically propagated to the child threads.
 */
public class ThreadLocalExample {
    // Define a ThreadLocal variable
    private static ThreadLocal<String> threadLocalVariable = new ThreadLocal<>();

    // Define an InheritableThreadLocal variable
    private static InheritableThreadLocal<String> inheritableThreadLocalVariable = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        // Set the value of the thread-local variable for the main thread
        threadLocalVariable.set("Main Thread Value");
        inheritableThreadLocalVariable.set("Main Thread Value");

        // Create and start a child thread
        Thread childThread = new Thread(() -> {
            // Get and print the value of the thread-local variable for the child thread
            System.out.println("Child Thread Value (ThreadLocal): " + threadLocalVariable.get());
            System.out.println("Child Thread Value (InheritableThreadLocal): " + inheritableThreadLocalVariable.get());
        });
        childThread.start();
    }
}
