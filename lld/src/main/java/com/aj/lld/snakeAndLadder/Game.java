package com.aj.lld.snakeAndLadder;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private final Board board = new Board();
    private final Dice dice = new Dice();
    private final Queue<Player> players = new LinkedList<>();

    public void addPlayer(Player player) {
        players.offer(player);
    }

    public void start() {
        while (true) {
            Player current = players.poll();
            int roll = dice.roll();
            int nextPos = current.getPosition() + roll;

            if (nextPos <= board.getSize()) {
                nextPos = board.getFinalPosition(nextPos);
                current.setPosition(nextPos);
            }

            System.out.println(current.getName() +
                    " rolled " + roll +
                    " moved to " + current.getPosition());

            if (current.getPosition() == board.getSize()) {
                System.out.println("🏆 Winner: " + current.getName());
                break;
            }
            players.offer(current);
        }
    }
}

