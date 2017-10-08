package com.onua.blockchain.bitcoin.domain;

import com.onua.blockchain.bitcoin.BlockValidator;
import com.onua.blockchain.bitcoin.Ledger;
import com.onua.blockchain.bitcoin.TransactionValidator;

import java.util.List;

public class MinerNode extends Node implements Mineable {

    private final BlockValidator blockValidator;
    private MinerCredentials minerCredentials;


    public MinerNode(MinerCredentials minerCredentials, BlockValidator blockValidator, Ledger currentLedgerState){
        super(currentLedgerState);
        this.blockValidator = blockValidator;
    }

    @Override
    public Block createBlock(List<Transaction> unverifiedTransactions) {
        return null;
    }

    @Override
    public boolean validateBlock(Block proposedBlock) {
        boolean isBlockValid =  blockValidator.isProposedBlockValid(proposedBlock, this.currentLedgerState);

        if (isBlockValid) {
            updateLedgerState(proposedBlock);
        }

        return isBlockValid;
    }

    @Override
    public void sendProposedBlockUpstream(Block minedBlock) {
        throw new RuntimeException("Not yet implemented");
    }

    @Override
    public void accept(Transaction transaction) throws Exception {
        System.out.println("Notified Miner of new transaction");
    }

}
