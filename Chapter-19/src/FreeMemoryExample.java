public class FreeMemoryExample {
    public static void main(String[] args) {
        // Get the runtime object
        Runtime runtime = Runtime.getRuntime();

        // Get the amount of free memory
        long freeMemory = runtime.freeMemory();

        System.out.println("Free memory available: " + freeMemory + " bytes");
    }
}
