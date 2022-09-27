package org.pupa;

import org.pupa.characters.Knight;
import org.pupa.characters.Warrior;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Warrior carl = new Knight();
        System.out.println(carl.getAttack());
    }

    public static int addTwoIntegers(int a, int b){
        return a + b;
    }
}
