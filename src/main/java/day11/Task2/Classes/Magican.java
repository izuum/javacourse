package day11.Task2.Classes;

import day11.Task2.Interfaces.MagicAttack;


public class Magican extends Hero implements MagicAttack {
    int magicAtt = 20;

    public Magican(){
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }
    public void magicalAttack(Hero hero){
        double magicalDamage = magicAtt * (1 - magicDef);
        if (hero.health-magicalDamage < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else{
            hero.health-=magicalDamage;
        }
    }
    public String toString(){
        return "Magican{" + "health=" + health + "}";
    }
}
