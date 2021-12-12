package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static utility.PathFile.pathDownloadsFile;

public class Task1 {
    public static void main(String[] args) {
        printResult(pathDownloadsFile("src/main/resources/TestText.txt"));
    }
    public static void printResult(File file){
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] midSum = line.split(" ");
            for (String num: midSum){
                sum += Integer.parseInt(num);
            }
            scanner.close();
            double full = sum / (double) midSum.length;
            double notFull = sum / (double) midSum.length;
            System.out.printf(full + " --> " + "%.3f",notFull);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
