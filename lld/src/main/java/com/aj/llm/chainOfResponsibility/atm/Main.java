package com.aj.llm.chainOfResponsibility.atm;
public class Main {
    public static void main(String[] args) {

        Account account = new Account("ACC123", 50000);
        Card card = new Card("CARD123", 1234, account);
        User user = new User("Abhishek", card);

        ATM atm = new ATM();

        if (atm.authenticate(user.getCard(), 1234)) {
            atm.withdraw(user.getCard(), 3700);
        } else {
            System.out.println("Invalid PIN");
        }
    }
}
