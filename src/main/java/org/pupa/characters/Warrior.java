package org.pupa.characters;

public class Warrior {
    static final int ATTACK = 5;
    private int health = 50;

    // potentially virtual method
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


    /**
     * @param warrior Enemy warrior that deals damage to this warrior
     */
    public void receiveDamage(Warrior warrior){
        this.setHealth(this.getHealth() - warrior.getAttack());
    }
}
