package utility;

import java.io.File;

public class PathFile {
    public static File pathDownloadsFile(String filePath) {
        String separator = File.separator;
        String path = filePath.replaceAll("\\s\\.", separator);
        File file = new File(path).getAbsoluteFile();
        return file;
    }
}
