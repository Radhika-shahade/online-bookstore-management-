package com.solidprinciple.examples.dependencyinversionprinciple;

public class DIPApplication {
    public static void main(String[] args) {
        // Create instances of low-level modules
        MessageProvider emailProvider = new EmailMessageService();
        MessageProvider smsTextProvider = new SMSTextService();

        // Create instances of the high-level module, injecting different low-level modules
        MessageSender emailSender = new MessageSender(emailProvider);
        MessageSender smsSender = new MessageSender(smsTextProvider);

        // Demonstrate sending messages using different providers
        emailSender.sendMessage();
        smsSender.sendMessage();
    }

}
