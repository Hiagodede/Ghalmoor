package com.ghalmoor.model.card;

public class CardDefinition {
    private String id;
    private String name;
    private final int baseAttack;
    private final int baseHealth;
    private final int cost; // Custo de sanidade

    public CardDefinition(String id ,String name, int attack, int health, int cost)
    {
        this.id = id;
        this.name = name;
        this.baseAttack = attack;
        this.baseHealth = health;
        this.cost = cost;
    }

    public String getId() {
        return id;
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
    public int getCost() {
        return cost;
    }

}
