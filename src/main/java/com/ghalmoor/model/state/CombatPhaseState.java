package com.ghalmoor.model.state;

import com.ghalmoor.model.command.PlayCardCommand;
import com.ghalmoor.model.entity.Player;
import com.ghalmoor.model.game.Game;

public class CombatPhaseState implements GameState{

    @Override
    public void playCard(Game game, Player player, int handIndex, int slot)
    {
        System.out.println("\nNão é possível lançar cartas na fase de combate");
    }
    @Override
    public void drawCard(Game game, Player player)
    {
        System.out.println("Não é possível retirar cartas do baralho durante a fase de luta");
    }

    @Override
    public void attack(Game game)
    {
        System.out.println("\nAtacando...");

        game.resolveCombat();
    }
    @Override
    public void endTurn(Game game)
    {
        System.out.println("\nTurno encerrado");
        game.nextPlayer();
        game.setState(new BuyPhaseState());
    }
}
