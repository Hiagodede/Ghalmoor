package com.ghalmoor;

import com.ghalmoor.model.entity.*;
import com.ghalmoor.model.card.*;

public class TerminalGameTest {
    public static void main(String[] args)
    {
        CardRepository repository = new CardRepository();
        DeckFactory factory = new DeckFactory(repository);

        Deck deck1 = factory.InicialDeck();
        Deck deck2 = factory.InicialDeck();

        Player player1 = new Player(deck1);
        Player player2 = new Player(deck2);

        Board board = new Board();

        player1.drawCard();
        player1.drawCard();
        player1.drawCard();

        player2.drawCard();
        player2.drawCard();
        player2.drawCard();

        System.out.println("\nCartas Player1: ");
        for(var card : player1.getPlayerHand().getCards())
        {
            System.out.println(card.getDefinition().getName()+ " " + card.getAttack()+ " " + card.getHealth());
        }

        System.out.println("\nCartas Player2: ");
        for(var card : player2.getPlayerHand().getCards())
        {
            System.out.println(card.getDefinition().getName()+ " " + card.getAttack()+ " " + card.getHealth());
        }
    }
}
