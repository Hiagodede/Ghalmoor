package com.ghalmoor.model.card;

import com.ghalmoor.model.entity.Card;

import java.util.HashMap;
import java.util.Map;

public class CardRepository {

    private Map<CardId, CardDefinition> cards = new HashMap<>();

    public CardRepository()
    {
        loadCards();
    }

    private void loadCards()
    {
        cards.put(CardId.DEER, new CardDefinition("Veado", 1, 2, 0, CardType.NORMAL));
        cards.put(CardId.SNAKE, new CardDefinition("Cobra", 2, 1, 0, CardType.NORMAL));
        cards.put(CardId.BIRD, new CardDefinition("Pássaro", 1, 1, 0, CardType.NORMAL));
        cards.put(CardId.FOX, new CardDefinition("Raposa", 2, 2, 0, CardType.NORMAL));

        cards.put(CardId.BOSTA, new CardDefinition("Bosta", 2, 2, 0, CardType.MONSTER));
        cards.put(CardId.RAPOSA_SANGRENTA, new CardDefinition("Raposa Sangrenta", 4, 2, 0, CardType.MONSTER));
        cards.put(CardId.HOCUS_POCUS, new CardDefinition("Hocus Pocus", 3, 1, 0, CardType.ENTITY));

// CARTAS DE TESTE
        cards.put(CardId.LION, new CardDefinition("Leão", 5, 6, 0, CardType.NORMAL));
        cards.put(CardId.WOLF, new CardDefinition("Lobo", 3, 4, 0, CardType.NORMAL));
        cards.put(CardId.BEAR, new CardDefinition("Urso", 6, 7, 0, CardType.NORMAL));
        cards.put(CardId.EAGLE, new CardDefinition("Águia", 4, 5, 0, CardType.NORMAL));
        cards.put(CardId.TIGER, new CardDefinition("Tigre", 5, 6, 0, CardType.NORMAL));
        cards.put(CardId.BOAR, new CardDefinition("Javali", 4, 5, 0, CardType.NORMAL));
        cards.put(CardId.OWL, new CardDefinition("Coruja", 3, 2, 0, CardType.NORMAL));
        cards.put(CardId.SHARK, new CardDefinition("Tubarão", 6, 7, 0, CardType.NORMAL));
        cards.put(CardId.HORSE, new CardDefinition("Cavalo", 3, 3, 0, CardType.NORMAL));
        cards.put(CardId.RABBIT, new CardDefinition("Coelho", 1, 1, 0, CardType.NORMAL));
        cards.put(CardId.FROG, new CardDefinition("Sapo", 1, 2, 0, CardType.NORMAL));
        cards.put(CardId.CROCODILE, new CardDefinition("Crocodilo", 5, 6, 0, CardType.NORMAL));
        cards.put(CardId.PANTHER, new CardDefinition("Pantera", 4, 5, 0, CardType.NORMAL));
        cards.put(CardId.BUFFALO, new CardDefinition("Búfalo", 6, 6, 0, CardType.NORMAL));
        cards.put(CardId.FALCON, new CardDefinition("Falcão", 3, 4, 0, CardType.NORMAL));
        cards.put(CardId.GOAT, new CardDefinition("Cabra", 2, 2, 0, CardType.NORMAL));
        cards.put(CardId.DOG, new CardDefinition("Cachorro", 2, 3, 0, CardType.NORMAL));
    }

    public CardDefinition getCard(CardId id)
    {
        return cards.get(id);
    }
}
