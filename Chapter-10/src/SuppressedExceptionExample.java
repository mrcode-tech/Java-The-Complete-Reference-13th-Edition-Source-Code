public class SuppressedExceptionExample {
    public static void main(String[] args) {
        try {
            // Open a resource (e.g., a file)
            tryWithResources();
        } catch (Exception e) {
            // Handle the original exception
            System.out.println("Original exception: " + e);

            // Retrieve and handle suppressed exceptions
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + suppressed);
            }
        }
    }

    static void tryWithResources() throws Exception {
        // Open a resource (e.g., a file) within a try-with-resources statement
        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            // Do some work with the resource
            throw new RuntimeException("Exception during work with the resource");
        }
    }

    static class AutoCloseableResource implements AutoCloseable {
        @Override
        public void close() throws Exception {
            // Create a new exception and fill in the stack trace
            Exception exception = new Exception("Exception during resource closing");
            //Calling it explicitly might be useful in certain scenarios, such as when you want to capture the stack trace at a specific point in your code rather than where the exception is actually thrown.
            Throwable throwable = exception.fillInStackTrace();
            System.out.println(throwable);
            System.out.println("getCause " + exception.getCause());
            System.out.println("getLocalizedMessage " + exception.getLocalizedMessage());
            System.out.println("getMessage " + exception.getMessage());
            System.out.println("getStackTrace " + exception.getStackTrace());
            Exception exception1 = new Exception("new throwable");
            exception.addSuppressed(exception1);
            System.out.println("getSuppressed " + exception.getSuppressed());
            // Close the resource and throw an exception during closing
            throw exception;
        }
    }
}
