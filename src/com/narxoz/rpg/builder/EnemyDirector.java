package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyDirector {
    public Enemy createWeakGoblin(GoblinBuilder builder) {
        return builder
                .setName("Weak Goblin")
                .setHealth(60)
                .setDamage(10)
                .setDefense(3)
                .setSpeed(20)
                .build();
    }

    public Enemy createStrongGoblin(GoblinBuilder builder) {
        return builder
                .setName("Strong Goblin")
                .setHealth(140)
                .setDamage(25)
                .setDefense(10)
                .setSpeed(35)
                .build();
    }
}
    
