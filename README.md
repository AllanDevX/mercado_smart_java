# 🛒 Sistema de Mercearia em Java

Projeto de uma aplicação de console desenvolvida em Java para simular operações básicas de uma mercearia, como consulta de produtos, cálculo de compras, aplicação de descontos e gerenciamento de estoque.

O projeto foi desenvolvido como parte da minha jornada de aprendizado em programação, com foco na prática dos fundamentos da linguagem Java.

## 🎯 Objetivo

Aplicar conceitos fundamentais de programação por meio da construção de um sistema que trabalha com produtos, preços, quantidades, cálculos e controle de inventário.

## ⚙️ Funcionalidades implementadas

- **Cadastro pré-definido de produtos:** armazenamento dos nomes dos produtos em arrays.
- **Consulta de preços:** associação entre produtos e seus respectivos preços.
- **Busca de produtos:** localização de itens por meio de um método de busca.
- **Cálculo de compras:** cálculo do subtotal com base no preço e na quantidade escolhida.
- **Acumulação do valor total:** soma dos valores dos itens da compra.
- **Aplicação de desconto:** desconto de 10% para compras com valor igual ou superior a R$ 100,00.
- **Gerenciamento de estoque:** verificação da quantidade disponível e atualização do inventário após uma compra aceita.
- **Tratamento de situações inválidas:** mensagens para produtos não encontrados e estoque insuficiente.
- **Filtragem de produtos por preço:** método para retornar produtos abaixo de um limite de preço.
- **Cálculo de média de preços:** método para calcular a média dos preços cadastrados.

## 🧰 Tecnologias e ferramentas

- **Java 25**
- **Visual Studio Code**
- **Git**
- **GitHub**

## 📚 Conceitos praticados

Durante o desenvolvimento, pratiquei:

- Declaração e manipulação de variáveis.
- Arrays e acesso por índices.
- Estruturas condicionais (`if`, `else`).
- Estruturas de repetição (`for`, `while`).
- Métodos com parâmetros e valores de retorno.
- Tipos de retorno como `int`, `float`, `boolean` e `String[]`.
- Manipulação de dados e cálculos aritméticos.
- Organização e versionamento de código com Git e GitHub.

## 🛍️ Produtos cadastrados

O sistema utiliza uma lista inicial de dez produtos:

| Produto | Preço inicial |
|---|---:|
| Tomate | R$ 2,99 |
| Cebola | R$ 3,99 |
| Mamão | R$ 4,59 |
| Arroz | R$ 5,48 |
| Azeite | R$ 11,89 |
| Cuscuz | R$ 2,99 |
| Pimentão | R$ 1,89 |
| Feijão | R$ 5,48 |
| Macarrão | R$ 3,99 |
| Farofa | R$ 5,99 |

Os preços são valores definidos inicialmente no código e podem ser alterados pelo desenvolvedor.

## ▶️ Como executar

1. Instale o JDK compatível com o projeto.
2. Clone este repositório:

   ```bash
   git clone https://github.com/AllanDevX/projeto_final_mercearia_java.git
   ```

3. Entre na pasta do projeto:

   ```bash
   cd projeto_final_mercearia_java
   ```

4. Compile o arquivo Java:

   ```bash
   javac Main.java
   ```

5. Execute a aplicação:

   ```bash
   java Main
   ```

> **Observação:** o fluxo de execução e os comandos de interação serão revisados para garantir que a versão final funcione conforme esperado.

## 🚧 Próximas melhorias

- Revisar e corrigir o fluxo de entrada e encerramento do programa.
- Validar quantidades inválidas ou negativas.
- Aprimorar o tratamento de entradas do usuário.
- Melhorar a organização e a legibilidade do código.
- Executar testes para os cenários de compra, desconto e estoque.

## 👨‍💻 Autor

Desenvolvido por **Allan Richard**, estudante de Ciência da Computação, como parte da minha jornada de aprendizado em Java e desenvolvimento de software.

🔗 **GitHub:** [AllanDevX](https://github.com/AllanDevX)

---

*Projeto educacional desenvolvido para praticar os fundamentos da programação em Java.*