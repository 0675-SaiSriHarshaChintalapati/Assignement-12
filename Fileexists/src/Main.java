import java.nio.file.*;

public class Main{
    public static void main(String[] args) {
        Path path = Paths.get("Input.txt");

        if (Files.exists(path)) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
