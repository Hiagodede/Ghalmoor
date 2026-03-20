package com.ghalmoor.model.entity;

import com.ghalmoor.model.card.CardDefinition;

public class Card {
    private CardDefinition definition;
    private int currentAttack;
    private int currentHealth;
    private boolean hasAttacked;

    public Card(CardDefinition definition)
    {
        this.definition = definition;
        this.currentAttack = definition.getAttack();
        this.currentHealth = definition.getHealth();
        this.hasAttacked = false;
    }

    public int getAttack()
    {
        return currentAttack;
    }
    public int getHealth()
    {
        return currentHealth;
    }

    public CardDefinition getDefinition()
    {
        return definition;
    }

    public void takeDamage(int damage)
    {
        this.currentHealth -= damage;

        if(this.currentHealth < 0)
            this.currentHealth = 0;

    }

    public boolean isAlive()
    {
        return currentHealth > 0;
    }
}