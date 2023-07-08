import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderHandler {

    public static List<String> getLinesOfTextFileWithScanner(String filePath) {
        List<String> stringList = new ArrayList<>();

        File file = new File(filePath);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                stringList.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("nem jó path");
        }
        return stringList;
    }

}
