package com.solab.iso8583.values;
/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/

/**
 * @author daniel.yang
 * @date 2024/02/02 19:10
 **/
public enum MSC061011 implements FieldDescribe {
    V0("0", "Input capability unknown or unspecified."),
    V1("1", "No terminal used (voice/ARU authorization); server."),
    V2("2", "Terminal supports magnetic stripe input only."),
    V3("3", "Contactless EMV/Chip (Proximity Chip)Terminal supports contactless EMV input and contactless magstripe input. The terminalalso may support one or more other card input types, including EMV contact chip input,magnetic stripe input and key entry input."),
    V4("4", "Contactless Mag Stripe (Proximity Chip)Terminal supports contactless magstripe input but not contactless EMV input. Theterminal also may support one or more other card input types, including EMV contactchip input, magnetic stripe input, and key entry input."),
    V5("5", "Terminal supports EMV contact chip input and magnetic stripe input."),
    V6("6", "Terminal supports key entry input only."),
    V7("7", "Terminal supports magnetic stripe input and key entry input."),
    V8("8", "Terminal supports EMV contact chip input, magnetic stripe input and key entry input."),
    V9("9", "Terminal supports EMV contact chip input only.");
    private final String code;
    private final String desc;

    MSC061011(String code, String desc) {
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
