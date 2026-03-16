package com.aj.llm.chainOfResponsibility.atm;
class ATM {

    private CashDispenser cashDispenser;

    public ATM() {
        CashDispenser d2000 = new TwoThousandDispenser();
        CashDispenser d500 = new FiveHundredDispenser();
        CashDispenser d200 = new TwoHundredDispenser();

        d2000.setNext(d500);
        d500.setNext(d200);

        cashDispenser = d2000;
    }

    public boolean authenticate(Card card, int pin) {
        return card.validatePin(pin);
    }

    public void withdraw(Card card, int amount) {
        Account account = card.getAccount();

        if (amount % 100 != 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (!account.hasSufficientBalance(amount)) {
            System.out.println("Insufficient balance");
            return;
        }

        account.debit(amount);
        cashDispenser.dispense(amount);

        System.out.println("Remaining Balance: ₹" + account.getBalance());
    }
}
