public class RuntimeExample {
    public static void main(String[] args) {
        // Get the runtime object
        Runtime runtime = Runtime.getRuntime();

        // Use the runtime object to access various system-related functionalities
        System.out.println("Available processors: " + runtime.availableProcessors());
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());

    }
}
