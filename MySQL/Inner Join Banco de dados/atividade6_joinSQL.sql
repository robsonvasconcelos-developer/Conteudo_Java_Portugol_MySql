-- Atividade 6

create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

-- criando as Variaveis de Atributos - TABELA 1 
create table tb_categoria( 
id bigint auto_increment,
tipoCurso varchar (60) not NULL,
cupomDesconto boolean not NULL,
parcelamentoSemJuros boolean not NULL,
primary key (id)
);

-- Criar Tabela 2 
  create table tb_produto( 
  id bigint auto_increment,  -- Definindo como auto Incremente 1, 2, 3 ...
  nome varchar(120) not NULL,
  tempo varchar(60) not NULL,
  preco float (10) not NULL,
  semRequesitoMinimo boolean not NULL,
  avancado boolean not NULL,
  categoria_id  bigint not NULL,
  

  PRIMARY KEY (id), 
  FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id) 
);

insert into tb_categoria (tipoCurso,cupomDesconto,parcelamentoSemJuros) values ("Desenvolvedor Web Java",false,true);
insert into tb_categoria (tipoCurso,cupomDesconto,parcelamentoSemJuros) values ("Tecnologia e outras lioguagens",false,true);
insert into tb_categoria (tipoCurso,cupomDesconto,parcelamentoSemJuros) values ("Jornalismo",true,true);
insert into tb_categoria (tipoCurso,cupomDesconto,parcelamentoSemJuros) values ("Administracao",true,true);
insert into tb_categoria (tipoCurso,cupomDesconto,parcelamentoSemJuros) values ("Marketing",true,true);
insert into tb_categoria (tipoCurso,cupomDesconto,parcelamentoSemJuros) values ("UX UI",true,true);

insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Desenvolvedor Java - HTML,CSS, SPRING, MySql, CSS, PHP, JavaScript ","1200 horas" , 3000, true, true, 1 );
insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Desenvolvedor C#","300 horas" , 2000, true, true, 2 );
insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Desenvolvedor Python","350 horas" , 3000, true, true, 2 );
insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Desenvolvedor C++","200 horas" , 1900, false, true, 2 );
insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Redes","368 horas" , 1500, true, true, 2 );

insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Radio e TV","210 horas" , 2000, true , false, 3 );
insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Gestao de Contabilidade","500 horas" , 2000, false, true, 4 );
insert into tb_produto (nome ,tempo ,preco ,semRequesitoMinimo ,avancado , categoria_id ) values ("Marketing Digital","60 horas" , 100, true, false, 5 );

-- select * from tb_categoria;
select * from tb_produto where tb_produto.preco > 50.00;
select * from tb_produto where tb_produto.preco between 3.00 and 60.00;
select * from tb_produto where tb_produto.nome like "%J%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select nome ,tb_categoria.tipoCurso, tb_categoria.parcelamentoSemJuros from tb_produto right join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.tipoCurso = "Java";


