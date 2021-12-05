package day11.Task2;

import day11.Task2.Classes.Magican;
import day11.Task2.Classes.Paladin;
import day11.Task2.Classes.Shaman;
import day11.Task2.Classes.Warrior;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Shaman shaman = new Shaman();
        Paladin paladin = new Paladin();
        Magican magican = new Magican();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);

        paladin.physicalAttack(magican);
        System.out.println(magican);

        shaman.healTeammate(magican);
        System.out.println(magican);

        magican.magicalAttack(paladin);
        System.out.println(paladin);

        shaman.physicalAttack(warrior);
        System.out.println(warrior);

        paladin.healHimself();
        System.out.println(paladin);
        System.out.println();

        for (int i = 0; i < 5; i++){
            warrior.physicalAttack(magican);
            System.out.println(magican);
        }
    }
}
