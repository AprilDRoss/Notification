package com.company;

import java.time.LocalDateTime;

/**
 * Created by aprilross on 7/19/17.
 */
public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, LocalDateTime createdAt, String recipient, String smsProvider) {
        super(subject, body, createdAt);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printSomeText();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getCreatedAt());
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
    }
}











