package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        pathDownloadsFile("file1").getParentFile().mkdirs();
        pathDownloadsFile("file2").getParentFile().mkdirs();

        printToFile1(pathDownloadsFile("file1"));
        printToFile2(pathDownloadsFile("file1"), pathDownloadsFile("file2"));
        printResult(pathDownloadsFile("file2"));

    }
    public static void printToFile1(File file){
        try {
            PrintWriter pw = new PrintWriter(file);
            Random rand = new Random();
            for (int i = 0; i < 1000; i++){
                int x = rand.nextInt(100);
                pw.print(x + " ");
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void printToFile2(File file1, File file2){
        try {
            int count = 0;
            int sum = 0;
            Scanner scanner = new Scanner(file1);
            PrintWriter pw1 = new PrintWriter(file2);
            String[] num = scanner.nextLine().split(" ");
            for (int i = 0; i <num.length; i++){
                count++;
                sum+=Integer.parseInt(num[i]);
                if (count == 20){
                    count = 0;
                    sum = sum/20;
                    pw1.print(sum + "  ");          //////////исправить на вывод вещественных чисел!!!!!!!!!!!
                    sum = 0;
                }
            }
            /*while (scanner.hasNextLine()){
                sum += scanner.nextInt();
                count++;
                if (count == 20){
                    count = 0;
                    sum = sum / 20;
                    pw1.println(sum);
                    sum = 0;
                }
            }*/
            scanner.close();
            pw1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            String[] num = scanner.nextLine().split(" ");
            for (String n: num){
                sum+=Double.parseDouble(n);
            }
            System.out.println((int)sum);
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static File pathDownloadsFile(String fileName) {
        String separator = File.separator;
        File file = new File("src" + separator + "main" + separator + "resources" + separator + fileName).getAbsoluteFile();
        return file;
    }
}
