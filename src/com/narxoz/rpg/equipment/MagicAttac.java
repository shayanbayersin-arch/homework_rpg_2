package com.narxoz.rpg.equipment;

public class MagicAttac implements Weapon {
    private int damage;
    private String weaponInfo;

    public MagicAttac(){
        this.damage = 30;
        this.weaponInfo = "Magic Attack";   
    }
    public int Damage() {
        return damage;
    }
    public void displayInfo() {
        System.out.println(weaponInfo);
    }
}
