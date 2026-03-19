package com.ghalmoor.model.card;

import com.ghalmoor.model.entity.Card;

import java.util.HashMap;
import java.util.Map;

public class CardRepository {

    private Map<String, CardDefinition> cards = new HashMap<>();

    public CardRepository()
    {
        loadCards();
    }

    private void loadCards()
    {
        cards.put("deer", new CardDefinition("dear", "Veado", 1, 2, 0));
        cards.put("snake", new CardDefinition("snake", "Cobra", 2, 1, 0));
        cards.put("bird", new CardDefinition("bird", "Passaro", 1, 1, 0));
        cards.put("fox", new CardDefinition("fox", "Raposa", 2, 2, 0));

        cards.put("bosta", new CardDefinition("bosta", "Bosta", 2, 2, 0));
        cards.put("raposaSangrenta", new CardDefinition("raposaSangrenta", "Raposa Sangrenta", 4, 2, 0));
        cards.put("hocusPocus", new CardDefinition("hocusPocus", "Hocus Pocus", 3, 1, 0));

        //CARTAS CRIADAS PELA IA PARA FINS DE TESTE
        cards.put("lion", new CardDefinition("lion", "Leão", 5, 6, 0));
        cards.put("wolf", new CardDefinition("wolf", "Lobo", 3, 4, 0));
        cards.put("bear", new CardDefinition("bear", "Urso", 6, 7, 0));
        cards.put("eagle", new CardDefinition("eagle", "Águia", 4, 5, 0));
        cards.put("tiger", new CardDefinition("tiger", "Tigre", 5, 6, 0));
        cards.put("boar", new CardDefinition("boar", "Javali", 4, 5, 0));
        cards.put("owl", new CardDefinition("owl", "Coruja", 3, 2, 0));
        cards.put("shark", new CardDefinition("shark", "Tubarão", 6, 7, 0));
        cards.put("horse", new CardDefinition("horse", "Cavalo", 3, 3, 0));
        cards.put("rabbit", new CardDefinition("rabbit", "Coelho", 1, 1, 0));
        cards.put("frog", new CardDefinition("frog", "Sapo", 1, 2, 0));
        cards.put("crocodile", new CardDefinition("crocodile", "Crocodilo", 5, 6, 0));
        cards.put("panther", new CardDefinition("panther", "Pantera", 4, 5, 0));
        cards.put("buffalo", new CardDefinition("buffalo", "Búfalo", 6, 6, 0));
        cards.put("falcon", new CardDefinition("falcon", "Falcão", 3, 4, 0));
        cards.put("goat", new CardDefinition("goat", "Cabra", 2, 2, 0));
        cards.put("dog", new CardDefinition("dog", "Cachorro", 2, 3, 0));
    }

    public CardDefinition getCard(String id)
    {
        return cards.get(id);
    }
}
