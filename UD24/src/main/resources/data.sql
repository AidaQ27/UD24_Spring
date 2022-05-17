DROP table IF EXISTS treballador;

create table treballador(
	id int primary key auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	tipo_feina varchar(250),
	sou double);

insert into treballador (nombre, apellido,tipo_feina,sou)values('Jose','Marin','Developer',1100);
insert into treballador (nombre, apellido,tipo_feina,sou)values('Juan','Lopez','Informatico',1200);
insert into treballador (nombre, apellido,tipo_feina,sou)values('Pedro','Guillem','Celador',1000);
insert into treballador (nombre, apellido,tipo_feina,sou)values('Aida','Martin','Team Leader',1200);
insert into treballador (nombre, apellido,tipo_feina,sou)values('Jonatan','Vicente','Developer',1100);
