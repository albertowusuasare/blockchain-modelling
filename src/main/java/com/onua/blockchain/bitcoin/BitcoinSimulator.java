package com.onua.blockchain.bitcoin;

import retrofit2.Retrofit;

public class BitcoinSimulator {

    public interface MyDummyService{

    }

    public static void main(String args){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("some base url")
                .build();
        MyDummyService myDummyService = retrofit.create(MyDummyService.class);
        System.out.println("Hello worldsss");
    }
}
