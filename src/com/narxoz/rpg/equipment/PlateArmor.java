package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    private int defense;
    private String armorInfo;

    public PlateArmor(int defense) {
        this.defense = 40;
        this.armorInfo = "Plate Armor";
    }
    public int getDefense() {
        return defense;
    }
    public String getArmorInfo() {
        return armorInfo;
    }
    
}
