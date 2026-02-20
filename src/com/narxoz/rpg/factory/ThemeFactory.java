package com.narxoz.rpg.factory;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.character.Character;


public interface  ThemeFactory {
    Character createHero(String name);
    Enemy createEnemy();

    
}
