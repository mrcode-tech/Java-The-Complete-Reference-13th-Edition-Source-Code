public class MemoryExample {
    public static void main(String[] args) {
        // Get the runtime object
        Runtime runtime = Runtime.getRuntime();

        // Get the total amount of memory available to the JVM
        long totalMemory = runtime.totalMemory();

        System.out.println("Total memory available to JVM: " + totalMemory + " bytes");

        System.out.println(Runtime.version());
    }
}
