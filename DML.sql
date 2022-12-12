-- ------------------------------------------------------------------------
-- CARGO
-- ------------------------------------------------------------------------
insert into cargo (id, descr, salario, adic_ano, benef_pct) values (1,'Secretário',  7000, 1000, 20);
insert into cargo (id, descr, salario, adic_ano, benef_pct) values (2,'Vendedor'  , 12000, 1800, 30);
insert into cargo (id, descr, salario, adic_ano, benef_pct) values (3,'Gerente'   , 20000, 3000,  0);
commit;

-- ------------------------------------------------------------------------
-- FUNCIONARIO
-- ------------------------------------------------------------------------
insert into funcionario (id, nome, id_crg, ctr_ano, ctr_mes) values (1,'Jorge Carvalho',1,'2018','01');
insert into funcionario (id, nome, id_crg, ctr_ano, ctr_mes) values (2,'Maria Souza'   ,1,'2015','12');
insert into funcionario (id, nome, id_crg, ctr_ano, ctr_mes) values (3,'Ana Silva'     ,2,'2021','12');
insert into funcionario (id, nome, id_crg, ctr_ano, ctr_mes) values (4,'João Mendes'   ,2,'2021','12');
insert into funcionario (id, nome, id_crg, ctr_ano, ctr_mes) values (5,'Juliana Alves' ,3,'2017','07');
insert into funcionario (id, nome, id_crg, ctr_ano, ctr_mes) values (6,'Bento Albino'  ,3,'2014','03');
commit;

-- ------------------------------------------------------------------------
-- VENDA
-- ------------------------------------------------------------------------
insert into venda (id_fun, ano, mes, valor) values (3, '2021', '12', 5200);
insert into venda (id_fun, ano, mes, valor) values (4, '2021', '12', 3400);

insert into venda (id_fun, ano, mes, valor) values (3, '2022', '01', 4000);
insert into venda (id_fun, ano, mes, valor) values (4, '2022', '01', 7700);

insert into venda (id_fun, ano, mes, valor) values (3, '2022', '02', 4200);
insert into venda (id_fun, ano, mes, valor) values (4, '2022', '02', 5000);

insert into venda (id_fun, ano, mes, valor) values (3, '2022', '03', 5850);
insert into venda (id_fun, ano, mes, valor) values (4, '2022', '03', 5900);

insert into venda (id_fun, ano, mes, valor) values (3, '2022', '04', 7000);
insert into venda (id_fun, ano, mes, valor) values (4, '2022', '04', 6500);

commit;

