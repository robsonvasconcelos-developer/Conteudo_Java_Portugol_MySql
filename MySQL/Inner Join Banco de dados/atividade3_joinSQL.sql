-- Atividade 3

create database db_farmacia_do_bem;

use db_farmacia_do_bem;

-- criando as Variaveis de Atributos - TABELA 1 
create table tb_categoria( -- Categoria das Pizzas
id bigint auto_increment,
descricao varchar (60) not NULL,
cupomOff boolean not NULL,
generico boolean not NULL,
primary key (id)
);

-- Criar Tabela 2 
  create table tb_produto( 
  id bigint auto_increment,  -- Definindo como auto Incremente 1, 2, 3 ...
  nome varchar(100) not NULL,
  marca varchar(80) not NULL,
  preco float (10) not NULL,
  delivery boolean not NULL,
  sacola boolean not NULL,
  categoria_id  bigint not NULL,
  

  PRIMARY KEY (id), 
  FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id) 
);

insert into tb_categoria (descricao,cupomOff,generico) values ("Contra queda de cabelo",false,false);
insert into tb_categoria (descricao,cupomOff,generico) values ("Dores",true,false);
insert into tb_categoria (descricao,cupomOff,generico) values ("Spray Nasal Sinusite",false,false);
insert into tb_categoria (descricao,cupomOff,generico) values ("antitranspirante",true,false);
insert into tb_categoria (descricao,cupomOff,generico) values ("hipertensao",true,false);

insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Finasterida","União Quimica" , 23.99, false, true, 1 );
insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Nimisulida","Cimed" , 12.99, false, true, 2 );
insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Furuato","Avamys" , 61.99, true, true, 3 );
insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Spray AntiTranspirante","Dove" , 10.00, false, true, 4 );
insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Losartana","Neo Quimica" , 8.99, false, true, 5 );
insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Ibuprofeno","Medley" , 8.53, false, true, 2 );
insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Captopril","Cimed" , 4.00, false, true, 5 );
insert into tb_produto (nome ,marca ,preco ,delivery , sacola, categoria_id) values ("Flanax","Bayer" , 17.00, false, true, 2 );

-- select * from tb_categoria;

select * from tb_produto where tb_produto.preco > 50.00;
select * from tb_produto where tb_produto.preco between 3.00 and 60.00;
select * from tb_produto where tb_produto.nome like "%b%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select nome, marca, preco,tb_categoria.descricao, tb_categoria.cupomOff from tb_produto right join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.descricao = "hipertensao";
