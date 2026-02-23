package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Goblin;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class GoblinBuilder implements EnemyBuilder {

    private String name = "Goblin";
    private int health = 100;
    private int damage = 15;
    private int defense = 5;
    private int speed = 35;

    private EnemyComponentFactory componentFactory;

    public GoblinBuilder(EnemyComponentFactory factory) {
        this.componentFactory = factory;
    }

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


    @Override
    public Enemy build() {
        Goblin goblin = new Goblin(name);

        goblin.setHealth(health);
        goblin.setDamage(damage);
        goblin.setDefense(defense);
        goblin.setSpeed(speed);

        goblin.setAbilities(componentFactory.createAbilities());
        goblin.setLootTable(componentFactory.createLootTable());

        return goblin;
    }
}