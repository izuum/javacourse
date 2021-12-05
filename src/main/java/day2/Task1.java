package day2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int et = sc.nextInt();
        if (1<= et && et <=4){
            System.out.println("Малоэтажный дом");
        }else if(5<= et && et <= 8){
            System.out.println("Среднеэтажный дом");
        }else if(9<=et){
            System.out.println("Многоэтажный дом");
        }else{
            System.out.println("Ошибка ввода");
        }
    }
}
