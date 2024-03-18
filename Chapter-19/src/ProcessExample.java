import java.io.IOException;
import java.io.OutputStream;

public class ProcessExample {
    public static void main(String[] args) {
        try {
            // Start a process
//            Process process = Runtime.getRuntime().exec("wc -l");
            Process process = Runtime.getRuntime().exec("cmd /c find /c /v \"\"");

            // Get the output stream of the process
            OutputStream outputStream = process.getOutputStream();

            // Write data to the process
            String data = "Hello\nWorld\n";
            outputStream.write(data.getBytes());
            outputStream.close(); // Close the stream when done writing

            // Wait for the process to complete
            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
