package com.ghalmoor.model.card;

import com.ghalmoor.model.entity.Deck;
import com.ghalmoor.model.entity.Card;
import com.ghalmoor.model.progression.PlayerCollection;

public class DeckFactory {

    CardRepository repository;

    //constructor
    public DeckFactory(CardRepository repository) {
        this.repository = repository;
    }

    public Deck InicialDeck() {
        Deck deck = new Deck();

        deck.addCard(repository.getCard("deer"));
        deck.addCard(repository.getCard("bird"));
        deck.addCard(repository.getCard("fox"));

        deck.shuffle();

        return deck;
    }

    public Deck createPlayerDeck(PlayerCollection collection)
    {
        Deck deck = new Deck();

        for(CardDefinition card : collection.getUnlockedCards())
        {
            deck.addCard(card);
        }

        deck.shuffle();

        return deck;
    }
}
