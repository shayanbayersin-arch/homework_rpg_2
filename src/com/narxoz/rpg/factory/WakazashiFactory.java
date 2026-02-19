package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.KatanaSword;

public class WakazashiFactory implements EquipmentFactory {
    public Weapon createWeapon() {
        return new KatanaSword();
    }
    public Armor createArmor() {
        return null;
    }

    
}
