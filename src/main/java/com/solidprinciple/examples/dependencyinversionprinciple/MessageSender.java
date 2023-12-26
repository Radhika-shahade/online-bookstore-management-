package com.solidprinciple.examples.dependencyinversionprinciple;

public class MessageSender {
    private MessageProvider messageProvider;

    // Constructor injection of MessageProvider
    public MessageSender(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void sendMessage() {
        String message = messageProvider.getMessage();
        System.out.println("Sending message: " + message);
    }
}
