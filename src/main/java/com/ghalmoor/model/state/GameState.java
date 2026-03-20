package com.ghalmoor.model.state;

import com.ghalmoor.model.command.PlayCardCommand;
import com.ghalmoor.model.entity.Player;
import com.ghalmoor.model.game.Game;

public interface GameState {

     void playCard(Game game, Player player, int handIndex, int slot);
     void drawCard(Game game);
     void attack(Game game);
     void endTurn(Game game);

}
