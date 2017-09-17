package com.onua.blockchain.bitcoin;


import java.security.Timestamp;

public abstract class BlockValidator {
    private final int NUM_FUTURE_HOURS = 2;

    public boolean isBlockValid(Block block){
        return isPrevBlockValid(block.getPrevBlock()) &&
                isTimeStampValid(block.getTimestamp(), block.getPrevBlock().getTimestamp()) &&
                isProofOfWorkValid(block);
    }

    boolean isTimeStampValid(java.security.Timestamp currentBlockTimeStamp, Timestamp prevBlockTimeStamp){
        throw new RuntimeException("Not yet implemented");
    }

    abstract boolean isPrevBlockValid(Block prevBlock);

    abstract boolean isProofOfWorkValid(Block currentBlock);
}
