package day6;

import day6.classes.Airplane;

public class Task2 {
    public static void main(String[] args) {
        Airplane boing = new Airplane("USA", 1995, 50, 300);
        boing.setYear(1999);
        boing.setLength(40);
        boing.info();
        System.out.println();
        boing.fillUp(100);
        boing.info();
        System.out.println();
        boing.fillUp(400);
        boing.info();
    }
}
