import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ProcessTest {
    public static void main(String[] args) {
        // Get the current process handle
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println(currentProcess.info());
        System.out.println(currentProcess.supportsNormalTermination());


        // Get the child processes of the current process
        Stream<ProcessHandle> childProcesses = currentProcess.children();

        // Print information about each child process
        childProcesses.forEach(childProcess -> {
            System.out.println("Child Process ID: " + childProcess.pid());
            System.out.println("Command: " + childProcess.info().command().orElse("Unknown"));
            System.out.println("Arguments: " + String.join(" ", childProcess.info().arguments().orElse(new String[0])));
            System.out.println("Start Time: " + childProcess.info().startInstant().orElse(null));
            System.out.println("CPU Duration: " + childProcess.info().totalCpuDuration().orElse(null));
            System.out.println();
        });
        System.out.println();
    }
}
