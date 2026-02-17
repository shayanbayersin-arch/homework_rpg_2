package com.narxoz.rpg.loot;

public interface LootTable {
    List<String> getItems();
    int getGold();
    int getExperience();
    String getInfo();
    LootTable clone();

}
