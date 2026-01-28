# Projeto Escola utilizando DAO - Java + JDBC

Este projeto foi desenvolvido para demonstrar na prática como funciona a **arquitetura em camadas** utilizando **Java** e **MySQL**, aplicando o padrão **DAO( Data Access Object )**.

O sistema permite cadastrar alunos e listar alunos armazenando em um banco de dados.

---
## objetivos do Projeto

- Separar responsabilidades no código
- Demonstrar a comunicação entre Java e Banco de Dados
- Aplicar boas práticas como:
- DAO
- Model
- Factory de conexão
- Evitar SQL Injector
- Facilitar a manuntenção e evolução do sistema
  
  ---

  ## Estrutura do Projeto

  <img width="283" height="246" alt="image" src="https://github.com/user-attachments/assets/3e839df0-feb9-4b9b-abea-924224144ae6" />

---

## Descrição das camadas 💻

- Main (app)
  
   Responsável por:

   Interagir com o usuário via console

   Receber dados

   Chamar o DAO para salvar e listar alunos

   Não contém SQL, apenas regras de fluxo de aplicação

   - Aluno (model)

     Representa a tabela alunos do banco de dados.

     Contém:

     Atrtibutos (id, nome)

     Construtores

     Getters e Setters

     - AlunoDAO (dao)

     ## Responsável por:

      Executar comandos SQL

      Fazer operações CRUD

      Converter dados do banco em objetos Java

     ## Métodos:

      cadastrar(Aluno aluno)

      listar()

      - Centraliza toda a lógica de acesso ao banco.

      - ConnectionFactory (config)

   ## Responsável por:

     Criar e fornecer conexões com o banco de dados

     Centralizar URL, usuário e senha

     - Facilita manutenção e evita repetição de código.

    ## Importância do Padrão DAO

     O padrão DAO (Data Access Object) é importante porque:

     Separa regras de negócio do acesso ao banco

     Facilita testes

     Permite trocar o banco sem alterar o restante do sistema

     Torna o código mais organizado e profissional

     É amplamente usado no mercado de trabalho

