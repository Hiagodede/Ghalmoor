package com.ghalmoor.model.entity;

import com.ghalmoor.model.card.CardDefinition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Deck {
    List<CardDefinition> deckCards = new ArrayList<>();

    private void addCard(CardDefinition card)
    {
        deckCards.add(card);
    }
    private Card buyCard()
    {
        if(deckCards.isEmpty())
            throw new IllegalStateException("Deck Vazio");

        CardDefinition definition = deckCards.remove(deckCards.size() - 1);

        return new Card(definition);
    }
    public void shuffle()
    {
        Collections.shuffle(deckCards);
    }
}
