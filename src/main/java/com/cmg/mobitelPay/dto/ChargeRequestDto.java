package com.cmg.mobitelPay.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChargeRequestDto implements Serializable {

    private String transactionId;
    private String msisdn;
    private String serviceId;
    private String contentId;
    private Integer amount;
}
