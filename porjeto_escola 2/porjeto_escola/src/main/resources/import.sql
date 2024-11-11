
-- Tabelas de Turmas
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Estadual Paulo Freire', 2023, 3);
INSERT INTO turma (escola, ano, serie) VALUES ('Colégio Dom Pedro II', 2022, 5);
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Municipal Vinícius de Moraes', 2021, 2);

-- Tabelas de Professores
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (1, 'Maria Oliveira', '12345678', 'maria.oliveira@escola.edu', 'senha123');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (2, 'Carlos Souza', '87654321', 'carlos.souza@escola.edu', 'senha456');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (3, 'Ana Martins', '11223344', 'ana.martins@escola.edu', 'senha789');

-- Tabelas de Alunos
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (1, 'João Silva', 2, '11987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (2, 'Beatriz Santos', 5, '21987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (3, 'Lucas Fernandes', 3, '31987654321');
