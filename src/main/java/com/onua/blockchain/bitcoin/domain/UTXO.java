package com.onua.blockchain.bitcoin.domain;

import java.math.BigDecimal;

public class UTXO {
    private final String ownerPublicKey;
    private final BigDecimal denomination;

    public UTXO(String ownerPublicKey, BigDecimal denomination){
        this.ownerPublicKey = ownerPublicKey;
        this.denomination = denomination;
    }

    public String getOwnerPublicKey() {  return ownerPublicKey;  }

    public BigDecimal getDenomination() { return denomination; }

    public boolean isOwnerValid(String ownerPublicKey){
        throw new RuntimeException("Not yet Implemented");
    }

}
