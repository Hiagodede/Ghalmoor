package com.ghalmoor.model.entity;

import com.ghalmoor.model.card.CardDefinition;
import com.ghalmoor.util.GameConfig;

public class Player {
    private GameConfig gameConfig;
    private Hand playerHand;
    private Deck deck;
    private int health;
    private int sanity;
    private int maxSanity;
    private String name;

    public Player(String name,Deck deck) {
        this.deck = deck;
        this.name = name;
        this.playerHand = new Hand();
        health = gameConfig.PLAYER_INITIAL_HEALTH;
        sanity = gameConfig.PLAYER_INITIAL_SANITY;
        maxSanity = gameConfig.PLAYER_MAX_SANITY;
    }

    public void drawCard() {
        if(deck.isEmpty())
        {
            System.out.println("\nDeck vazio, não pode mais comprar");
            return;
        }
        CardDefinition definition = deck.drawCard();
        Card card = new Card(definition);

        playerHand.addCard(card);
    }

    public Hand getHand() {
        return playerHand;
    }

    public String getName()
    {
        return name;
    }

    public void takeDame(int damage)
    {
        this.health -= damage;

        if(this.health < 0)
            this.health = 0;
    }

    public boolean spendSanity(int amount)
    {
        if(this.sanity < amount)
            return false;

        this.sanity -= amount;
        return true;
    }

    public void gainSanity(int amount)
    {
        this.sanity = Math.min(this.sanity + amount ,gameConfig.PLAYER_MAX_SANITY);
    }

    public boolean isAlive()
    {
        return this.health > 0;
    }


}
