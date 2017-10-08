package com.onua.blockchain.bitcoin.domain;

import io.reactivex.functions.Consumer;

import java.util.List;

public interface Mineable extends Consumer<Transaction> {

    Block createBlock(List<Transaction> unverifiedTransactions);

    boolean validateBlock(Block proposedBlock);

    void sendProposedBlockUpstream(Block minedBlock);
}
