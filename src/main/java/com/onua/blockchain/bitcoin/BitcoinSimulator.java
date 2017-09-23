package com.onua.blockchain.bitcoin;

import com.onua.blockchain.bitcoin.domain.Transaction;
import io.reactivex.Observable;


import java.util.ArrayList;
import java.util.List;


public class BitcoinSimulator {

    public interface MyDummyService{

    }

    public static void main(String args){
        List<Transaction> transactions = getDummyTransactions();
        NewTransactionStore newTransactionStore = new NewTransactionStore();
        Observable.fromIterable(transactions).subscribe(newTransactionStore);
    }

    private static List<Transaction> getDummyTransactions() {
        return new ArrayList<>();
    }
}
