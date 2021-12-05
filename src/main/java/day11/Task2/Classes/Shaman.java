package day11.Task2.Classes;

import day11.Task2.Interfaces.Healer;
import day11.Task2.Interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAtt = 15;
    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAMMATE_AMOUNT = 30;

    public Shaman(){
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;

    }
    public void healHimself(){
        if(health + HEAL_AMOUNT > MAX_HEALTH){
            health = MAX_HEALTH;
        } else {
            health+=HEAL_AMOUNT;
        }
    }
    public void healTeammate(Hero hero){
        if (hero.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH){
            hero.health = MAX_HEALTH;
        } else {
            hero.health+=HEAL_TEAMMATE_AMOUNT;
        }
    }
    public void magicalAttack(Hero hero) {
        double magicalDamage = magicAtt * (1 - magicDef);
        if (hero.health - magicalDamage < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= magicalDamage;
        }
    }

    public String toString(){
        return "Shaman{" + "health=" + health + "}";
    }
}
