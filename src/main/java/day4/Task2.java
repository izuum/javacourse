package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m[] = new int[100];
        int max = 0;//наибольший элемент массива
        int min = 10000;//наименьший элемент массива
        int count = 0;//кол-во элементов, оканчивающихся на 0
        int sum = 0;//сумма элементов, оканчивающихся на 0

        for(int i = 0; i<100; i++){
            m[i] = rand.nextInt(10000);
        }
        for(int i = 0; i<100; i++){
            System.out.print(m[i] + " ");
        }
        System.out.println();
        for (int i:m){
            if (max<i){
                max = i;
            }
            if (min>i){
                min = i;
            }
            if(i%10==0){
                count++;
                sum=sum+i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Кол-во чисел, оканчивающихся на 0: " + count);
        System.out.println("Сумма чисел, оканчивающихся на 0: " + sum);
    }
}
