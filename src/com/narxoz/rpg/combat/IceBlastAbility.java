package com.narxoz.rpg.combat;

public class IceBlastAbility implements Ability {

    private String name;
    private int power;
    private String description;

    public IceBlastAbility() {
        this.name = "Ice Blast";
        this.power = 25;
        this.description = "Unleashes a chilling blast of ice";
    }

    public IceBlastAbility(String name, int power, String description) {
        this.name = name;
        this.power = power;
        this.description = description;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getPower() {
        return power;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public Ability clone() {
        return new IceBlastAbility(name, power, description);
    }

    
}
