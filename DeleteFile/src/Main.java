import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("Input.txt");

        try {
            Files.delete(path);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            System.err.println("Unable to delete file. Error: " + e.getMessage());
        }
    }
}
