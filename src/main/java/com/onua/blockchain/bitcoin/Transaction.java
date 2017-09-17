package com.onua.blockchain.bitcoin;

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

    public List<UTXO> getInputs() {
        return inputs;
    }

    public List<UTXO> getOutputs() {
        return outputs;
    }

    public String getPrivateKey() {
        return privateKey;
    }
}
