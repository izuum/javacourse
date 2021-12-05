package day11.Task2.Classes;

public class Warrior extends Hero {

    public Warrior(){
        physDef = 0.8;
        magicDef = 1;
        physAtt = 30;

    }
    public String toString(){
        return "Warrior{" + "health=" + health + "}";
    }
}
