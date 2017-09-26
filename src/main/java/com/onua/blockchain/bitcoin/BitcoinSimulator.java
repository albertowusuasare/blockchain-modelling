package com.onua.blockchain.bitcoin;

import com.onua.blockchain.bitcoin.domain.Transaction;
import io.reactivex.Observable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;


public class BitcoinSimulator {
    private static final Logger logger = LogManager.getLogger(BitcoinSimulator.class);

    public interface MyDummyService{

    }

    public static void main(String [] args){
        logger.info("Starting simulator");
        List<Transaction> transactions = getDummyTransactions();
        NewTransactionStore newTransactionStore = new NewTransactionStore();
        Observable.fromIterable(transactions).subscribe(newTransactionStore);
    }

    private static List<Transaction> getDummyTransactions() {
        return new ArrayList<>();
    }
}
