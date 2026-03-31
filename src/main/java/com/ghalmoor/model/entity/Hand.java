package com.ghalmoor.model.entity;

import java.util.ArrayList;
import java.util.List;
public class Hand {

    private static final int MAX_HAND_SIZE = 5;
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card)
    {
        if(cards.size() >= MAX_HAND_SIZE)
            throw new IllegalStateException("Mão cheia");

        cards.add(card);
    }

    public Card removeCard(int index)
    {
        if(index < 0 || index > cards.size())
            throw new IllegalStateException("indice inválido para remoção");

        return cards.remove(index);
    }

    public List<Card> getCards()
    {
        return cards;
    }

    public Card getCard(int index)
    {
        return cards.get(index);
    }

    public int getSize()
    {
        return cards.size();
    }
}
