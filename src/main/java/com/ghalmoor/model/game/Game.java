package com.ghalmoor.model.game;

import com.ghalmoor.model.entity.Board;
import com.ghalmoor.model.entity.Player;
import com.ghalmoor.model.state.BuyPhaseState;
import com.ghalmoor.model.state.GameState;
import com.ghalmoor.model.entity.Card;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;

    private GameState currentState;


    public Game(Player player1, Player player2, Board board)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;

        this.currentState = new BuyPhaseState();

        this.currentPlayer = player1;
    }

    public void setState(GameState state) {
        this.currentState = state;
    }

    //getter
    public GameState getState()
    {
        return currentState;
    }

    public void startGame()
    {
        for(int i = 0; i < 3; i++)
        {
            player1.drawCard();
            player2.drawCard();
        }
    }

    public void endTurn()
    {
        currentPlayer = (currentPlayer == player1)? player2 : player1;
    }

    public Player getCurrentPlayer()
    {
        return currentPlayer;
    }

    public Player getPlayer1()
    {
        return player1;
    }

    public Board getBoard()
    {
        return board;
    }

    public void drawCard()
    {
        currentState.drawCard(this);
    }

    private void autoPlayerCard(Game game)
    {
        Player player = currentPlayer;

        if(player.getHand().getCards().isEmpty())
            return;

        Card card = player.getHand().removeCard(0);

        for(int i = 0; i < 5; i++)
        {
            if(board.getPlayerCard(i) == null)
            {
                board.placeCard(card, i);
                System.out.println("\n Player colocou carta no slot: " + i);
                return;
            }
            else
            {
                if(board.getEnemyCard(i) == null)
                {
                    board.placeEnemyCard(card, i);
                    System.out.println("\n Inimigo colocou carta no slot: " + i);
                    return;
                }

            }
        }
    }

    void attack(Game game)
    {
        currentState.attack(this);
    }
    void nextPhase(Game game)
    {
        currentState.endTurn(this);
    }

    public void playTurn()
    {
        System.out.println(currentPlayer == player1? "TURNO DO PLAYER" : "TURNO DO INIMIGO");


    }

}
