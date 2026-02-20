package com.narxoz.rpg;

import com.narxoz.rpg.character.Mage;

public class Main {
    public static void main(String[] args) {
        
        Mage hero = new Mage("Gandalf");
        Goblin goblin = new Goblin("Grub");


        System.out.println("Battle Start!");

        while (hero.isAlive() && goblin.isAlive()) {
            hero.attack(goblin);


            if (goblin.isAlive()) {
                goblin.attack(hero);
            }


        }
        System.out.println("Battle End!");

    
    }
}
