package com.narxoz.rpg.factory;

import com.narxoz.rpg.builder.GoblinBuilder;
import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.character.Mage;

public class FireThemeFactory implements ThemeFactory {
    @Override
    public Character createHero(String name) {
       return new Mage(name);
    }
    @Override
    public Enemy createEnemy() {
        return new GoblinBuilder().setName("Fire Goblin").setDamage(25).build();
    }
}
 