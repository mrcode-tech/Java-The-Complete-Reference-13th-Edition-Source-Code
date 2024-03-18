public class ThreadEnumerationExample {
    public static void main(String[] args) {
        // Get the current thread group
        ThreadGroup group = Thread.currentThread().getThreadGroup();

        // Define an array to hold the threads
        Thread[] threads = new Thread[group.activeCount()];

        // Copy the threads into the array
        int count = group.enumerate(threads);

        // Print information about the threads
        System.out.println("Number of active threads: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println("Thread[" + i + "]: " + threads[i]);
        }
        System.out.println(threads[0].getContextClassLoader());
        System.out.println(threads[0].getName());
        System.out.println(threads[0].getId());
        System.out.println(threads[0].getPriority());
        System.out.println(threads[0].getState());
        System.out.println(Thread.holdsLock(threads[0]));
        Thread thread = threads[0];
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
    }
}
