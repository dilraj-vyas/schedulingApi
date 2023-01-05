package com.hackerrank.scheduling.config;

import org.apache.activemq.command.ActiveMQQueue;

import javax.jms.Queue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
public class JmsConfig {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("inmemory.queue");
    }


}
