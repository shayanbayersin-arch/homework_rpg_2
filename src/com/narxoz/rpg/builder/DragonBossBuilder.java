package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.DragonBoss;
import com.narxoz.rpg.enemy.Enemy;

public class DragonBossBuilder {
    private DragonBoss dragon;

    public DragonBossBuilder() {
        dragon = new DragonBoss("Dragon Boss");
    }

    public DragonBossBuilder setName(String name) {
        dragon = new DragonBoss(name);
        return this;
    }

    public DragonBossBuilder setHealth(int health) {
        dragon.setHealth(health);
        return this;
    }

    public DragonBossBuilder setDamage(int damage) {
        dragon.setDamage(damage);
        return this;
    }

    public DragonBossBuilder setDefense(int defense) {
        dragon.setDefense(defense);
        return this;
    }

    public DragonBossBuilder setSpeed(int speed) {
        dragon.setSpeed(speed);
        return this;
    }

    public Enemy build() {
        return dragon;
    }
}


