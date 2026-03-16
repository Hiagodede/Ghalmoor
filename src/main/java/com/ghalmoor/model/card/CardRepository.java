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
    }

    public CardDefinition getCard(String id)
    {
        return cards.get(id);
    }
}
