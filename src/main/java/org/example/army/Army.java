package org.example.army;

import org.example.characters.Warrior;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Supplier;

public class Army {
    private Queue<Warrior> army;

    public Army() {
        army = new LinkedList<>();
    }

    public Army addUnits(Warrior warrior) {
        army.add(warrior);
        return this;
    }

    public Army addUnits(Supplier<Warrior> factory,
                         int quantity){
        for (int i = 0; i < quantity; i++) {
            addUnits(factory.get());
        }
        return null;
    }

    public Queue<Warrior> getArmy() {
        return army;
    }

    public Boolean isArmyEmpty() {
        return army.isEmpty();
    }
}
