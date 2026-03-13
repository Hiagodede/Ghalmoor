package com.ghalmoor.model.entity;

import java.lang.reflect.Array;

public class Board {
    private Card[] playerSlot = new Card[5];
    private Card[] enemySlot = new Card[5];

    public void placeCard(Card card, int position)
    {
        if(playerSlot[position] != null)
            throw new IllegalStateException("Slot ocupado");

        playerSlot[position] = card;
    }

    public void placeEnemyCard(Card card, int position)
    {
        if(playerSlot[position] != null)
            throw new IllegalStateException("Slot ocupado");

        playerSlot[position] = card;
    }

    public Card getCard(int position)
    {
        return playerSlot[position];
    }
}
