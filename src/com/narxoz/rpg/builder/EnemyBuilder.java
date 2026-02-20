package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;

public interface EnemyBuilder {
    EnemyBuilder setHealth(int health);
    EnemyBuilder setDamage(int damage);
    EnemyBuilder setDefense(int defense);
    EnemyBuilder setSpeed(int speed);
    
    Enemy build();
    EnemyBuilder setName(String name);
    
}
