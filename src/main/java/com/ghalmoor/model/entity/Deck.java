package com.ghalmoor.model.entity;

import com.ghalmoor.model.card.CardDefinition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> deckCards = new ArrayList<>();

    public void addCard(Card card)
    {
        deckCards.add(card);
    }

    public Card buyCard()
    {
        if(deckCards.isEmpty())
            throw new IllegalStateException("Deck Vazio");

        return deckCards.remove(deckCards.size() - 1);
    }

    public void shuffle()
    {
        Collections.shuffle(deckCards);
    }
}
