import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("Input.txt");

        try {
            String content = Files.readString(path);
            System.out.println("File content: " + content);
        } catch (IOException e) {
            System.err.println("Unable to read file. Error: " + e.getMessage());
        }
    }
}
