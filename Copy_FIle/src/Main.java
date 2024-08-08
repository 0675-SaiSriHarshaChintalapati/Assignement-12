import jdk.dynalink.StandardOperation;

import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path soruce= Paths.get("src/input.txt");
        Path destination=Paths.get("write1.txt");
        try{
            Files.copy(soruce,destination,StandardCopyOption.REPLACE_EXISTING);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
