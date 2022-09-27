package org.pupa;

import org.pupa.characters.Warrior;

// only static methods classes can be named utility class
public class Battle {
    // attack or receive damage?
    public static boolean fight(Warrior warrior1, Warrior warrior2){
        while(warrior1.isAlive() && warrior2.isAlive()){
            warrior2.receiveDamage(warrior1);
            if(warrior2.isAlive()){
                warrior1.receiveDamage(warrior2);
            }
        }
        return warrior1.isAlive();
    }

/*    public static boolean fight2(Warrior warrior1, Warrior warrior2){
        while(warrior1.isAlive() && warrior2.isAlive()){
            warrior2.setHealth(warrior2.getHealth() - warrior1.getAttack());
            if(warrior2.isAlive()){
                warrior1.setHealth(warrior1.getHealth() - warrior2.getAttack());
            }
        }
        return warrior1.isAlive();
    }*/
}
