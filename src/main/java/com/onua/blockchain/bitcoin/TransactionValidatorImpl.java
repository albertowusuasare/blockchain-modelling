package com.onua.blockchain.bitcoin;

import com.onua.blockchain.bitcoin.domain.Transaction;
import com.onua.blockchain.bitcoin.domain.UTXO;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class TransactionValidatorImpl implements TransactionValidator{

    public boolean isTransactionValid(Transaction transaction){

       throw new RuntimeException("not yet implemented");
    }

    private boolean verifyOwnerSignature(List<UTXO> inputs){
       return  inputs.stream().reduce(false, new BiFunction<Boolean, UTXO, Boolean>() {
            @Override
            public Boolean apply(Boolean aBoolean, UTXO utxo) {
                return null;
            }
        }, new BinaryOperator<Boolean>() {
            @Override
            public Boolean apply(Boolean aBoolean, Boolean aBoolean2) {
                return null;
            }
        });
    }
}
