package com.narxoz.rpg.combat;

public class FireBallAbility implements Ability {

    private String name ;
    private int power ;
    private String description;

    public FireBallAbility() {
        this.name = "Fireball";
        this.power = 40;
        this.description = "Throws a burning fireball";
    }

    public FireBallAbility(String name, int power, String description) {
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
    public Ability clone(){
        return new FireBallAbility(name, power, description);

    }
}
