package com.ghalmoor;

import com.ghalmoor.model.entity.*;
import com.ghalmoor.model.card.*;
import com.ghalmoor.model.game.Game;

public class TerminalGameTest {
    public static void main(String[] args)
    {
        CardRepository repository = new CardRepository();
        DeckFactory factory = new DeckFactory(repository);

        Deck deck1 = factory.inicialDeck();
        Deck deck2 = factory.enemyInicialDeck();

        Player player1 = new Player(deck1);
        Player enemy = new Player(deck2);

        Board board = new Board();

        Game game = new Game(player1, enemy, board);
        game.startGame();

        System.out.println("\nCartas do Jogador: tam: " + player1.getPlayerHand().getSize());
        for(var card : player1.getPlayerHand().getCards())
        {
            System.out.println(card.getDefinition().getName()+ " " + card.getAttack()+ " " + card.getHealth());
        }

        System.out.println("\nCartas do Inimigo: tam: " + enemy.getPlayerHand().getSize());
        for(var card : enemy.getPlayerHand().getCards())
        {
            System.out.println(card.getDefinition().getName()+ " " + card.getAttack()+ " " + card.getHealth());
        }
    }
}
