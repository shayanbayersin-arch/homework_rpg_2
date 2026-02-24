package com.narxoz.rpg.factory;


import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireBallAbility;
import com.narxoz.rpg.loot.LootTable;
import com.narxoz.rpg.loot.SimpleLootTable;

import java.util.ArrayList;
import java.util.List;

public class FireEnemyComponentFactory  implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new FireBallAbility());
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new SimpleLootTable(100 ,50);
    }


   
}
