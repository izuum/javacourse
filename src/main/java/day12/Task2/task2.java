package day12.Task2;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> chet = new ArrayList<>();
        for (int i = 0; i < 31; i++){
            if (i % 2 == 0){
                chet.add(i);
            }
        }
        for (int i = 300; i < 351; i++){
            if (i % 2 == 0){
                chet.add(i);
            }
        }
        System.out.println(chet);
    }
}
