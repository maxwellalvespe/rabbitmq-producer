### producer

- O objetivo desse repositorio e disponibilizar um endpoint que irá obter os seguintes atributos:
 idDoUsuario , idDoTopico e o voto 'SIM OU NÃO' relacionado a enquete em aberto e direcionar esses
dados para uma fila que será consumida pelo de votação para registrar os votos na base de dados e 
poder gerar o resultado da enquete,auditar as requisições e poder adicionar novos recursos.

obs: o obtivo de utilizar o rabbitmq nesse projeto é porque ele opera de forma assíncrona e precisava montar uma solução que pode 
obter 1 a 1000 votos em um curto espaço de tempo sem bloquear as chamadas.


Utilizei o docker-compose para subir o ambiente local e poder jogar toda a solução dentro de um docker-file e simular um cluster utilizando o Kind.



- Referencias:

https://docs.docker.com/engine/reference/builder/
https://www.rabbitmq.com/tutorials/amqp-concepts.html
https://kind.sigs.k8s.io/docs/user/quick-start/

- conceito
https://learn.microsoft.com/pt-br/azure/developer/java/sdk/async-programming


