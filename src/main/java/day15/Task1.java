package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //String separator = File.separator;
        //File inputText = new File("src" + separator + "main" + separator + "resources" + separator + "shoes.csv").getAbsoluteFile();
        //File outputText = new File("src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt").getAbsoluteFile();
        pathDownloadsFile2().getParentFile().mkdirs();

        try {
            PrintWriter pw = new PrintWriter(pathDownloadsFile2());
            Scanner sc = new Scanner(pathDownloadsFile1());
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] row = line.split(";");
                if (Integer.parseInt(row[2])==0){
                    pw.println(line);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    public static File pathDownloadsFile1() {
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "shoes.csv").getAbsoluteFile();
        return file;
    }
    public static File pathDownloadsFile2() {
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt").getAbsoluteFile();
        return file;
    }
}
