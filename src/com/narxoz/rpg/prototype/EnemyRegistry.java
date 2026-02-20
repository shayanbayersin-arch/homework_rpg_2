package com.narxoz.rpg.prototype;

import com.narxoz.rpg.enemy.Enemy;
import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {

    private static final Map<String, Enemy> registry = new HashMap<>();

    public static void registerEnemy(String key, Enemy enemy) {
        registry.put(key, enemy);
    }

    public static Enemy createEnemy(String key) {
        Enemy prototype = registry.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No enemy: " + key);
        }
        return prototype.cloneEnemy();
    }
}
    

