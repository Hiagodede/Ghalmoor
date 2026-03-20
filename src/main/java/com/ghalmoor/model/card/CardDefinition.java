package com.ghalmoor.model.card;

public class CardDefinition {
    private String name;
    private final int baseAttack;
    private final int baseHealth;
    private int sanityCost;
    private CardType type;


    public CardDefinition(String name, int attack, int health, int sanityCost, CardType type)
    {
        this.name = name;
        this.baseAttack = attack;
        this.baseHealth = health;
        this.sanityCost = sanityCost;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public int getAttack() {
        return baseAttack;
    }
    public int getHealth() {
        return baseHealth;
    }
    public int getSanityCost() {
        return sanityCost;
    }

}
