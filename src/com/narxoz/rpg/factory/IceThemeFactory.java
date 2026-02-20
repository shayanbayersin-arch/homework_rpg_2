package com.narxoz.rpg.factory;

import com.narxoz.rpg.builder.GoblinBuilder;
import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.character.Character;


public class IceThemeFactory implements ThemeFactory {

    @Override
    public Character createHero(String name) {
        return new Mage(name);
    }

    @Override
    public Enemy createEnemy() {
        return new GoblinBuilder()
                .setName("Ice Goblin")
                .setDefense(12)
                .build();
    }
}
   

    

