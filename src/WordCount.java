import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WordCount {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java WordCount file1.txt file2.txt ...");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(args.length);

        for (String filename : args) {
            executor.execute(new FileWordCounter(filename));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
