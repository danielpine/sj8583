package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061006 implements FieldDescribe {
    V0("0", "Terminal/operator does not have card capture capability"),
    V1("1", "Terminal/operator has card capture capability");
    private final String code;
    private final String desc;

    MSC061006(String code, String desc) {
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
