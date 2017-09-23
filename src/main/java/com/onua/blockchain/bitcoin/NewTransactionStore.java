package com.onua.blockchain.bitcoin;

import com.onua.blockchain.bitcoin.domain.Transaction;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.ArrayList;
import java.util.List;

public class NewTransactionStore implements Observer<Transaction> {
    private List<Transaction> newTransactions;
    private Observable<Transaction> newTransactionsStreamer;

    NewTransactionStore(){
        newTransactions = new ArrayList<>();
        newTransactionsStreamer = Observable.fromIterable(this.newTransactions);
    }

    public List<Transaction> getnewTransactions() {
        return newTransactions;
    }

    public void addTransactionObserver(List<Observer<? super Transaction>> observers){
        observers.forEach(this::addTransactionObserver);
    }

    private void addTransactionObserver(Observer<? super Transaction> observer){
        this.newTransactionsStreamer.subscribe(observer);
    }

    @Override
    public void onSubscribe(Disposable d) {
        if (this.newTransactions == null){
            d.dispose();
        }
    }

    @Override
    public void onNext(Transaction transaction) {
        this.newTransactions.add(transaction);
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("An error occurred");
    }

    @Override
    public void onComplete() {
        System.out.println("Unvalidated Transactions observation complete");
    }

}
