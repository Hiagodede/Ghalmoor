package com.ghalmoor.model.command;

import com.ghalmoor.model.entity.Card;
public class AttackCommand implements Command{

    private Card attacker;
    private Card defender;

    public AttackCommand(Card attacker, Card defender)
    {
        this.attacker = attacker;
        this.defender = defender;
    }

    @Override
    public void execute()
    {
        defender.takeDamage(attacker.getAttack());

        if(!defender.isAlive())
            System.out.println("\n Carta " + defender.getDefinition().getName() + "morreu");
    }
}
