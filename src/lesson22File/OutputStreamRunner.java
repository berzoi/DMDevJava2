package lesson22File;

import java.io.*;
import java.nio.file.Path;

public class OutputStreamRunner {

    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
// pentru fisiere mari
        try (BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))){
            String value = "Hello world!!";
            fileOutputStream.write(value.getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }




//        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
//        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {  // true - adauga info la fisierul vechi
//            String value = "Hello world!!";
//            fileOutputStream.write(value.getBytes());
//        }
    }
}
