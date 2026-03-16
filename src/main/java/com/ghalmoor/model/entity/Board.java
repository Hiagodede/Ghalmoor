package com.ghalmoor.model.entity;

import java.lang.reflect.Array;

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
    public void resolveCombat()
    {
        for(int i = 0; i < 5; i++)
        {
            Card playerCard = playerSlot[i];
            Card enemyCard = enemySlot[i];

            if(playerCard != null)
            {
                if(enemyCard != null)
                {
                    enemyCard.takeDamage(playerCard.getAttack());
                }
            }

            if(enemyCard != null)
            {
                if(playerCard != null)
                {
                    playerCard.takeDamage(enemyCard.getAttack());
                }
            }
        }
    }

    public void removeDeadCards()
    {
        for(int i = 0; i < 5; i++)
        {
            if(playerSlot[i] != null && playerSlot[i].isDead())
            {
                playerSlot[i] = null;
            }

            if(enemySlot[i] != null && enemySlot[i].isDead())
            {
                enemySlot[i] = null;
            }
        }
    }
}
