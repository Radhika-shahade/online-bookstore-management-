package com.solidprinciple.examples.dependencyinversionprinciple;

public class SMSTextService implements MessageProvider {
    @Override
    public String getMessage() {
        return "SMS message: Hi, this is a text message!";
    }
}
