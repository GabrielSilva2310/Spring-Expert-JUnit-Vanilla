# Java Spring Expert Exercício: JUnit Vanilla


# Sobre o projeto
Este projeto é um exercício do capítulo sobre Testes Automatizados do Curso Java Spring Expert da [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").
O exercício consiste em forkar o seguinte projeto https://github.com/acenelio/exercicio-testes-java e implementar os testes conforme as especificações.


## Especificações e Modelo Conceitual
Um financiamento possui três dados:

●	totalAmont: valor total de dinheiro financiado

●	income: renda mensal do cliente que está financiando

●	months: número de meses do financiamento

E dois métodos:

●	entry: entrada do financiamento, igual a 20% do valor total

●	quota: prestação mensal do financiamento (sem juros)


![Modelo Conceitual](https://github.com/GabrielSilva2310/Assets/blob/main/Images%20Java%20Spring%20Expert/Testes%20Automatizados/Modelo%20Conceitual%20JUnit%20Vanilla%202.png)

Há ainda uma regra: o valor da prestação não pode ser maior que metade da renda mensal do cliente. A seguir alguns exemplos de financiamentos para ajudar a entender a regra:

Exemplo 1: { totalAmount: 100000, income: 2000, months: 20 }

Este exemplo é INVÁLIDO porque com esses dados a entrada seria 20000 e a prestação seria 4000. Porém a prestação não pode passar de 1000, que é a metade da renda do cliente.

Exemplo 2: { totalAmount: 100000, income: 2000, months: 80 }

Já este exemplo é VÁLIDO porque a entrada seria 20000 e a prestação seria 1000. Neste caso, a prestação é menor ou igual a metade da renda do cliente, satisfazendo a regra.

## Testes para validar a classe (Total 10)

Construtor


●	Deve criar o objeto com os dados corretos quando os dados forem válidos

●	Deve lançar IllegalArgumentException quando os dados não forem válidos


setTotalAmount


●	Deve atualizar o valor quando os dados forem válidos

●	Deve lançar IllegalArgumentException quando os dados não forem válidos

setIncome


●	Deve atualizar o valor quando os dados forem válidos

●	Deve lançar IllegalArgumentException quando os dados não forem válidos

setMonths


●	Deve atualizar o valor quando os dados forem válidos

●	Deve lançar IllegalArgumentException quando os dados não forem válidos

entry


●	Deve calcular corretamente o valor da entrada

quota


●	Deve calcular corretamente o valor da prestação


# Tecnologias utilizadas
- Java 17
- JUnit

# Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/GabrielSilva2310/Spring-Expert-JUnit-Vanilla.git
```
Importar Projeto para uma IDE , e executar o JUnit na classe Financing.Test



# Autor

Gabriel Da Silva 

www.linkedin.com/in/gabriel-da-silva-457039193
