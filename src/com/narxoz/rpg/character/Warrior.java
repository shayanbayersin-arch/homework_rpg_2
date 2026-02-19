package com.narxoz.rpg.character;

public class Warrior implements Character {
    private String name;
    private int health;
    private int strength;
    private int defense;

    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.strength = 20;
        this.defense = 15;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses Power Strike!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Warrior: " + name);
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Defense: " + defense);
    }

    @Override
    public void getStats() {
        System.out.println(name + "'s Stats:");
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Defense: " + defense);
    }

    
    
}
