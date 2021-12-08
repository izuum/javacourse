package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("People.txt");

        System.out.println(parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File file){
        try {
            Scanner scanner = new Scanner(file);
            List<String> inf = new ArrayList<>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] num = line.split(" ");
                if (Integer.parseInt(num[1])<0) {
                    throw new IllegalArgumentException();
                } else {
                    inf.add(line);
                }
            }
            scanner.close();
            return inf;
        } catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
