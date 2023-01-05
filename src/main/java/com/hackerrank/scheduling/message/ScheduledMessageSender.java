package com.hackerrank.scheduling.message;

import javax.jms.JMSException;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hackerrank.scheduling.model.MessageObject;

@Component
public class ScheduledMessageSender {

    @Autowired
    private Queue queue;

    @Autowired
    JmsTemplate jmsTemplate;

    @Scheduled(fixedRate = 5000)
    public void sendingInfoMessage() throws JMSException {
        MessageObject messageObject = new MessageObject("info@example.com", "info");
        jmsTemplate.convertAndSend(queue, messageObject);
    }

    @Scheduled(fixedRate = 8000)
    public void sendingTestMessage() throws JMSException {
        MessageObject messageObject = new MessageObject("test@example.com", "test");
        jmsTemplate.convertAndSend(queue, messageObject);
    }
}
