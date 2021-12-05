package day6;

import day6.classes.Car;
import day6.classes.Motorbike;

public class Task1 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setModel("mustang");
        ford.setColor("yellow");
        ford.setYear(1980);

        ford.info();
        System.out.println(ford.yearDifference(2021));

        Motorbike bmw = new Motorbike("BMW ZZtop", "black", 2020);

        bmw.info();
        System.out.println(bmw.yearDifference(2021));

    }
}
