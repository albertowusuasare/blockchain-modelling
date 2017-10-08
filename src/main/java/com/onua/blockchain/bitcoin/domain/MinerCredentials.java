package com.onua.blockchain.bitcoin.domain;

import lombok.Builder;
import lombok.Value;

import java.time.ZonedDateTime;

@Value
@Builder
public class MinerCredentials {
    private String name;
    private String minerId;
    private ZonedDateTime registeredDate;
    private String btcAddress;
}
