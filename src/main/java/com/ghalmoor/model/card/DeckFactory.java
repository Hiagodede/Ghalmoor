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

    public Deck inicialDeck() {
        Deck deck = new Deck();

        deck.addCard(repository.getCard("deer"));
        deck.addCard(repository.getCard("bird"));
        deck.addCard(repository.getCard("fox"));
        deck.addCard(repository.getCard("shark"));
        deck.addCard(repository.getCard("horse"));
        deck.addCard(repository.getCard("frog"));

        deck.shuffle();

        return deck;
    }
    public Deck enemyInicialDeck() {
        Deck deck = new Deck();

        deck.addCard(repository.getCard("bosta"));
        deck.addCard(repository.getCard("raposaSangrenta"));
        deck.addCard(repository.getCard("hocusPocus"));

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
