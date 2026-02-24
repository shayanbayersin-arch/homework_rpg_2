package com.narxoz.rpg.loot;


import java.util.ArrayList;
import java.util.List;

public class SimpleLootTable implements LootTable {

    private List<String> items;
    private int gold;
    private int experience;

    public SimpleLootTable(int gold, int experience) {
        this.gold = gold;
        this.experience = experience;
        this.items = new ArrayList<>();
        items.add("Potion");
    }

    @Override
    public List<String> getItems() {
        return items;
    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public String getInfo() {
        return "Gold: " + gold + ", Exp: " + experience;
    }

    @Override
    public LootTable clone() {
        return new SimpleLootTable(gold, experience);
    }
}