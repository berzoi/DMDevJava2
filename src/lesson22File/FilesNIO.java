package lesson22File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FilesNIO {
    public static void main(String[] args) throws IOException {
//        File file = Path.of("resources", "output.txt").toFile();
//        try (FileWriter fileWriter = new FileWriter(file)) {
//            fileWriter.append("Hello World!");
//            fileWriter.write("\r\n");
//            fileWriter.append("Java");
//        }

//        Path file = Path.of("resources", "output.txt");
//        try (BufferedWriter fileWriter = Files.newBufferedWriter(file)) {
//            fileWriter.append("Hello World!");
//            fileWriter.write("\r\n");
//            fileWriter.append("Java");
//        }

        Path path = Path.of("resources", "output1.txt");
        Files.write(path, List.of("Hello World!", "Java"));
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }
    }
}
