package com.narxoz.rpg.character;

public interface Character {

    void useSpecialAbility();
    void displayInfo();
    void getStats();

    void attack(com.narxoz.rpg.enemy.Enemy target);
    void takeDamage(int damage);
    boolean isAlive();
    int getDamage();


}
