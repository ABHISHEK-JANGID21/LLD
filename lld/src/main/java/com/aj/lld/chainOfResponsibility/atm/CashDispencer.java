package com.aj.lld.chainOfResponsibility.atm;

abstract class CashDispenser {
    protected CashDispenser next;

    public void setNext(CashDispenser next) {
        this.next = next;
    }

    abstract void dispense(int amount);
}

