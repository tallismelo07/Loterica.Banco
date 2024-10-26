# Projeto Loterica  Banco Simples

Este é um projeto básico em Java para simular operações bancárias em um terminal, como consulta de saldo, depósito e transferência. Ele inclui duas versões: uma implementação inicial e uma versão melhorada com encapsulamento em classes separadas.

## Funcionalidades

### Versão Inicial
- Exibe o nome do usuário, o tipo de conta e o saldo inicial.
- Menu com as opções:
  - Consultar saldo
  - Receber valor (depósito)
  - Transferir valor
  - Sair
- Atualiza o saldo conforme as operações.

### Versão Melhorada
- Divisão do código em duas classes:
  - `Banco` (classe principal): inicializa o programa.
  - `Dados`: gerencia o menu e as operações bancárias.
- Captura dos dados de forma mais modular e organizada.

## Estrutura do Projeto
- `Banco.java`: Classe principal que chama os métodos da classe `Dados`.
- `Dados.java`: Classe responsável por capturar os dados do usuário e realizar as operações bancárias.

## Exemplo de Uso
Após iniciar o programa, o usuário será solicitado a informar seu nome, tipo de conta e saldo inicial. Em seguida, o menu de opções será exibido, onde o usuário pode:

- Consultar o saldo atual
- Depositar um valor
- Transferir um valor para outra conta (subtraído do saldo atual)
## Tecnologias Utilizadas
  Java: Linguagem de programação.
  Scanner: Para capturar dados do usuário.
  Locale: Configuração para exibir valores em moeda brasileira.
## Melhorias Futuras
  Adicionar validação de entrada para os valores.
  Implementar operações com diferentes tipos de contas.
  Refatorar o código para adicionar novos tipos de operações.
