package com.narxoz.rpg;

import com.narxoz.rpg.character.Mage;

import com.narxoz.rpg.enemy.Enemy;

import com.narxoz.rpg.builder.GoblinBuilder;

public class Main {
    public static void main(String[] args) {
        
        Mage hero = new Mage("Gandalf");

        Enemy goblin = new GoblinBuilder()
                .setName("Grub")
                .setHealth(120)
                .setDamage(20)
                .build();

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