package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + "TestText.txt").getAbsoluteFile();

        printResult(file);
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
