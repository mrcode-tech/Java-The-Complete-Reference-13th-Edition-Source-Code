import java.util.List;

public class StackWalkerExample {
    public static void main(String[] args) {
        try {
            // Simulate an exception by dividing by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred:");
            // Print information about the exception's stack trace using StackWalker
            // Create a StackWalker instance
            StackWalker stackWalker = StackWalker.getInstance();

            // Use walk() method to traverse the stack frames
            List<StackWalker.StackFrame> stackFrames = stackWalker.walk(frames ->
                    frames.limit(10).collect(java.util.stream.Collectors.toList())
            );

            // Print information about each stack frame
            for (StackWalker.StackFrame frame : stackFrames) {
                System.out.println(frame.getClassName() + "." + frame.getMethodName() + " [" + frame.getFileName() + ":" + frame.getLineNumber() + "]");
            }
        }

    }
}
