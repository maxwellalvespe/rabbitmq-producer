package com.queue.rabbitmq.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class VotoRabbitConfig {

    private final DirectExchange directExchange;

    public static final String ROUTING_KEY_NAME = "votacao.effect";
    public static final String QUEUE_NAME = "votos.queue";

    @Bean
    Queue queue() {
        return QueueBuilder.durable(QUEUE_NAME).build();
    }

    @Bean
    Binding binding() {
        return BindingBuilder.bind(queue())
                .to(directExchange)
                .with(ROUTING_KEY_NAME);
    }
}
