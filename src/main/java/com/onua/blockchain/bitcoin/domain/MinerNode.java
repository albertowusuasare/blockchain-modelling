package com.onua.blockchain.bitcoin.domain;

public class MinerNode extends Node implements Mineable {

    @Override
    public Block createBlock() {
        return null;
    }

    @Override
    public void updateLedger(Block block) {

    }

    @Override
    public void accept(Transaction transaction) throws Exception {
        System.out.println("Notified Miner of new transaction");
    }
}
