
package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.prototype.EnemyRegistry;
import com.narxoz.rpg.character.Character;

public class Main {
    public static void main(String[] args) {

        System.out.println("RPG Enemy System Demo");

      
        System.out.println("\nCreating Theme Factory");
        ThemeFactory fireFactory = new FireThemeFactory();

       
        System.out.println("\nBuilding Goblin Template");

        EnemyDirector director = new EnemyDirector();
        GoblinBuilder goblinBuilder = new GoblinBuilder();

    
        Enemy goblinTemplate = director.createWeakGoblin(goblinBuilder);

        goblinTemplate.displayInfo();

        
        System.out.println("\nRegistering Prototype ");

        EnemyRegistry.registerEnemy("goblin", goblinTemplate);

    
        Enemy goblin1 = EnemyRegistry.createEnemy("goblin");
        Enemy goblin2 = EnemyRegistry.createEnemy("goblin");

        System.out.println("Two goblins cloned from prototype!");

      
        System.out.println("\nCreating Hero ");

        Character hero = fireFactory.createHero("Gandalf");
        hero.displayInfo();

        
        System.out.println("\n BATTLE START ");

        Enemy enemy = goblin1;

        int round = 1;

        while (hero.isAlive() && enemy.isAlive()) {
            System.out.println("\n Round " + round);

            hero.attack(enemy);

            if (enemy.isAlive()) {
                enemy.attack(hero);
            }
        }

        System.out.println("\n BATTLE END ");

        if (hero.isAlive()) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Enemy wins!");
        }
    }
}

