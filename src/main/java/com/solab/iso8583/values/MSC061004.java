package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061004 implements FieldDescribe {
    V0("0", "Cardholder present"),
    V1("1", "Cardholder not present, unspecified"),
    V2("2", "Cardholder not present (mail/facsimile order)"),
    V3("3", "Cardholder not present (phone or Automated Response Unit [ARU])"),
    V4("4", "Standing order/recurring transactions"),
    V5("5", "Cardholder not present (Electronic order [home PC, Internet, mobile phone, PDA])");
    private final String code;
    private final String desc;

    MSC061004(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

}
