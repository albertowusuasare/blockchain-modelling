package com.onua.blockchain.bitcoin.domain;

import com.onua.blockchain.bitcoin.Ledger;
import lombok.Value;

public class Node {
    protected Ledger currentLedgerState;

     public Node(Ledger currentLedgerState){
        this.currentLedgerState = currentLedgerState;
    }

    public Ledger getCurrentLedgerState() {
        return currentLedgerState;
    }

    protected void updateLedgerState(Block block){

    }
}
