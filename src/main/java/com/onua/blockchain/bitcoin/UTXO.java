package com.onua.blockchain.bitcoin;

import java.math.BigDecimal;

public class UTXO {
    private final String ownerPublicKey;
    private final BigDecimal denomination;

    public UTXO(String ownerPublicKey, BigDecimal denomination){
        this.ownerPublicKey = ownerPublicKey;
        this.denomination = denomination;
    }

    String getOwnerPublicKey() {  return ownerPublicKey;  }

    BigDecimal getDenomination() { return denomination; }

    boolean isOwnerValid(String ownerPublicKey){
        throw new RuntimeException("Not yet Implemented");
    }

}
