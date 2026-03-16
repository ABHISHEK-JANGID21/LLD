package com.aj.llm.chainOfResponsibility.atm;

class FiveHundredDispenser extends CashDispenser {
    public void dispense(int amount) {
        int notes = amount / 500;
        int remaining = amount % 500;

        if (notes > 0)
            System.out.println("Dispensing " + notes + " x ₹500");

        if (remaining > 0 && next != null)
            next.dispense(remaining);
    }
}
