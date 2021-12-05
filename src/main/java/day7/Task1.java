package day7;

import day7.classes.Airplane;

public class Task1 {
    public static void main(String[] args) {
        Airplane boing = new Airplane("USA", 1995, 500,3000);
        Airplane fixik = new Airplane("Japan", 2005, 300,1500);
        Airplane.compareAirplanes(fixik, boing);

    }
}
