-- Atividade 2
-- Criando o Banco de dados
create database db_ecommerce;
-- aceesando o Banco de dados
use db_ecommerce;

-- criando as Variaveis de Atributos
create table tb_produtos(
id bigint auto_increment,
nomeProduto varchar(80) not null,
preco float not null,
departamento varchar (50) not null,
marca varchar(50) not null,
id_produto int(50) not null,
primary key (id)
);

-- Adicionando Dados na Tabela de 8 produtos

insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("Xbox one X", 3000 ,"Games" ,"Microsoft ",2121);
insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("Nintendo Switch", 2900 ,"Games" ,"Nintendo ",2122);
insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("PlayStation 4", 2600 ,"Games" ,"Sony ",2123);
insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("Geladeira Frost Free", 3500 ,"Eletrodomestico" ,"Samsung ",2221);
insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("Macbook pro", 9000 ,"Informatica" ,"Apple ",2321);
insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("Galaxy Note 10 plus", 5000 ,"Telefonia" ,"Samsung ",2451);
insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("iphone 11 pro", 6000 ,"Telefonia" ,"Apple ",2521);
insert into tb_produtos (nomeProduto, preco, departamento, marca, id_produto) values ("Funko Pop Ellie TLOU 2", 250 ,"Colecionaveis" ,"Funko Pop ",2721);

-- Mostrando produtos com valores maiores e menores do que 500

select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;

-- atualizando um dado da Query

update tb_produtos set preco = 300 where id = 8;


