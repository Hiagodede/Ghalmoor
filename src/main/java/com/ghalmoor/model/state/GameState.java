package com.ghalmoor.model.state;

import com.ghalmoor.model.game.Game;

public interface GameState {

     void playCard(Game game);
     void drawCard(Game game);
     void attack(Game game);
     void endTurn(Game game);

}
