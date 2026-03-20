package com.ghalmoor.model.command;
import com.ghalmoor.model.entity.*;
import com.ghalmoor.model.game.Game;

public class PlayCardCommand implements Command{

    private Game game;
    private Player player;
    private int handIndex;
    private int slot;

    public PlayCardCommand(Player player, Board board, Game game, int handIndex, int slot)
    {
        this.player = player;
        this.game = game;
        this.handIndex = handIndex;
        this.slot = slot;
    }
    @Override
    public void execute()
    {
        game.playCard(player, handIndex, slot);
    }

}
