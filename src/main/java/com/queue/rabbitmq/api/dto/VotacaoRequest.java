package com.queue.rabbitmq.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotacaoRequest {
    private Long usuario;
    private Long enquete;
    private String voto;
}
