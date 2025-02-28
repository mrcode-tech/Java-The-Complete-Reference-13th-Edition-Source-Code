public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Marking the thread as daemon
        daemonThread.setDaemon(true);

        // Starting the daemon thread
        daemonThread.start();

        System.out.println("Main thread exiting...");
    }
}
