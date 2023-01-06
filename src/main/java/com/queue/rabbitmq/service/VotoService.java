package com.queue.rabbitmq.service;

import com.queue.rabbitmq.api.RegistrarVenda;
import com.queue.rabbitmq.api.dto.VotacaoRequest;
import com.queue.rabbitmq.producer.VotoProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VotoService {

    private final VotoProducer producer;

    public void produce(VotacaoRequest request) {

        producer.votar(request);
    }
}
