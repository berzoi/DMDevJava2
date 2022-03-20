package lesson22File;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

/**
 * Pentru citirea fiserilor cu text (char)
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {  // try este fiindca FileReader este implements Closeable
            String collect = fileReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);

        }
    }
}
