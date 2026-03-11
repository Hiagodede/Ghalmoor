package com.ghalmoor.model.progression;

import com.ghalmoor.model.card.CardDefinition;

import java.util.ArrayList;
import java.util.List;

public class PlayerCollection {

    private List<CardDefinition> unlockedCards = new ArrayList<>();

    public void unlockCard(CardDefinition card)
    {
        unlockedCards.add(card);
    }

    public List<CardDefinition> getUnlockedCards()
    {
        return unlockedCards;
    }
}
