package com.aj.llm.chainOfResponsibility.atm;

class User {
    private String name;
    private Card card;

    public User(String name, Card card) {
        this.name = name;
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
}
