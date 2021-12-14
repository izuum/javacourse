package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(counter7(775775775));

    }
    public static int counter7(Integer n){
        if (n == 0){
            return 0;
        }
        if (n%10 == 7){
            return 1+counter7(n/10);
        }else{
            return counter7(n/10);
        }

    }
}
