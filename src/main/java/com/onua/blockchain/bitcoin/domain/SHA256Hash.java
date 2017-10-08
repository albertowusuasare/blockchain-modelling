package com.onua.blockchain.bitcoin.domain;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class SHA256Hash implements Hash {

    private static final HashFunction sha256HashFunction = Hashing.sha256();
    private final byte [] rawBytes;
    private final String hashString;
    
    public SHA256Hash(byte [] rawBytes){
        this.rawBytes = rawBytes;
        hashString = calculateHash();
    }
    
    private String calculateHash(){
       return sha256HashFunction.hashBytes(this.rawBytes).toString();
    }
    
    @Override
    public byte[] getRawBytes() {
        return rawBytes;
    }

    @Override
    public String getHashString() {
        return hashString;
    }

}
