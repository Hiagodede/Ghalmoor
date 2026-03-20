package com.ghalmoor.model.state;

import com.ghalmoor.model.command.PlayCardCommand;
import com.ghalmoor.model.entity.Player;
import com.ghalmoor.model.game.Game;

public class PlanningPhase implements GameState{
    @Override
    public void playCard(Game game, Player player, int handIndex, int slot)
    {

    }
    @Override
    public void drawCard(Game game)
    {
        System.out.println("\n Não é possível retirar cartas na fase de planejamento");
    }

    @Override
    public void attack(Game game)
    {
        System.out.println("\n Ainda não pode atacar");
    }

    @Override
    public void endTurn(Game game)
    {
        game.setState(new CombatPhaseState());
    }
}
