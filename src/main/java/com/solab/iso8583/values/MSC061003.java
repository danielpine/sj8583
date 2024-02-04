package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061003 implements FieldDescribe {
    V0("0", "On premises of card acceptor facility"),
    V1("1", "Off premises of card acceptor facility (merchant terminal—remote location)"),
    V2("2", "Off premises of card acceptor facility (cardholder terminal including home PC, mobilephone, PDA)"),
    V3("3", "No terminal used (voice/ARU authorization); server"),
    V4("4", "On premises of card acceptor facility (cardholder terminal including home PC, mobilephone, PDA)");
    private final String code;
    private final String desc;

    MSC061003(String code, String desc) {
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
