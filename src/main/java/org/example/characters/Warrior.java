package org.example.characters;

public class Warrior {
    static final int ATTACK = 5;
    private int health = 50;

    public int getAttack(){
        return ATTACK;
    }

    public int getHealth(){
        return health;
    }

    public boolean isAlive(){
        return getHealth() > 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void dealDamage(Warrior warrior){
        warrior.getDamage(getAttack());
    }

    public void getDamage(int damage){
        setHealth(getHealth() - damage);
    }
}
