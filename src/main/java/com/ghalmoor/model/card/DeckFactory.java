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

        deck.addCard(new Card(repository.getCard("deer")));
        deck.addCard(new Card(repository.getCard("bird")));
        deck.addCard(new Card(repository.getCard("fox")));

        deck.shuffle();

        return deck;
    }

    public Deck createPlayerDeck(PlayerCollection collection)
    {
        Deck deck = new Deck();

        for(CardDefinition card : collection.getUnlockedCards())
        {
            deck.addCard(new Card(card));
        }

        deck.shuffle();

        return deck;
    }
}
