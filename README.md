# Criando um Banco Digital com Java e Orientação a Objetos

Cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

Desenvolver uma solução Orientada a Objetos em Java para o cenário acima utilizando os quatro pilares: Abstração, Encapsulamento, Herança e Polimorfismo.

## Alterações no código base

Foi utilizado o código base disponível neste [link](https://github.com/falvojr/lab-banco-digital-oo).

1. Na classe Cliente foram criados mais dois atributos: CPF e telefone.
2. Na classe Main foi criada uma lista de contas para permitir a impressão dos dados de todos os clientes do Banco através do método imprimirDadosClientesEContas().
3. Desta forma a classe Banco torna-se desnecessária, já que estamos trabalhando apenas com um banco.
