package lesson22File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
//        File file = new File("resources/test.txt");
//        File file = new File(String.join(File.separator, "resources", "test.txt"));
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {

            /**
             * Daca fisierul este mare, atunci folosim asa varianata. Ea citeste byte pe byte
             */
            byte[] bytes = new byte[inputStream.available()];  // узнаем размер файла на нашем диске
            int counter = 0;
            int currentByte;
            while((currentByte = inputStream.read()) != -1){
                bytes[counter++] = (byte) currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);


            /**
             * Daca fisierul este mic, atunci folosim asa varianata.
             */
//            byte[] bytes = inputStream.readAllBytes();
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
        }
    }
}
