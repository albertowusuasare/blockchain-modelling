package com.onua.blockchain.bitcoin.domain;

import io.reactivex.functions.Consumer;

public interface Mineable extends Consumer<Transaction> {
    Block createBlock();
    void updateLedger(Block block);
}
