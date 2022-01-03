package com.cmg.mobitelPay.service;

import com.cmg.mobitelPay.client.MobitelClient;
import com.cmg.mobitelPay.dto.ChargeRequestDto;
import com.cmg.mobitelPay.dto.ChargeResponseDto;
import com.cmg.mobitelPay.wsdl.ChgResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobitelService {

    private final MobitelClient mobitelClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(MobitelService.class);

    public MobitelService(MobitelClient mobitelClient) {
        this.mobitelClient = mobitelClient;
    }


    /**
     *
     * @param chargeRequestDto
     * @return
     */
    public ChargeResponseDto chargeFromMSISDN(ChargeRequestDto chargeRequestDto) {
        ChgResult chgResult = mobitelClient.chargeFromMSISDN(chargeRequestDto);
        if(chgResult != null) {
            LOGGER.info("ChgResult :  {}" , chgResult.getResultCode());
        }
        return null;
    }
}
