package com.ghalmoor.model.game;

import com.ghalmoor.model.entity.Board;
import com.ghalmoor.model.entity.Player;
import com.ghalmoor.model.state.BuyPhaseState;
import com.ghalmoor.model.state.GameState;
import com.ghalmoor.model.entity.Card;
import com.ghalmoor.model.state.PlanningPhase;

public class Game {
    private Player player1;
    private Player player2;

    private Board board;

    private Player currentPlayer;
    private GameState currentState;

    //
    //CONSTRUTOR
    //
    public Game(Player player1, Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
        board = new Board(player1, player2);

        this.currentState = new BuyPhaseState();

        this.currentPlayer = player1;

        this.currentState = new PlanningPhase();
    }

    //
    //GETTERS
    //
    public GameState getState()
    {
        return currentState;
    }
    public Player getCurrentPlayer()
    {
        return currentPlayer;
    }
    public Player getOpponent(Player player)
    {
        return player == player1? player2 : player1;
    }

    public Board getBoard()
    {
        return board;
    }

    //
    //CONTROLADOR DE ESTADOS
    //
    public void setState(GameState state) {
        this.currentState = state;
    }

    //
    //AÇÕES DELAGADAS AO STATE
    //
    public void endTurn()
    {
        currentState.endTurn(this);
    }

    public void drawCard(Player player)
    {
        currentState.drawCard(this, player);
    }

    public void playCard(Player player, int handIndex, int slot)
    {
        currentState.playCard( this ,player, handIndex, slot);
    }

    void attack()
    {
        currentState.attack(this);
    }

    //FLUXO DE TURNO

    public void nextPlayer()
    {
        currentPlayer = (currentPlayer == player1)? player2: player1;
    }

    public void startTurn()
    {
        System.out.println("\n Turno de: " + currentPlayer.getName());

        currentPlayer.drawCard();

        setState(new PlanningPhase());
    }

    public void resolveCombat()
    {
        Player opponent = getOpponent(currentPlayer);

        board.resolveCombat(currentPlayer, opponent);

        checkGameOver();
    }

    public void checkGameOver()
    {
        if(!player1.isAlive())
            System.out.println("\nInimigo venceu!");
        else if(!player2.isAlive())
            System.out.println("\nJogador venceu!");
    }

}
