public class YieldThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 - Loop iteration: " + i);
                Thread.yield(); // Yielding to other threads
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 - Loop iteration: " + i);
                Thread.yield(); // Yielding to other threads
            }
        });

        // Starting both threads
        thread1.start();
        thread2.start();

        Thread.currentThread().getThreadGroup().list();

    }
}
