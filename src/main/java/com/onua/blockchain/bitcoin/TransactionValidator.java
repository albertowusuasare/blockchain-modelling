package com.onua.blockchain.bitcoin;

import com.onua.blockchain.bitcoin.domain.Transaction;

@FunctionalInterface
public interface TransactionValidator {

    boolean isTransactionValid(Transaction transaction);
}
