package dzien4.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ObslugaPlikow {

    public static void main(String[] args) {
        fileInputAndOutputStreams(); //

        try {
            writingToFileUsingPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//obsługa plików
    private static void writingToFileUsingPath() throws IOException {
        Path path = Paths.get("data.txt");
        Files.createFile(path);
        Files.write(path, "A long time ago in a galaxy far, far away....".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "in a galaxy far, ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "far away....\n".getBytes(), StandardOpenOption.APPEND);
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
        Files.delete(path);
    }
//komunikacja z serwerami?
    private static void fileInputAndOutputStreams() {
        FileInputStream in = null;
        try {
            in = new FileInputStream("plik.txt");
            FileOutputStream out = new FileOutputStream("plik_output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
