package day11.Task2.Classes;

import day11.Task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health;
    double physDef;
    double magicDef;
    int physAtt;

    public Hero(){
        health = 100;
    }
    public void physicalAttack(Hero hero){
        double physicalDamage = physAtt*(1-hero.physDef);
        if (hero.health-physicalDamage < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= physicalDamage;
        }
    }
}
