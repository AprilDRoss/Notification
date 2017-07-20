package com.company; /**
 * Created by aprilross on 7/19/17.
 */


import com.company.NoTransportException;

import java.time.LocalDateTime;


public class Notification extends RuntimeException {

    protected LocalDateTime createdAt;
    protected String subject;
    protected String body;
    protected String status;

    public Notification(String subject, String body, LocalDateTime createdAt) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "sent";
    }


    public String getSubject() {

        return subject;
    }

    public String getBody() {

        return body;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    public String getStatus() {
        return status;
    }
    public void showStatus(){
        System.out.println(this.status);
    }

    protected void printSomeText(){
        System.out.println("Hello!");
    }

    public void transport() throws NoTransportException{

    }

}

