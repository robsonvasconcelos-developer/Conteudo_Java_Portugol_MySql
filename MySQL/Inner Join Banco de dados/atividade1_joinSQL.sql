create database db_generation_game_online;

use db_generation_game_online;

-- criando as Variaveis de Atributos - TABELA 1 - Classificacao de poderes
create table tb_classe( -- skill de personagem
id bigint auto_increment,
fogo int(5),
gelo int(5),
agua int(5),
primary key (id)
);

-- Criar Tabela 2 - Personagens
  create table tb_personagem( 
  id bigint auto_increment,  -- Definindo como auto Incremente 1, 2, 3 ...
  mario varchar(60) not NULL,
  elsa varchar(60) not NULL,
  aquaman varchar(60) not NULL,
  wonderwoman varchar(60) not NULL,
  deadpool varchar(60) not NULL,
  skill_id  bigint not NULL,
  

  PRIMARY KEY (id), -- Definir coluna id como chave primária
  FOREIGN KEY (skill_id) REFERENCES tb_classe (id) -- Definir coluna id como chave estrangeira e referenciando a tb_marcas coluna id
);

insert into tb_classe (fogo,gelo,agua) values (3000,1000,2000);
insert into tb_classe (fogo, agua, gelo) values (3000,2000,1000);
insert into tb_classe (gelo,fogo,agua) values (1000,3000,2000);
insert into tb_classe (agua,gelo,fogo) values (2000,1000,3000);
insert into tb_classe (agua,fogo,gelo) values (2000,3000,1000);

insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Mario - Fire Ball"," Elsa - Frozen Down" , "Aquaman - Wave Attack", "Wonder Woman - Strong hands Power ", "Arqueiro - Weapon Allow right Power ", 1 );
insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Steve Jobs - Fire Ball"," Ana - Frozen Down" , "Nick - Wave Attack", "Neves - Strong hands Power ", "Deadpool - Weapon Allow right Power ", 2 );
insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Jack - Fire Ball"," Banjo - Frozen Down" , " - Wave Attack", "Bia - Strong hands Power ", "Arqueiro - Weapon Allow right Power ", 3 );
insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Dean - Fire Ball"," Kazooe - Frozen Down" , "Billie - Wave Attack", "Nany - Strong hands Power ", "Arqueiro - Weapon Allow right Power ", 4 );
insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Cascao - Fire Ball"," James - Frozen Down" , "Eillish - Wave Attack", "Wanny - Strong hands Power ", "Arqueiro - Weapon Allow right Power ", 5 );

insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Steve Jobs - Fire Ball"," Ana - Frozen Down" , "Nick - Wave Attack", "Neves - Strong hands Power ", "Deadpool - Weapon Allow right Power ", 2 );
insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Jack - Fire Ball"," Banjo - Frozen Down" , " - Wave Attack", "Bia - Strong hands Power ", "Arqueiro - Weapon Allow right Power ", 3 );
insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Dean - Fire Ball"," Kazooe - Frozen Down" , "Billie - Wave Attack", "Nany - Strong hands Power ", "Arqueiro - Weapon Allow right Power ", 4 );
insert into tb_personagem (mario ,elsa ,aquaman ,wonderwoman ,deadpool, skill_id) values ("Cascao - Fire Ball"," James - Frozen Down" , "Eillish - Wave Attack", "Wanny - Strong hands Power ", "Arqueiro - Weapon Allow right Power ", 5 );


select * from tb_personagem where tb_personagem.mario > 2000;
select * from tb_personagem where tb_personagem.deadpool between 1000 and 2000;
select * from tb_personagem where tb_personagem.mario like "%C%";
select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.skill_id;
select * from tb_personagem where tb_personagem.deadpool like "%arqueiro%"; -- versao Correta!






