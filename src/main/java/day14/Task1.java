package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static utility.PathFile.pathDownloadsFile;

public class Task1 {
    public static void main(String[] args){
        pathDownloadsFile("TestText.txt");

        printSumDigits(pathDownloadsFile("TestText.txt"));
    }
    public static void printSumDigits(File file) {

        int count = 0;
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numberOfSum = line.split(" ");
            for (String number : numberOfSum) {
                sum += Integer.parseInt(number);
                count++;
            }
            if (count != 10) {
                System.out.println("Некорректный входной файл");
            } else {
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

