package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.MagicAttac;
import com.narxoz.rpg.equipment.Weapon;

public class MagicFactory implements EquipmentFactory{
    public Weapon createWeapon() {
        return new MagicAttac();
    }
    public Armor createArmor() {
        return null;
    }

}
