package com.onua.blockchain.bitcoin;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ledger {
    private Set<UTXO> currentUTXOs;

    public Ledger(){
        currentUTXOs = new HashSet<>();
    }

    public void updateLedger(Transaction transaction) throws Exception{
        if (!isTransactionValid(transaction)){
            throw new Exception("Transaction not valid");
        }
        updateCurrentState(transaction.getInputs(), transaction.getOutputs());
    }

    private boolean isTransactionValid(Transaction transaction){
        return isInputValid(transaction.getInputs(), transaction.getPrivateKey()) &&
                isTransactionSettleable(transaction.getInputs(), transaction.getOutputs());
    }

    private boolean isInputValid(List<UTXO> inputs, String privateKey){
        for (UTXO input: inputs){
            if(!(currentUTXOs.contains(input) && doesSignatureMatchOwner(input.getOwnerPublicKey(), privateKey))){
                return false;
            }
        }
        return true;
    }

    private boolean isTransactionSettleable(List<UTXO> inputs, List<UTXO> outputs){
        BigDecimal totalInputDenomination = getTotalDenomination(inputs);
        BigDecimal totalOutputDenomination= getTotalDenomination(outputs);
        return totalInputDenomination.equals(totalOutputDenomination);
    }

    private BigDecimal getTotalDenomination(List<UTXO> utxos){
       return  utxos.stream().map(UTXO::getDenomination)
                             .reduce(BigDecimal::add)
                             .orElseGet(() -> new BigDecimal(0));
    }

    private void updateCurrentState(List<UTXO> inputs, List<UTXO> outputes){
        throw new RuntimeException("Not yet implemented");
    }

    private boolean doesSignatureMatchOwner(String publicKey, String privateKey){
        return true;
    }
}
