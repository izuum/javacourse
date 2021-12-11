package day14;

import day14.Classes.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utility.PathFile.pathDownloadsFile;

public class Task3 {
    public static void main(String[] args) {
        pathDownloadsFile("People.txt");

        System.out.println(parseFileToObjList(pathDownloadsFile("People.txt")));
    }
    public static List<Person> parseFileToObjList(File file){
        try {
            Scanner scanner = new Scanner(file);
            List<Person> people = new ArrayList<>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] arr = line.split(" ");
                if (Integer.parseInt(arr[1])<0) {
                    throw new IllegalArgumentException();
                }else{
                    Person person = new Person(arr[0], Integer.parseInt(arr[1]));
                    people.add(person);
                }
            }
            scanner.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
