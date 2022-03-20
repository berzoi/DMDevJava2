package lesson22File;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

/**
 * Pentru citirea fiserilor cu text (char)
 */
public class Writer {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.append("Hello World!");
            fileWriter.write("\r\n");
            fileWriter.append("Java");
        }
    }
}
