package com.solidprinciple.examples.dependencyinversionprinciple;

public class EmailMessageService implements MessageProvider {
    @Override
    public String getMessage() {
        return "Email message: Hello, this is an email!";
    }
}
