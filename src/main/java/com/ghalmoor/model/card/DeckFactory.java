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

        deck.addCard(repository.getCard(CardId.DEER));
        deck.addCard(repository.getCard(CardId.BIRD));
        deck.addCard(repository.getCard(CardId.FOX));
        deck.addCard(repository.getCard(CardId.SHARK));
        deck.addCard(repository.getCard(CardId.HORSE));
        deck.addCard(repository.getCard(CardId.FROG));

        deck.shuffle();

        return deck;
    }
    public Deck enemyInicialDeck() {
        Deck deck = new Deck();

        deck.addCard(repository.getCard(CardId.BOSTA));
        deck.addCard(repository.getCard(CardId.RAPOSA_SANGRENTA));
        deck.addCard(repository.getCard(CardId.HOCUS_POCUS));

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
