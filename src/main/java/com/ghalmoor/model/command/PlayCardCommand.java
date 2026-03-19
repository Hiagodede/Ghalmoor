package com.ghalmoor.model.command;
import com.ghalmoor.model.entity.*;

public class PlayCardCommand implements Command{

    private Player player;
    private Board board;
    private int handIndex;
    private int slot;
    private boolean isEnemy;

    public PlayCardCommand(Player player, Board board, int handIndex,int slot, boolean isEnemy)
    {
        this.player = player;
        this.board = board;
        this.handIndex = handIndex;
        this.slot = slot;
        this.isEnemy = isEnemy;
    }
    @Override
    public void execute()
    {
        Card card = player.getHand().removeCard(handIndex);

        if(isEnemy)
            board.placeEnemyCard(card, slot);
        else
            board.placeCard(card, slot);
    }

}
