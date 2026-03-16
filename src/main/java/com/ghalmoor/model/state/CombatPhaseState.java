package com.ghalmoor.model.state;

import com.ghalmoor.model.game.Game;

public class CombatPhaseState implements GameState{

    @Override
    public void playCard(Game game)
    {
        System.out.println("\nNão é possível lançar cartas na fase de combate");
    }
    @Override
    public void drawCard(Game game)
    {
        System.out.println("Não é possível retirar cartas do baralho durante a fase de luta");
    }

    @Override
    public void attack(Game game)
    {
        System.out.println("\nAtacando...");

        game.getBoard().resolveCombat();
        game.getBoard().removeDeadCards();
    }
    @Override
    public void endTurn(Game game)
    {
        System.out.println("\nTurno encerrado");
        game.endTurn();
        game.setState(new BuyPhaseState());
    }
}
