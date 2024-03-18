public class ExitExample {
    public static void main(String[] args) {
        // Perform some tasks

        // If an error condition occurs, exit with a non-zero status code
        int errorCode = 1;
        if (errorCode != 0) {
            System.err.println("An error occurred. Exiting with status code " + errorCode);
            Runtime.getRuntime().exit(errorCode);
        }

        // Perform cleanup or other tasks before exiting

        // This code will not be reached if exit() is called
        System.out.println("Program continues running after exit");
    }
}
