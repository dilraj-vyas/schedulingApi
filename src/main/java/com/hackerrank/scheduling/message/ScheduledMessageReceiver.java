package com.hackerrank.scheduling.message;

import javax.jms.JMSException;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.hackerrank.scheduling.model.MessageObject;

@Component
public class ScheduledMessageReceiver {

    @JmsListener(destination = "inmemory.queue")
    public void receiveMessage(MessageObject message) throws JMSException {
        if (message.getToAddress().equals("test@example.com")) {
            throw new RuntimeException();
        } else if (message.getToAddress().equals("info@example.com")) {
            System.out.println(message);
        }
    }

}
