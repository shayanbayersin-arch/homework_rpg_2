package com.narxoz.rpg.enemy;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public class DragonBoss implements Enemy {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;

    private String element;
    private String aiBehavior;
    private boolean phaseTwo;

    private List<Ability> abilities = new ArrayList<>();
    private LootTable lootTable;

    public DragonBoss(String name) {
        this.name = name;
    }



    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getDamage() { return damage; }
    public int getDefense() { return defense; }
    public int getSpeed() { return speed; }
    public List<Ability> getAbilities() { return abilities; }
    public LootTable getLootTable() { return lootTable; }

 

    public void setHealth(int health) { this.health = health; }
    public void setDamage(int damage) { this.damage = damage; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setSpeed(int speed) { this.speed = speed; }
    public void setElement(String element) { this.element = element; }
    public void setAiBehavior(String aiBehavior) { this.aiBehavior = aiBehavior; }
    public void setPhaseTwo(boolean phaseTwo) { this.phaseTwo = phaseTwo; }
    public void setAbilities(List<Ability> abilities) { this.abilities = abilities; }
    public void setLootTable(LootTable lootTable) { this.lootTable = lootTable; }



    @Override
    public void attack(Character target) {
        if (!isAlive()) return;
        System.out.println(name + " breathes FIRE!");
        target.takeDamage(damage + 10);
    }

    @Override
    public void takeDamage(int amount) {
        int real = Math.max(0, amount - defense);
        health -= real;
        if (health < 0) health = 0;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("=== BOSS: " + name + " ===");
        System.out.println("HP: " + health + " | Element: " + element);
    }


    @Override
    public Enemy cloneEnemy() {
        DragonBoss copy = new DragonBoss(this.name);
        copy.health = this.health;
        copy.damage = this.damage;
        copy.defense = this.defense;
        copy.speed = this.speed;
        copy.element = this.element;
        copy.aiBehavior = this.aiBehavior;
        copy.phaseTwo = this.phaseTwo;

        copy.abilities = new ArrayList<>();
        for (Ability a : this.abilities) {
            copy.abilities.add(a.clone());
        }

        if (this.lootTable != null) {
            copy.lootTable = this.lootTable.clone();
        }

        return copy;
    }
}