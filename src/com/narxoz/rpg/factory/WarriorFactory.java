package com.narxoz.rpg.factory;

public class WarriorFactory extends CharacterFactory {
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
