package com.company;

import java.time.LocalDateTime;

/**
 * Created by aprilross on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, LocalDateTime createdAt, String recipient, String smtpProvider) {
        super(subject, body, createdAt);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        status = "email is sent";
    }


    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification(super.getSubject(), super.getBody(), this.getCreatedAt(), this.getRecipient(),this.getSmtpProvider());
    }

    @Override
    public void printSomeText() {
        super.printSomeText();
        System.out.println("This is your new Hello!");
    }


    @Override
    public void transport() throws NoTransportException {
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getCreatedAt());
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }
}








