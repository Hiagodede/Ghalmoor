package com.ghalmoor.model.game;

import com.ghalmoor.model.card.CardDefinition;
import com.ghalmoor.model.card.CardRepository;
import com.ghalmoor.model.card.DeckFactory;
import com.ghalmoor.model.entity.Board;
import com.ghalmoor.model.entity.Player;
import java.math.*;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;


    public Game(Player player1, Player player2, Board board)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;

        this.currentPlayer = player1;
    }

    public void startGame()
    {
        for(int i = 0; i < 3; i++)
        {
            player1.drawCard();
            player2.drawCard();
        }

        CardDefinition def = player2.getPlayerHand().getCards().getFirst().getDefinition();
    }

    public void endTurn()
    {
        currentPlayer = (currentPlayer == player1)? player2 : player1;
    }

    public Player getCurrentPlayer()
    {
        return currentPlayer;
    }

    public Board getBoard()
    {
        return board;
    }

}
