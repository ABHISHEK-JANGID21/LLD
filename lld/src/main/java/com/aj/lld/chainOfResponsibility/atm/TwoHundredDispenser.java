package com.aj.lld.chainOfResponsibility.atm;

class TwoHundredDispenser extends CashDispenser {
    public void dispense(int amount) {
        int notes = amount / 200;
        int remaining = amount % 200;

        if (notes > 0)
            System.out.println("Dispensing " + notes + " x ₹200");

        if (remaining > 0 && next != null)
            next.dispense(remaining);
    }
}
