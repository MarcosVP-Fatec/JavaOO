-- ------------------------------------------------------------------------
-- cria schema e usuario para acesso web
-- ------------------------------------------------------------------------
create schema if not exists javaoo;
use javaoo;
create user if not exists 'admin'@'localhost' identified by 'admin';
grant select, insert, delete, update on javaoo.* to admin@'localhost';

-- ------------------------------------------------------------------------
-- CARGO
-- ------------------------------------------------------------------------
create table cargo (
      id                    bigint        not null primary key auto_increment
    , descr                 varchar(20)   not null
    , salario               decimal(10,2) not null 
    , adic_ano              decimal(10,2) not null 
    , benef_pct             decimal(10,2) not null
);

alter table cargo add constraint cargo_uk1 unique (descr);
create index cargo_idx01 on cargo (descr);

-- ------------------------------------------------------------------------
-- FUNCIONARIO
-- ------------------------------------------------------------------------
create table funcionario (
      id                    bigint      not null primary key auto_increment
    , nome                  varchar(40) not null
    , id_crg                bigint      not null
    , ctr_ano               varchar(4)  not null
    , ctr_mes               varchar(2)  not null
);

alter table funcionario add constraint funcionario_fk1 foreign key (id_crg) references cargo(id);

create index funcionario_idx01 on funcionario (nome);
create index funcionario_idx02 on funcionario (ctr_ano,ctr_mes,nome);

-- ------------------------------------------------------------------------
-- VENDA
-- ------------------------------------------------------------------------
create table venda(
      id                    bigint        not null primary key auto_increment
    , id_fun                bigint        not null
    , ano                   varchar(4)    not null
    , mes                   varchar(2)    not null
    , valor                 decimal(10,2) not null
);

alter table venda add constraint venda_fk1 foreign key (id_fun) references funcionario(id);
create index venda_idx01 on venda (id_fun,ano,mes);

