create database db_pizzaria_legal;

use db_pizzaria_legal;

-- criando as Variaveis de Atributos - TABELA 1 
create table tb_categoria( -- Categoria das Pizzas
id bigint auto_increment,
produto varchar(60) not NULL,
valorFrete float (10) not NULL,
ifoodFreteZero boolean not NULL,
primary key (id)
);

-- Criar Tabela 2 - Personagens
  create table tb_pizza( 
  id bigint auto_increment,  -- Definindo como auto Incremente 1, 2, 3 ...
  recheio1 varchar(60) not NULL,
  recheio2 varchar(60),
  recheioExtra boolean not NULL,
  borda boolean not NULL,
  valor decimal(10,2) not NULL,
  categoria_id  bigint not NULL,
  

  PRIMARY KEY (id), -- Definir coluna id como chave primária
  FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id) -- Definir coluna id como chave estrangeira e referenciando a tb_marcas coluna id
);

insert into tb_categoria (produto,valorFrete,ifoodFreteZero) values ("Brotinho",9.99,false);
insert into tb_categoria (produto,valorFrete,ifoodFreteZero) values ("Esfiha",9.99,false);
insert into tb_categoria (produto,valorFrete,ifoodFreteZero) values ("Pizza Grande",0.00,true);
insert into tb_categoria (produto,valorFrete,ifoodFreteZero) values ("Acima de 20 Esfihas",0.00,true);
insert into tb_categoria (produto,valorFrete,ifoodFreteZero) values ("Acima de 3 brotinhos",0.00,true);

insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("Portuguesa","" , false, false, 31.00, 1 );
insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("Calabresa","Mussarela" , true, false, 26.00, 3 );
insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("Baiana","" , false, true, 30.00, 3 );
insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("carne","" , false, false, 30.00, 4 );
insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("Mata Fome","" , false, false, 36.00, 3 );
insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("Palmito","Bacon" , true, true, 39.00, 3 );
insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("Frango Catupiry","4 queijos" , true, true, 40.00, 3 );
insert into tb_pizza (recheio1 ,recheio2 ,recheioExtra ,borda ,valor , categoria_id) values ("Portuguesa","4 queijos" , true, true, 50.00, 4 );



select * from tb_pizza where tb_pizza.valor > 45.00;
select * from tb_pizza where tb_pizza.valor between 29.00 and 60.00;
select * from tb_pizza where tb_pizza.recheio1 like "%C%";

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

select recheio1 from tb_pizza right join tbn_categoria on tb_pizza.categoria_id = tb_categoria.id where produto = "Esfiha";
