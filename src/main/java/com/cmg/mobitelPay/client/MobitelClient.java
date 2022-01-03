package com.cmg.mobitelPay.client;

import com.cmg.mobitelPay.dto.ChargeRequestDto;
import com.cmg.mobitelPay.wsdl.ChgRequest;
import com.cmg.mobitelPay.wsdl.ChgResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class MobitelClient extends WebServiceGatewaySupport {


    private static final Logger LOGGER = LoggerFactory.getLogger(MobitelClient.class);

    public ChgResult chargeFromMSISDN(ChargeRequestDto chargeRequestDto) {

        ChgRequest request = new ChgRequest();
        request.setMsisdn(chargeRequestDto.getMsisdn());
        request.setAmt(chargeRequestDto.getAmount());
        request.setServiceId(chargeRequestDto.getServiceId());
        request.setContentId(chargeRequestDto.getContentId());
        request.setTransactionId(chargeRequestDto.getTransactionId());

        LOGGER.info("Requesting chargeFromMSISDN for {} Amount : {}" + request.getMsisdn(), request.getAmt());
        ChgResult response = null;
        try {
            response = (ChgResult) getWebServiceTemplate()
                    .marshalSendAndReceive("https://mcg.mobitel.lk/M_CGW/MCAccMngr", request,
                            new SoapActionCallback(
                                    "https://mcg.mobitel.lk/M_CGW/MCAccMngr/chargeFromMSISDN"));
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

        return response;
    }

}
