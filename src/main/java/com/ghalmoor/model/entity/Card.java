package com.ghalmoor.model.entity;

import com.ghalmoor.model.card.CardDefinition;

public class Card {
    private CardDefinition definition;
    private int currentAttack;
    private int currentHealth;

    public Card(CardDefinition definition)
    {
        this.definition = definition;
        this.currentAttack = definition.getAttack();
        this.currentHealth = definition.getHealth();
    }

    public String getName()
    {
        return definition.getName();
    }
    public int getAttack()
    {
        return currentAttack;
    }
    public int getHealth()
    {
        return currentHealth;
    }
}