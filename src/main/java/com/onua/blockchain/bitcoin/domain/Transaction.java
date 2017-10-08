package com.onua.blockchain.bitcoin.domain;

import java.math.BigDecimal;
import java.util.List;

public class Transaction {
    private final List<UTXO> inputs;
    private final List<UTXO> outputs;
    private final String senderSignature;

    public Transaction(List<UTXO> inputs, List<UTXO> outputs, String senderSignature){
        this.inputs = inputs;
        this.outputs = outputs;
        this.senderSignature = senderSignature;
    }

    public List<UTXO> getInputs() {
        return inputs;
    }

    public List<UTXO> getOutputs() {
        return outputs;
    }

    public String getSenderSignature() {
        return senderSignature;
    }

    public boolean isTransactionSettleable(List<UTXO> inputs, List<UTXO> outputs){
        return getTotalDenomination(inputs).equals(getTotalDenomination(outputs));
    }

    private BigDecimal getTotalDenomination(List<UTXO> unspentTransactions){
        return  unspentTransactions.stream().map(UTXO::getDenomination)
                              .reduce(BigDecimal::add)
                              .orElseGet(() -> new BigDecimal(0));
    }
}
