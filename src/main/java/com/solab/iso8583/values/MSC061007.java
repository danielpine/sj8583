package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061007 implements FieldDescribe {
    V0("0", "Normal request (original presentment)"),
    V2("2", "Identity Check Phone Order"),
    V3("3", "ATM Installment Inquiry"),
    V4("4", "Preauthorized request"),
    V5("5", "Time Based Payment Authorization Request—Brazil domestic transactions"),
    V6("6", "ATC Update"),
    V8("8", "Account Status Inquiry Service (ASI)"),
    V9("9", "Tokenization Request/Notification");
    private final String code;
    private final String desc;

    MSC061007(String code, String desc) {
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
