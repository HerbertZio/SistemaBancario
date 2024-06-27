# SistemaBancario

Este projeto é uma simulação de um sistema bancário que utiliza os padrões de design Singleton, Strategy/Repository e Facade para gerenciar contas e operações bancárias.

## Estrutura do Projeto

- **Singleton**: Gerencia a instância do sistema bancário.
- **Strategy/Repository**: Gerencia diferentes tipos de contas bancárias e operações associadas.
- **Facade**: Fornece uma interface simplificada para operações bancárias comuns.

## Executando o Projeto

Para executar o projeto, compile todos os arquivos Java e execute a classe `SistemaBancarioDemo`.

```sh
javac src/**/*.java
java -cp src SistemaBancarioDemo
