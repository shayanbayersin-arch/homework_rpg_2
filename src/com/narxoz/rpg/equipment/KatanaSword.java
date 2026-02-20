package com.narxoz.rpg.equipment;

public class KatanaSword implements Weapon {
    private int damage;
    private String weaponType;

    public KatanaSword() {
        this.damage = 25;
        this.weaponType = "Sword";
    }
    public int Damage() {
        return damage;
    }
    public String getWeaponInfo() {
        return "Katana Damage";

    }
    public void displayInfo() {
        System.out.println("Type: " + getWeaponInfo());
        System.out.println("Weapon: " + weaponType);
        System.out.println("Damage: " + damage);
    }
}
