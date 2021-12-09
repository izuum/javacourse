package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File outputText = new File("D:\\javacourse\\javacourse\\src\\main\\resources\\missing_shoes.txt");
        File inputText = new File("D:\\javacourse\\javacourse\\src\\main\\resources\\shoes.txt");
        outputText.getParentFile().mkdirs();

        try {
            PrintWriter pw = new PrintWriter(outputText);
            Scanner sc = new Scanner(inputText);
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
