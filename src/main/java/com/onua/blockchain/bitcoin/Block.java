package com.onua.blockchain.bitcoin;

import lombok.*;


import java.security.Timestamp;
import java.util.List;

@Value
@Builder
public class Block {
    private String nonce;
    private Timestamp timestamp;
    private Block prevBlock;
    private List<Transaction> transactions;
}
