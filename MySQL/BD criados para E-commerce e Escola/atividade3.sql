-- Atividade 3
-- Criando o Banco de dados
create database db_escola;
-- aceesando o Banco de dados
use db_escola;

-- criando as Variaveis de Atributos

create table tb_alunos(
id bigint auto_increment,
nome varchar(80) not null,
nota float not null,
idade int(3)  not null,
matricula varchar (10) not null,
tipoEnsino varchar(100) not null,

primary key (id)
);

-- Adicionando Dados de 8 alunos da escola

insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Bia Schnader", 6.5 ,9 ,"8252 ","Ensino Fundamental " );
insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Dean Winchester", 8.7 ,10 ,"8253 ","Ensino Fundamental " );
insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Leticia de Jesus", 5.7 ,16 ,"8254 ","Ensino Medio " );
insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Arnaldo Silva", 9.1 ,17 ,"8255 ","Ensino Medio " );
insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Larissa Castello", 9.5 ,12 ,"8257 ","Ensino Fundamental " );
insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Roberta Nunes", 8.1 ,17 ,"8280 ","Ensino Medio " );
insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Emanuela Pereira", 4.1 ,17 ,"8290 ","Ensino Medio " );
insert into tb_alunos (nome, nota, idade, matricula, tipoEnsino) values ("Beatriz Silva", 7.6 ,16 ,"8295 ","Ensino Medio " );


-- Mostrando notas maiores e menores do que 7

select * from tb_alunos where nota > 7;
select * from tb_alunos where nota < 7;


-- Atulizando um dado na Query
update tb_alunos set idade = 10 where id = 1;
