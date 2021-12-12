package utility;

import java.io.File;
import java.util.Scanner;

public class PathFile {
    public static File pathDownloadsFile(String fileName) {
        String separator = File.separator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path: ");
        String path = scanner.nextLine().replace("/", separator);
        File file = new File(path + fileName).getAbsoluteFile();
        return file;
    }
}
