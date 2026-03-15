package com.ghalmoor.model.command;
import com.ghalmoor.model.entity.Player;

public class DrawCardCommand implements Command{

    private Player player;

    public DrawCardCommand(Player player)
    {
        this.player = player;
    }

    @Override
    public void execute()
    {
        player.drawCard();
    }
}
