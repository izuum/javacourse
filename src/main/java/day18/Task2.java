package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(numOfDigits(717771237, 7));
    }
    public static int numOfDigits(int n, int dig){ /// dig - искомое число, кол-во которого надо найти, n - число в котором искать
        if (n == 0){
            return 0;
        }
        if (n % 10 == dig){
            return 1 + numOfDigits(n/10, dig);
        }else{
            return numOfDigits(n/10, dig);
        }
    }
}
