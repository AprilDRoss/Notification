package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmailNotification myEmail = new EmailNotification("Call me", "Please call me. I want to talk.", LocalDateTime.now(),"BestFriend","Gmail");
        TextNotification myText = new TextNotification("Text back","Hit me up", LocalDateTime.now(), "Bae","Verizon");

        myEmail.transport();
        myText.transport();
        myText.printSomeText();
        myEmail.printSomeText();




    }
}
