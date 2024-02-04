package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061008 implements FieldDescribe {
    V0("0", "No security concern"),
    V1("1", "Suspected fraud (merchant suspicious—code 10)"),
    V2("2", "ID verified");
    private final String code;
    private final String desc;

    MSC061008(String code, String desc) {
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
