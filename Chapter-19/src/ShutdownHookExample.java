public class ShutdownHookExample {
    public static void main(String[] args) {
        // Define a shutdown hook
        Thread shutdownHook = new Thread(() -> {
            System.out.println("Shutdown hook executed");
        });

        // Register the shutdown hook
        Runtime.getRuntime().addShutdownHook(shutdownHook);

        // Some operations...

        // Unregister the shutdown hook
        boolean removed = Runtime.getRuntime().removeShutdownHook(shutdownHook);
        if (removed) {
            System.out.println("Shutdown hook removed");
        } else {
            System.out.println("Shutdown hook not found or already executed");
        }
    }
}
