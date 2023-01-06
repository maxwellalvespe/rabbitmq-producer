package com.queue.rabbitmq.api;

import com.queue.rabbitmq.api.dto.VotacaoRequest;
import com.queue.rabbitmq.service.VotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("votar")
@RequiredArgsConstructor
public class RegistrarVenda {

    private final VotoService service;

    @PostMapping
    public ResponseEntity<?> registrar(@RequestBody VotacaoRequest request) {
        service.produce(request);
        return new ResponseEntity<>("Requisição recebida com sucesso", HttpStatus.ACCEPTED);
    }


}
