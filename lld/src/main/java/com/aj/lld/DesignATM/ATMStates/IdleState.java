package com.aj.lld.DesignATM.ATMStates;

import com.aj.lld.DesignATM.ATM;
import com.aj.lld.DesignATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
