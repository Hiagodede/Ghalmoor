package com.ghalmoor.model.entity;

import com.ghalmoor.model.card.CardDefinition;
import com.ghalmoor.model.card.CardRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<CardDefinition> deckCards = new ArrayList<>();

    public void addCard(CardDefinition card)
    {
        deckCards.add(card);
    }

    public CardDefinition drawCard()
    {
        if(deckCards.isEmpty())
            throw new IllegalStateException("Deck Vazio");

        return deckCards.remove(deckCards.size() - 1);
    }

    public void shuffle()
    {
        Collections.shuffle(deckCards);
    }

    public boolean isEmpty()
    {
        return deckCards.isEmpty();
    }
}
