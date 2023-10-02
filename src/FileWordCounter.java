import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCounter implements Runnable {
    private String filename;

    public FileWordCounter(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(filename + ": " + wordCount);
    }
}
