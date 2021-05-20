-- Atividade 1
-- Criando o Banco de dados
create database db_rh;
-- aceesando o Banco de dados
use db_rh;

-- criando as Variaveis de Atributos
create table tb_funcionarios(
id bigint auto_increment,
nome varchar(80) not null,
salario float not null,
idade int(3)  not null,
matricula varchar (10) not null,
setor varchar(100) not null,

primary key (id)
);

-- Adicionando Dados na Tabela de funcionarios do RH

insert into tb_funcionarios (nome, salario, idade, matricula, setor) values ("Bia Schnader", 2.500 ,21 ,"55687 ","Desenvolvedora WEB Jr " );
insert into tb_funcionarios (nome, salario, idade, matricula, setor) values ("Dean Winchester", 6.000 ,30 ,"55757 ","Desenvolvedor IA " );
insert into tb_funcionarios (nome, salario, idade, matricula, setor) values ("Leticia de Jesus", 4.000 ,25 ,"55887 ","Scrum Master " );
insert into tb_funcionarios (nome, salario, idade, matricula, setor) values ("Arnaldo Silva", 1.900 ,19 ,"55987 ","Consultor de excel " );
insert into tb_funcionarios (nome, salario, idade, matricula, setor) values ("Larissa Castello", 1.600 ,18 ,"55599 ","Estagiaria de TI " );

-- Mostrando salarios maiores e menores do que 2.000

select * from tb_funcionarios where salario < 2.000;
select * from tb_funcionarios where salario > 2.000;

update tb_funcionarios set matricula = 55900 where id = 3