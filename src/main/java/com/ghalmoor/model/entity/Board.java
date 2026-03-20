package com.ghalmoor.model.entity;

import java.lang.reflect.Array;
import com.ghalmoor.model.game.Game;

public class Board {
    private Card[] playerSlot = new Card[5];
    private Card[] enemySlot = new Card[5];

    public void placeCard(Card card, int position)
    {
        if(playerSlot[position] != null)
            throw new IllegalStateException("Slot ocupado");

        playerSlot[position] = card;
    }

    public void placeEnemyCard(Card card, int position)
    {
        if(enemySlot[position] != null)
            throw new IllegalStateException("Slot ocupado");

        enemySlot[position] = card;
    }

    public Card getPlayerCard(int position)
    {
        return playerSlot[position];
    }

    public Card getEnemyCard(int position)
    {
        return enemySlot[position];
    }

    //COMBAT

    //combate provisório
    public void resolveCombat(Game game)
    {
        Player current = game.getCurrentPlayer();
        boolean isPlayerTurn = (current == game.getPlayer1());

        for(int i = 0; i < 5; i++)
        {
            Card attacker;
            Card defender;

            if(isPlayerTurn)
            {
                attacker = playerSlot[i];
                defender = enemySlot[i];
            }
            else
            {
                attacker = enemySlot[i];
                defender = playerSlot[i];
            }

            if(attacker != null)
            {
                if(defender != null)
                {
                    defender.takeDamage(attacker.getAttack());

                    //Remover depois
                    System.out.println("\n" + attacker.getDefinition().getName() + " atacou " + defender.getDefinition().getName());
                }
            }

            //Atacar o boss diretamente como no inscryption
        }
    }

    public void removeDeadCards() //CORRIGIR
    {
        for(int i = 0; i < 5; i++)
        {
            if(playerSlot[i] != null && playerSlot[i].isAlive())
            {
                playerSlot[i] = null;
            }

            if(enemySlot[i] != null && enemySlot[i].isAlive())
            {
                enemySlot[i] = null;
            }
        }
    }
}
