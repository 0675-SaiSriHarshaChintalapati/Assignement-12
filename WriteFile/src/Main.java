import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        try{
            List<String> lines =Arrays.asList("hi","hello","hey");
            String s=String.join(" ",lines);
            Path q=Paths.get("Destination.txt");
            Files.write(q,s.getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}