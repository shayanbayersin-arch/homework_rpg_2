package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.character.Character;

import java.util.List;
import java.util.ArrayList;


public class DragonBoss implements Enemy {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;

    private List<Ability> abilities = new ArrayList<>();
    private LootTable lootTable;

    public DragonBoss(String name) {
        this.name = name;
        this.health = 300;
        this.damage = 40;
        this.defense = 20;
        this.speed = 15;
    }



    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public LootTable getLootTable() {
        return lootTable;
    }



    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    @Override
    public void attack(Character target) {
        if (!isAlive()) return;

        System.out.println(name + " breathes FIRE!");
        target.takeDamage(damage + 10);
    }

    @Override
    public void takeDamage(int amount) {
        int realDamage = Math.max(0, amount - defense);
        health -= realDamage;

        if (health < 0) health = 0;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dragon Boss: " + name );
        System.out.println("HP: " + health);
    }

    @Override
    public Enemy cloneEnemy() {
        DragonBoss copy = new DragonBoss(this.name);
        copy.setHealth(this.health);
        copy.setDamage(this.damage);
        copy.setDefense(this.defense);
        copy.setSpeed(this.speed);
        return copy;
    }
}