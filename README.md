# API_Java

# 📘 API Java – Diário de Classe

Esta é uma API RESTful desenvolvida em Java com o objetivo de gerenciar dados de **alunos**, **professores** e **turmas** de um diário de classe. O projeto utiliza banco de dados relacional e segue boas práticas de estruturação em camadas (controller, service, repository).

## 🚀 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Maven  
- Banco de Dados H2 (em memória)  
- Swagger UI (para documentação e testes)  

## 📂 Estrutura do Projeto
src/
├── controller        # Define os endpoints da API
├── model             # Entidades JPA (Aluno, Professor, Turma)
├── repository        # Interfaces para acesso ao banco
├── service           # Regras de negócio
└── Application.java  # Classe principal


## 📌 Funcionalidades

- ✅ Cadastro, listagem, atualização e remoção de **alunos**
- ✅ Cadastro, listagem, atualização e remoção de **professores**
- ✅ Cadastro, listagem, atualização e remoção de **turmas**
- ✅ Relacionamento entre turmas e professores/alunos
