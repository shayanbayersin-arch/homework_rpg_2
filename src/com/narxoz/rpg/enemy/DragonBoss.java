package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;


public class DragonBoss extends Enemy {

    public DragonBoss(String name) {
        super(name);
        setHealth(300);
        setDamage(40);
        setDefense(20);
        setSpeed(15);
    }

    @Override
    public void attack(Character target) {
        if (!isAlive()) return;

        System.out.println(getName() + " breathes FIRE!");
        target.takeDamage(getDamage() + 10);
    }

    @Override
    public Enemy cloneEnemy() {
        DragonBoss copy = new DragonBoss(getName());
        copy.setHealth(getHealth());
        copy.setDamage(getDamage());
        copy.setDefense(getDefense());
        copy.setSpeed(getSpeed());
        return copy;
    }
}