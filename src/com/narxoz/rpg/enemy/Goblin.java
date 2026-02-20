    package com.narxoz.rpg.enemy;

    import com.narxoz.rpg.combat.Ability;
    import com.narxoz.rpg.loot.LootTable;
    import com.narxoz.rpg.character.Character;

    import java.util.List;
    import java.util.ArrayList;


    public class Goblin implements Enemy {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private List<Ability> abilities;
    private LootTable lootTable;

    public Goblin(String name) {
        this.name = name;
        this.health = 100;
        this.damage = 15;
        this.defense = 5;
        this.speed = 35;
        this.abilities = new ArrayList<>();
    }

    

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getDamage() { return damage; }
    public int getDefense() { return defense; }
    public int getSpeed() { return speed; }
    public List<Ability> getAbilities() { return abilities; }
    public LootTable getLootTable() { return lootTable; }


    @Override
    public void attack(Character target) {
        if (!isAlive()) return;

        System.out.println(name + " attacks!");
        target.takeDamage(this.damage);
    }

    @Override
    public void takeDamage(int amount) {
        int realDamage = Math.max(0, amount - defense);
        health -= realDamage;

        System.out.println(name + " takes " + realDamage + " damage!");

        if (health <= 0) {
            health = 0;
            System.out.println(name + " is DEAD!");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }



    public void displayInfo() {
        System.out.println("=== " + name + " (Goblin) ===");
        System.out.println("HP: " + health);
    }


    @Override
    public Enemy clone() {
        Goblin copy = new Goblin(this.name);
        copy.health = this.health;
        copy.damage = this.damage;
        copy.defense = this.defense;
        copy.speed = this.speed;

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




        