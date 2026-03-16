package com.ghalmoor.model.state;

import com.ghalmoor.model.game.Game;

public class BuyPhaseState implements GameState{

    @Override
    public void playCard(Game game)
    {
        System.out.println("\n Compre uma carta antes de jogar");
    }
    @Override
    public void drawCard(Game game)
    {
        game.getCurrentPlayer().drawCard();
    }
    @Override
    public void attack(Game game)
    {
        System.out.println("Não é possível atacar na fase de compra");
    }
    @Override
    public void endTurn(Game game)
    {
        game.setState(new CombatPhaseState());
    }
}
