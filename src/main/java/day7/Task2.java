package day7;

import day7.classes.Player;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player dzuba = new Player(randNum(100,90));
        Player pogba = new Player(randNum(100,90));
        Player ronaldo = new Player(randNum(100,90));
        Player messi = new Player(randNum(100,90));
        Player maradonna = new Player(randNum(100,90));
        Player messi1 = new Player(randNum(100,90));

        Player.info();

        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();
        dzuba.run();

    }
    static int randNum(int max, int min){
        Random rand = new Random();
        return rand.nextInt((max - min) +1)+min;
    }

}
