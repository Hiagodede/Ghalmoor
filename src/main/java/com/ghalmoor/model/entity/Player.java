package com.ghalmoor.model.entity;

import com.ghalmoor.model.card.CardDefinition;

public class Player {
    private Hand playerHand;
    private Deck deck;

    public Player(Deck deck) {
        this.deck = deck;
        this.playerHand = new Hand();
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

}
