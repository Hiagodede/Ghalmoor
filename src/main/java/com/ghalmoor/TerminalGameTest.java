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


        Player player1 = new Player("player 1" ,deck1);
        Player player2 = new Player("player 2" ,deck2);

//        Board board = new Board(player1, player2);
//
//        Game game = new Game(player1, player2);
//        game.startTurn();

        for(int i = 0; i < 5; i++)
        {
        }

//        System.out.println("\nCartas do Jogador: tam: " + player1.getHand().getSize());
//        for(var card : player1.getHand().getCards())
//        {
//            System.out.println(card.getDefinition().getName()+ " " + card.getAttack()+ " " + card.getHealth());
//        }
//
//        System.out.println("\nCartas do Inimigo: tam: " + enemy.getHand().getSize());
//        for(var card : enemy.getHand().getCards())
//        {
//            System.out.println(card.getDefinition().getName()+ " " + card.getAttack()+ " " + card.getHealth());
//        }
    }
}
