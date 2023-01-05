package com.hackerrank.scheduling.web;


import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.scheduling.model.MessageObject;

@RestController
public class ScheduleController {

    @Autowired
    private Queue queue;

    @Autowired
    JmsTemplate jmsTemplate;

    @PostMapping("/push")
    public ResponseEntity<String> pushMsg(@RequestBody MessageObject messageObject) {
        jmsTemplate.convertAndSend(queue, messageObject);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


}
