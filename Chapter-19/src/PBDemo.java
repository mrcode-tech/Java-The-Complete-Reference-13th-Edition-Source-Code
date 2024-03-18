import java.util.ArrayList;
import java.util.List;

class PBDemo {
    public static void main(String[] args) {

        List<ProcessBuilder> pbList = new ArrayList<>();
        try {
            ProcessBuilder proc =
                    new ProcessBuilder("notepad.exe", "testfile");
            System.out.println(proc.directory());;
            proc.start();

            pbList.add(proc);
            pbList.add(proc);
            ProcessBuilder.startPipeline(pbList);
            

        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
    }
}
