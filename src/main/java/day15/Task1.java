package day15;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import static utility.PathFile.pathDownloadsFile;

public class Task1 {
    public static void main(String[] args) {
        pathDownloadsFile("missing_shoes").getParentFile().mkdirs();

        try {
            PrintWriter pw = new PrintWriter(pathDownloadsFile("missing_shoes.txt"));
            Scanner sc = new Scanner(pathDownloadsFile("shoes.csv"));
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
}
