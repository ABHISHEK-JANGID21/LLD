package com.aj.llm.chainOfResponsibility.atm;

class Card {
    private String cardNumber;
    private int pin;
    private Account account;

    public Card(String cardNumber, int pin, Account account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public Account getAccount() {
        return account;
    }
}

