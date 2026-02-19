package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.MagicAttac;

public class MagicFactory implements EquipmentFactory{
    public Weapon createWeapon() {
        return new MagicAttac();
    }
    public Armor createArmor() {
        return null;
    }

}
