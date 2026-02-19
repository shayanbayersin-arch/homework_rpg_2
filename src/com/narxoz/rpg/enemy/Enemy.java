package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;


public interface Enemy {
    int getHealth();
    int getDamge();
    int getDefense();
    int getSpeed();

    List<Ability> getAbilities();
    LootTable getLootTable();


    void attack(Character target);
    void takeDamage(int amount);
    boolean isAlive();

    void displayInfo();
    Enemy clone();

}
