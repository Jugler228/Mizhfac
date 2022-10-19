package org.example.characters;

public class Vampire extends Warrior{
    @Override
    public void dealDamage(Warrior warrior) {
        warrior.getDamage(getAttack());
    }
}
