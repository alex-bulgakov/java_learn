package lessons.read_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String currentPath = FileReader.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String pathToFile =  "test.txt";
        File file = new File(pathToFile);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
