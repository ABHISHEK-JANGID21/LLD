package com.aj.lld.chainOfResponsibility.atm;

class TwoThousandDispenser extends CashDispenser {
    public void dispense(int amount) {
        int notes = amount / 2000;
        int remaining = amount % 2000;

        if (notes > 0)
            System.out.println("Dispensing " + notes + " x ₹2000");

        if (remaining > 0 && next != null)
            next.dispense(remaining);
    }
}
