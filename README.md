# Conversor de Moedas

Projeto em Java para converter entre diferentes moedas usando a API do ExchangeRate-API.

## Descrição

Este projeto implementa um conversor de moedas que permite ao usuário escolher entre várias opções de conversão, como dólar para peso argentino, 
real brasileiro, peso colombiano, entre outras. Utiliza a API do ExchangeRate-API para obter as taxas de câmbio atualizadas.

## Funcionalidades

- Conversão entre diferentes moedas:
  - Dólar (USD) => Peso argentino (ARS)
  - Peso argentino (ARS) => Dólar (USD)
  - Dólar (USD) => Real brasileiro (BRL)
  - Real brasileiro (BRL) => Dólar (USD)
  - Dólar (USD) => Peso colombiano (COP)
  - Peso colombiano (COP) => Dólar (USD)

## Pré-requisitos

Para executar o projeto localmente, é necessário ter instalado:
- Java Development Kit (JDK) 8 ou superior
- Gson (biblioteca para parsing JSON)

## Como Executar

1. Clone o repositório para sua máquina local:

   ```bash
   git clone https://github.com/MatthsDev/Conversor_de_Moeda.git

2. Navegue até o diretório do projeto:

   ```bash
   cd conversor-de-moedas
   
3. Compile o projeto:

   ```bash
   javac -cp "src;lib/gson-2.10.1.jar" src/br/com/conversorMoedas/main/Main.java -d out/production/Conversor_de_Moedas

4. Execute o programa:

   ```bash
   java -cp "out/production/Conversor_de_Moedas;lib/gson-2.10.1.jar" br.com.conversorMoedas.main.Main




