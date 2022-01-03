package com.cmg.mobitelPay.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChargeResponseDto implements Serializable {

    private String transactionId;
    private String msisdn;
    private String resultDesc;
    private String contentId;
    private Integer resultCode;
}
