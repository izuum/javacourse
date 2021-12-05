package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[12][8];
        int maxSum = 0;
        int sum = 0;
        int id = 0;

        for (int i = 0; i<12; i++){
            System.out.print(i+": ");//вывод индекса строки
            sum = 0;
            for (int j = 0; j<8; j++){
                matrix[i][j] = rand.nextInt(50);//заполнение массива рандомными числами
                System.out.print(matrix[i][j]+" ");// вывод массива в виде таблицы
                sum = sum+matrix[i][j];
            }
            if (sum>maxSum){// определяем строку с максимальной суммой
                maxSum=sum;
                id=i;
            }
            System.out.println(" // сумма = "+ sum);// вывод суммы строки
        }
        System.out.println();
        System.out.println("В строке " + id + " максимальная сумма: " + maxSum);
    }
}
