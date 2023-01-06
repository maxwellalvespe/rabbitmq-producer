package com.queue.rabbitmq.producer;

import com.queue.rabbitmq.api.RegistrarVenda;
import com.queue.rabbitmq.api.dto.VotacaoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import static com.queue.rabbitmq.config.VotoExchangeConfig.EXCHANGE_NAME;
import static com.queue.rabbitmq.config.VotoRabbitConfig.ROUTING_KEY_NAME;

@Component
@RequiredArgsConstructor
public class VotoProducer {

    private final RabbitTemplate template;

    public void votar(VotacaoRequest voto){
        template.convertAndSend(EXCHANGE_NAME,ROUTING_KEY_NAME,voto);
    }
}
