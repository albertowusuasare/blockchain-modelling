package com.onua.blockchain.bitcoin;

import java.math.BigDecimal;
import java.util.List;

public class Transaction {
    private final List<UTXO> inputs;
    private final List<UTXO> outputs;
    private final String privateKey;

    public Transaction(List<UTXO> inputs, List<UTXO> outputs, String privateKey){
        this.inputs = inputs;
        this.outputs = outputs;
        this.privateKey = privateKey;
    }

    List<UTXO> getInputs() {
        return inputs;
    }

    List<UTXO> getOutputs() {
        return outputs;
    }

    String getPrivateKey() {
        return privateKey;
    }

    boolean isTransactionSettleable(List<UTXO> inputs, List<UTXO> outputs){
        return getTotalDenomination(inputs).equals(getTotalDenomination(outputs));
    }

    private BigDecimal getTotalDenomination(List<UTXO> utxos){
        return  utxos.stream().map(UTXO::getDenomination)
                              .reduce(BigDecimal::add)
                              .orElseGet(() -> new BigDecimal(0));
    }
}
