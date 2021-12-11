package utility;
import java.io.File;

public class PathFile {
    public static File pathDownloadsFile(String fileName) {
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + fileName).getAbsoluteFile();
        return file;
    }
}
