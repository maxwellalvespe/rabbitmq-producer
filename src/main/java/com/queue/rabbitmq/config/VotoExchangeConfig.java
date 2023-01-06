package com.queue.rabbitmq.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VotoExchangeConfig {

    public static final String EXCHANGE_NAME = "votacao-exchange";

    //Topico -- Direct
    @Bean
    DirectExchange exchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }
}
