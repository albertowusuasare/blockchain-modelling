package com.onua.blockchain.bitcoin;

import com.onua.blockchain.bitcoin.domain.Transaction;
import com.onua.blockchain.bitcoin.domain.UTXO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Ledger {
    private Set<UTXO> currentUTXOs;

    public Ledger(){
        currentUTXOs = new HashSet<>();
    }

    public void updateLedger(Transaction transaction) throws Exception{
        if (isTransactionValid(transaction)){
            throw new Exception("Transaction not valid");
        }
        updateCurrentState(transaction.getInputs(), transaction.getOutputs());
    }

    private boolean isTransactionValid(Transaction transaction){
        return isInputValid(transaction.getInputs(), transaction.getPrivateKey()) &&
                transaction.isTransactionSettleable(transaction.getInputs(), transaction.getOutputs());
    }

    private boolean isInputValid(List<UTXO> inputs, String privateKey){
        return inputs.stream().allMatch((input) -> currentUTXOs.contains(input) && input.isOwnerValid(privateKey)) ;
    }

    private void updateCurrentState(List<UTXO> inputs, List<UTXO> outputes){
        throw new RuntimeException("Not yet implemented");
    }

}
