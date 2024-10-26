# Decorator-java2

## Descrição

O projeto **Decorator-java2** é uma implementação do padrão de projeto **Decorator** em Java, que permite adicionar funcionalidades a objetos de forma dinâmica, sem alterar suas classes. Neste projeto, criamos uma estrutura para simular a personalização de bebidas, permitindo que os usuários adicionem ingredientes extras a um café, como leite, açúcar, chocolate e chantilly, cada um com seu respectivo custo.

## Funcionalidades

- **Bebidas Base**: Implementação da interface `Bebida`, que define os métodos `obterDescricao()` e `obterCusto()`.
- **Decoradores**: Classes que estendem `BebidaDecorator`, permitindo adicionar ingredientes como:
  - `LeiteDecorator`: Adiciona leite ao café.
  - `AcucarDecorator`: Adiciona açúcar ao café.
  - `ChocolateDecorator`: Adiciona chocolate ao café.
  - `ChantillyDecorator`: Adiciona chantilly ao café.
- **Cálculo de Custo**: Cada decorador acrescenta um custo específico à bebida base.

## Estrutura do Projeto


## Como Executar

1. Clone o repositório:
   ```bash
   git clone <URL do repositório>
