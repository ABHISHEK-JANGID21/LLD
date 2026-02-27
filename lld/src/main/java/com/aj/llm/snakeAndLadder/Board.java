package com.aj.llm.snakeAndLadder;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int size = 100;
    private final Map<Integer, Jump> jumps = new HashMap<>();

    public Board() {
        jumps.put(99, new Jump(99, 10));   // snake
        jumps.put(70, new Jump(70, 30));   // snake
        jumps.put(5, new Jump(5, 25));     // ladder
        jumps.put(40, new Jump(40, 89));   // ladder
    }

    public int getFinalPosition(int position) {
        return jumps.containsKey(position)
                ? jumps.get(position).end
                : position;
    }

    public int getSize() {
        return size;
    }
}

