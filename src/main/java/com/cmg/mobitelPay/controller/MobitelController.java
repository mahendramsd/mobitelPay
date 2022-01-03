package com.cmg.mobitelPay.controller;

import com.cmg.mobitelPay.dto.ChargeRequestDto;
import com.cmg.mobitelPay.dto.ChargeResponseDto;
import com.cmg.mobitelPay.service.MobitelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("mobitel")
public class MobitelController {

    @Autowired
    private MobitelService mobitelService;

    @PostMapping("charge")
    public ResponseEntity<ChargeResponseDto> chargeFromMSISDN(@RequestBody ChargeRequestDto chargeRequestDto) throws ParseException {
        return ResponseEntity.ok(mobitelService.chargeFromMSISDN(chargeRequestDto));
    }


}
