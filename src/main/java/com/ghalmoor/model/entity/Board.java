package com.ghalmoor.model.entity;

import java.lang.reflect.Array;

public class Board {
    private Card[] slot = new Card[5];

    public void placeCard(Card card, int position)
    {
        if(slot[position] != null)
            throw new IllegalStateException("Slot ocupado");

        slot[position] = card;
    }

    public Card getCard(int position)
    {
        return slot[position];
    }
}
