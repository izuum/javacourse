package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();//размер массива
        int m[] = new int[n];
        int counterMax = 0;//числа больше 8
        int counterMin = 0;// числа равные 1
        int chet = 0;// четные числа
        int nechet = 0;// не четные числа
        int sum = 0; // сумма всех элемнтов массива
        for (int i =0; i<m.length; i++){
            m[i] = random.nextInt(10);
        }
        for (int i = 0; i <m.length; i++){
            System.out.print(m[i]+" ");
            sum = sum + m[i];
            if (m[i]>8){
                counterMax++;
            }
            if(m[i]==1){
                counterMin++;
            }
            if(m[i]%2==0){
                chet++;
            }
            if(m[i]%2!=0){
                nechet++;
            }
        }
        System.out.println();
        System.out.println("Длина массива: " + m.length);
        System.out.println("Количество чисел больше 8: " + counterMax);
        System.out.println("Количество чисел равных 1: " + counterMin);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + nechet);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
