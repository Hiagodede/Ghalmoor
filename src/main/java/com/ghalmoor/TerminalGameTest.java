package com.ghalmoor;

import com.ghalmoor.model.entity.*;
import com.ghalmoor.model.card.*;
import com.ghalmoor.model.game.Game;

public class TerminalGameTest {
    public static void main(String[] args)
    {
        TerminalGameTest teste = new TerminalGameTest();

        CardRepository repository = new CardRepository();
        DeckFactory factory = new DeckFactory(repository);

        Deck deck1 = factory.inicialDeck();
        Deck deck2 = factory.enemyInicialDeck();

        Player player1 = new Player("Player 1", deck1);
        Player player2 = new Player("Player 2", deck2);

        Game game = new Game(player1, player2);
        Board board = game.getBoard();

        // ===== COMPRA INICIAL =====
        for(int i = 0; i < 3; i++) {
            player1.drawCard();
            player2.drawCard();
        }

        // ===== JOGAR CARTAS (MANUAL) =====
        // Player 1 joga 2 cartas
        Card p1Card1 = player1.getHand().getCard(0);
        if (board.placeCard(player1, p1Card1, 0)) {
            player1.getHand().removeCard(0);
        }

        Card p1Card2 = player1.getHand().getCard(0);
        if (board.placeCard(player1, p1Card2, 2)) {
            player1.getHand().removeCard(0);
        }

        // Player 2 joga 2 cartas
        Card p2Card1 = player2.getHand().getCard(0);
        if (board.placeCard(player2, p2Card1, 0)) {
            player2.getHand().removeCard(0);
        }

        Card p2Card2 = player2.getHand().getCard(0);
        if (board.placeCard(player2, p2Card2, 3)) {
            player2.getHand().removeCard(0);
        }

        // ===== PRINT ANTES DO COMBATE =====
        System.out.println("\nANTES DO COMBATE:");
        teste.drawTerminalBoard(board, player1, player2);
        System.out.println("enemy life: " + player2.getHealth());

        // ===== COMBATE =====
        board.resolveCombat(player1, player2);

        // ===== PRINT DEPOIS DO COMBATE =====
        System.out.println("\nDEPOIS DO COMBATE:");
        teste.drawTerminalBoard(board, player1, player2);
        System.out.println("enemy life: " + player2.getHealth());
    }

    public void drawTerminalBoard(Board board, Player player, Player enemy)
    {
        System.out.println("\n----------- Tabuleiro -----------");

        // ===== ENEMY =====
        System.out.print("ENEMY:  ");

        Card[] enemySlots = board.getSlots(enemy);

        for (int i = 0; i < 5; i++) {
            if (enemySlots[i] != null) {
                String name = enemySlots[i].getDefinition().getName();
                System.out.print("[" + formatName(name) + "]");
            } else {
                System.out.print("[     ]");
            }
        }

        System.out.println();

        // ===== PLAYER =====
        System.out.print("PLAYER: ");

        Card[] playerSlots = board.getSlots(player);

        for (int i = 0; i < 5; i++) {
            if (playerSlots[i] != null) {
                String name = playerSlots[i].getDefinition().getName();
                System.out.print("[" + formatName(name) + "]");
            } else {
                System.out.print("[     ]");
            }
        }

        System.out.println();
    }
    private String formatName(String name)
    {
        int max = 5;

        if (name.length() > max)
            return name.substring(0, max);

        return String.format("%-" + max + "s", name);
    }
}
