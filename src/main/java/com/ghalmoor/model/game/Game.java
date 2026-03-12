package com.ghalmoor.model.game;

import com.ghalmoor.model.entity.Board;
import com.ghalmoor.model.entity.Player;

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



}
