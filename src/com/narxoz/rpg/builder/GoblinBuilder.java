package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Goblin;
import com.narxoz.rpg.enemy.Enemy;

public class GoblinBuilder implements EnemyBuilder {
    private String name = "Goblin";
    private int health = 100;
    private int damage = 15;
    private int defense = 5;
    private int speed = 35;

    @Override
    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public EnemyBuilder setDefense(int defense) {
        this.defense = defense;
        return this;
    }

    @Override
    public EnemyBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    // ⭐ Factory Method
    @Override
    public Enemy build() {
        Goblin goblin = new Goblin(name);

        // ⚠️ нужны сеттеры в Goblin
        goblin.setHealth(health);
        goblin.setDamage(damage);
        goblin.setDefense(defense);
        goblin.setSpeed(speed);

        return goblin;
    }
}