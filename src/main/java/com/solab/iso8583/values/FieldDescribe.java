package com.solab.iso8583.values;

/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/
public interface FieldDescribe {

    String getCode();

    String getDesc();

    static FieldDescribe cast(Object o) {
        return (FieldDescribe) o;
    }
}
