import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("Input.txt");
            String s= Files.readString(p);
            System.out.println(s);

    }
}