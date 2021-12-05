package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] matr = new int[100];
        int maxSum = 0;
        int sum = 0;
        int id = 0;

        for(int i = 0; i<100; i++) {
            matr[i] = rand.nextInt(10000);
        }
        for(int i = 0; i<100; i++){
            System.out.print(matr[i] + " ");
            if (i==0){
                sum = matr[i] + matr[i+1];
            }else if(i==99){
                sum = matr[i-1] + matr[i];
            }else{
                sum = matr[i - 1] + matr[i] + matr[i + 1];
            }
            if (sum>maxSum){
                maxSum=sum;
                id = i-1;
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Индекс числа: "+ id);
    }
}
