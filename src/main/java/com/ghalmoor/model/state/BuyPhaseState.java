package com.ghalmoor.model.state;

import com.ghalmoor.model.command.PlayCardCommand;
import com.ghalmoor.model.entity.Player;
import com.ghalmoor.model.game.Game;

public class BuyPhaseState implements GameState{

    @Override
    public void playCard(Game game, Player player, int handIndex, int slot)
    {
        System.out.println("\n Compre uma carta antes de jogar");
    }
    @Override
    public void drawCard(Game game, Player player)
    {
        player.drawCard();
    }
    @Override
    public void attack(Game game)
    {
        System.out.println("Não é possível atacar na fase de compra");
    }
    @Override
    public void endTurn(Game game)
    {
        game.setState(new PlanningPhase());
    }
}
