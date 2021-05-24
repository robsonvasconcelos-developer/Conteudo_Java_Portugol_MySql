-- Atividade 4

create database db_cidade_das_carnes;

use db_cidade_das_carnes;

-- criando as Variaveis de Atributos - TABELA 1 
create table tb_categoria( 
id bigint auto_increment,
tipoCarne varchar (60) not NULL,
promocao boolean not NULL,
ativo boolean not NULL,
primary key (id)
);

-- Criar Tabela 2 
  create table tb_produto( 
  id bigint auto_increment,  -- Definindo como auto Incremente 1, 2, 3 ...
  nome varchar(60) not NULL,
  kg float (10) not NULL,
  preco float (10) not NULL,
  delivery boolean not NULL,
  sacola boolean not NULL,
  categoria_id  bigint not NULL,
  

  PRIMARY KEY (id), 
  FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id) 
);

insert into tb_categoria (tipoCarne,promocao,ativo) values ("Aves",true,true);
insert into tb_categoria (tipoCarne,promocao,ativo) values ("Bovina",false,true);
insert into tb_categoria (tipoCarne,promocao,ativo) values ("Carne de Porco",false,true);
insert into tb_categoria (tipoCarne,promocao,ativo) values ("Hamburguer",false,true);
insert into tb_categoria (tipoCarne,promocao,ativo) values ("Enchidos",false,true);

insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Frango",1 , 17.00, false, true, 1 );
insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Costelinha",2 , 30.00, false, true, 3 );
insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Carne industrial",1 , 12.00, true, true, 4 );
insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Carne Moida",1.5 , 19.00, false, true, 5 );
insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Filé Mignon",1 , 53.00, false, true, 2 );
insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Picanha",1 , 60.00, false, true, 2 );
insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Largato",1 , 52.00, false, true, 2 );
insert into tb_produto (nome ,kg ,preco ,delivery , sacola, categoria_id) values ("Acem",1 , 51.00, false, true, 2 );

-- select * from tb_produto;

select * from tb_produto where tb_produto.preco > 50.00;
select * from tb_produto where tb_produto.preco between 3.00 and 60.00;
select * from tb_produto where tb_produto.nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select nome, kg, preco,tb_categoria.tipoCarne, tb_categoria.ativo from tb_produto right join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.tipoCarne = "Aves";



