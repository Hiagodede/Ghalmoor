package com.ghalmoor.model.entity;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.HashMap;
import com.ghalmoor.model.game.Game;

public class Board {
    private static final int MAX_SLOTS = 5;

    private Map<Player, Card[]> slots;

    //
    // CONSTRUTOR
    //
    public Board(Player player1, Player player2)
    {
        slots = new HashMap<>();
        slots.put(player1, new Card[MAX_SLOTS]);
        slots.put(player2, new Card[MAX_SLOTS]);
    }

    //
    // VALIDAÇÃO
    //
    public boolean isValidSlot(int slot)
    {
        return slot >= 0 && slot < MAX_SLOTS;
    }

    public boolean isSlotAvailable(Player player, int slot) {
        if (!isValidSlot(slot))
            return false;
        Card[] playerSlots = slots.get(player);
        return playerSlots != null && playerSlots[slot] == null;
    }

    //
    // AÇÕES
    //
    public boolean placeCard(Player player ,Card card, int slot)
    {
        if(!isSlotAvailable(player, slot))
            return false;
        slots.get(player)[slot] = card;
        return true;
    }

    public Card getCard(Player player,int slot)
    {
        if(!isValidSlot(slot))
            return null;
        return slots.get(player)[slot];
    }

    //
    //COMBAT
    //

    public void resolveCombat(Player attacker, Player defender)
    {
        Card[] attackerSlots = slots.get(attacker);
        Card[] defenderSlots = slots.get(defender);

        for(int i = 0; i < MAX_SLOTS; i++)
        {
            Card atk = attackerSlots[i];
            Card def = defenderSlots[i];

            if(atk == null)
                continue;

            if(def != null)
            {
                def.takeDamage(atk.getAttack());
            }
            else
            {
                defender.takeDamege(atk.getAttack());
            }
        }
        removeDeadCards(attacker);
        removeDeadCards(defender);
    }

    public void removeDeadCards(Player player) //CORRIGIR
    {
        Card[] playerSlots = slots.get(player);
        for(int i = 0; i < MAX_SLOTS; i++)
        {
            if(playerSlots[i] != null && !playerSlots[i].isAlive())
            {
                playerSlots[i] = null;
            }
        }
    }

    public Card[] getSlots(Player player)
    {
        return slots.get(player);
    }

}
