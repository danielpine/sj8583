package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061001 implements FieldDescribe {
    Attended_Terminal("0", "Attended Terminal"),
    Unattended_Terminal("1", "Unattended terminal (cardholder-activated terminal [CAT], home PC, mobile phone,PDA)"),
    No_Terminal_Used("2", "No terminal used (voice/audio response unit [ARU] authorization); server");
    private final String code;
    private final String desc;

    MSC061001(String code, String desc) {
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
