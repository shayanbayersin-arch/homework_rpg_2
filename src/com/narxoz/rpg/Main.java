package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.prototype.EnemyRegistry;

public class Main {

    public static void main(String[] args) {

    
        EnemyDirector director = new EnemyDirector();
        Enemy weakGoblin = director.createWeakGoblin(new GoblinBuilder());

    
        EnemyRegistry.registerEnemy("goblin", weakGoblin);

    
        ThemeFactory factory = new FireThemeFactory();
        Character hero = factory.createHero("Gandalf");

    
        Enemy enemy = EnemyRegistry.createEnemy("goblin");

        System.out.println("BATTLE START ");

        int round = 1;

        while (hero.isAlive() && enemy.isAlive()) {
            System.out.println("\n Round " + round++ + " ---");

            hero.attack(enemy);

            if (enemy.isAlive()) {
                enemy.attack(hero);
            }
        }

        System.out.println("\n BATTLE END");

        if (hero.isAlive()) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Enemy wins!");
        }
    }
}
