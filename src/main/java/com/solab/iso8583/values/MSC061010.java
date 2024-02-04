package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061010 implements FieldDescribe {
    V0("0", "Not a CAT transaction"),
    V1("1", "Authorized Level 1 CAT: Automated dispensing machine with PIN"),
    V2("2", "Authorized Level 2 CAT: Self-service terminal"),
    V3("3", "Authorized Level 3 CAT: Limited-amount terminal"),
    V4("4", "Authorized Level 4 CAT: In-flight commerce"),
    V5("5", "Reserved"),
    V6("6", "Authorized Level 6 CAT: Electronic commerce"),
    V7("7", "Authorized Level 7 CAT: Transponder transaction"),
    V8("8", "Mobile Initiated"),
    V9("9", "MPOS Acceptance Device");
    private final String code;
    private final String desc;

    MSC061010(String code, String desc) {
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
