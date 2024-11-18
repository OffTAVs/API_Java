
-- Tabelas de Turmas
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Estadual Paulo Freire', 2023, 3);
INSERT INTO turma (escola, ano, serie) VALUES ('Colégio Dom Pedro II', 2022, 5);
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Municipal Vinícius de Moraes', 2021, 2);
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Estadual Machado de Assis', 2023, 4);
INSERT INTO turma (escola, ano, serie) VALUES ('Colégio Santa Clara', 2022, 6);
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Municipal Cecília Meireles', 2021, 1);
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Estadual Rui Barbosa', 2023, 5);
INSERT INTO turma (escola, ano, serie) VALUES ('Colégio Nova Esperança', 2022, 8);
INSERT INTO turma (escola, ano, serie) VALUES ('Escola Municipal Jorge Amado', 2021, 7);

-- Tabelas de Professores
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (1, 'Maria Oliveira', '12345678', 'maria.oliveira@escola.edu', 'senha123');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (2, 'Carlos Souza', '87654321', 'carlos.souza@escola.edu', 'senha456');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (3, 'Ana Martins', '11223344', 'ana.martins@escola.edu', 'senha789');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (3, 'Anao Martines', '11243344', 'anao.martines@escola.eca', 'senha79');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (4, 'Fernanda Lima', '55667788', 'fernanda.lima@escola.edu', 'senha321');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (5, 'Ricardo Alves', '99887766', 'ricardo.alves@colegio.edu', 'senha654');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (6, 'Cláudia Silva', '44556677', 'claudia.silva@escola.edu', 'senha987');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (7, 'Guilherme Torres', '33445566', 'guilherme.torres@escola.edu', 'senha111');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (8, 'Patrícia Almeida', '66778899', 'patricia.almeida@colegio.edu', 'senha222');
INSERT INTO professor (id_turma, nome, RG, email, senha) VALUES (9, 'Roberto Dias', '22334455', 'roberto.dias@escola.edu', 'senha333');


-- Tabelas de Alunos
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (1, 'João Silva', 2, '11987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (2, 'Beatriz Santos', 5, '21987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (3, 'Lucas Fernandes', 3, '31987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (4, 'Mariana Costa', 1, '41987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (5, 'Pedro Henrique', 4, '51987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (6, 'Camila Rocha', 6, '61987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (7, 'Sofia Andrade', 0, '71987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (8, 'Gabriel Mendes', 2, '81987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (9, 'Larissa Carvalho', 3, '91987654321');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (7, 'Victor Lima', 1, '71987651234');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (8, 'Luiza Ramos', 4, '81987653421');
INSERT INTO aluno (id_turma, nome, faltas, telefone_contato) VALUES (9, 'Thiago Souza', 0, '91987656789');