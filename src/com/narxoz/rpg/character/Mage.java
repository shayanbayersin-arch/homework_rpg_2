package com.narxoz.rpg.character;

public class Mage implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int agility;
    private int intelligence;

    public Mage(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 120;
        this.strength = 10;
        this.agility = 15;
        this.intelligence = 25;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts a powerful fireball!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Character: " + name);
        System.out.println("Class: Mage");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void getStats() {
        // This method can be used to return or display the character's stats in a specific format
        System.out.println(name + "'s Stats:");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Agility: " + agility);
        System.out.println("Intelligence: " + intelligence);
    }
    public void attack(com.narxoz.rpg.enemy.Enemy enemy) {
      System.out.println(name + " attacks enemy");
      enemy.takeDamage(this.strength);

    }
    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;

    }
    @Override
    public boolean isAlive() {
    return health > 0;
    }

    @Override
    public int getDamage() {
    return strength;
    }

    
}
