package com.aj.lld.snakeAndLadder;
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer(new Player("A"));
        game.addPlayer(new Player("B"));
        game.start();
    }
}
