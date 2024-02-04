package com.solab.iso8583;

import com.solab.iso8583.codecs.CompositeField;
import com.solab.iso8583.parse.ConfigParser;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.List;


/*
    Copyright (c) Powerup Technology Inc. All rights reserved.
*/
public class MessageFactoryTest {


    class CustomerFieldValue {
        private Object value;
        private String desc;
    }

    @Test
    public void parseMessage() throws IOException, ParseException {
        MessageFactory messageFactory = ConfigParser.createFromClasspathConfig("j8583-templates-request.xml");
        messageFactory.setCharacterEncoding("UTF-8");
        messageFactory.setForceStringEncoding(true);
        IsoValue isoValue = messageFactory.parseField(
                Integer.parseInt("0100", 16),
                61,
                "2025100006600484     05348".getBytes(StandardCharsets.UTF_8),
                0
        );
        beautifulIsoValue(isoValue);
    }

    private void beautifulIsoValue(IsoValue isoValue) {
        if (isoValue.getValue() instanceof CompositeField) {
            CompositeField value = (CompositeField) isoValue.getValue();
            List<IsoValue> values = value.getValues();
            for (int i = 0; i < values.size(); i++) {
                IsoValue v = values.get(i);
                System.out.printf("F%-3s %20s : %s%n", i + 1, v.getValue(), v.getDescribe() != null ? v.getDescribe().getDesc() : "");
            }
        }
    }
}