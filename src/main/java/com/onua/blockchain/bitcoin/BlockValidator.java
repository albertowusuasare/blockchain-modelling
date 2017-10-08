package com.onua.blockchain.bitcoin;


import com.onua.blockchain.bitcoin.domain.Block;
import com.onua.blockchain.bitcoin.domain.Hash;

import java.security.Timestamp;

public abstract class BlockValidator {
    private final int NUM_FUTURE_HOURS = 2;

    public boolean isProposedBlockValid(Block proposedBlock, Ledger currentLedgerState){
        return isPrevBlockValid(proposedBlock.getPrevBlockHash(), currentLedgerState) &&
                isTimestampValid(proposedBlock.getTimestamp(), currentLedgerState) &&
                isProofOfWorkValid(proposedBlock);
    }

    abstract boolean isTimestampValid(Timestamp currentBlockTimeStamp, Ledger currentLedgerState);

    abstract boolean isPrevBlockValid(Hash prevBlockHash, Ledger currentLedgerState);

    abstract boolean isProofOfWorkValid(Block block);
}
