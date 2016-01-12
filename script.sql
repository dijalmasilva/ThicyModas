create table cliente(

	imagem varchar(150) not null,
	nomeCompleto varchar(100) not null,
	cpf varchar(14) not null unique,
	telefone varchar(11) not null,
	email varchar(60) not null,
	rua varchar(60) not null, 
	numero varchar(5) not null,
	bairro varchar(60) not null,
	cidade varchar(60) not null,
	estado varchar(30) not null,
	complemento varchar(60),
	telefoneOpcional varchar(20),
	limite numeric(10,2) not null,
	profissao varchar(60),
	observacao text,
	disponibilidade varchar(10),
	aniversario date not null,

	primary key (cpf)
);

create table usuario(

	imagem varchar(150) not null,
	nomeCompleto varchar(100) not null,
	cpf varchar(14) not null unique,
	telefone varchar(11) not null,
	email varchar(60) not null,
	rua varchar(60) not null, 
	numero varchar(5) not null,
	bairro varchar(60) not null,
	cidade varchar(60) not null,
	estado varchar(30) not null,
	complemento varchar(60),
	nomedeusuario varchar(50) not null unique,
	senha varchar(120) not null,
	salario numeric(10, 2) not null,
	telefoneOpcional varchar(20),

	primary key (cpf)
);

create table marca(

	id serial,
	nome varchar(100) not null unique,
	telefone varchar(11) not null,
	email varchar(60) not null,
	rua varchar(60) not null, 
	numero varchar(5) not null,
	bairro varchar(60) not null,
	cidade varchar(60) not null,
	estado varchar(30) not null,
	complemento varchar(60),

	primary key (id)
);

create table fornecedor(

	id serial,
	nome varchar(100) not null,
	telefone varchar(11) not null,
	email varchar(60) not null,
	idMarca integer not null,
	rua varchar(60) not null, 
	numero varchar(5) not null,
	bairro varchar(60) not null,
	cidade varchar(60) not null,
	estado varchar(30) not null,
	complemento varchar(60),

	primary key (id),
	foreign key (idMarca) references marca (id)
);

create table venda(

	id serial,
	total numeric(10,2) not null,
	qtdeParcelas integer default 1,
	entrada numeric(10,2) default 0,

	primary key(id)
);

create table vendaVista(

	id integer not null,
	total numeric(10,2) not null,
	qtdeParcelas integer default 1,
	entrada numeric(10,2) default 0,

	primary key(id),
	foreign key (id) references venda(id)
);

create table vendaPrazo(

	id serial,
	total numeric(10,2) not null,
	qtdeParcelas integer default 1,
	entrada numeric(10,2) default 0,
	nomeCliente varchar(100) not null,
	cpf varchar(14) not null,

	primary key(id, cpf),
	foreign key(id) references venda(id),
	foreign key(cpf) references cliente(cpf)
);

create table produto(

	codigo varchar(20) not null,
	imagem varchar(150) not null,
	valordeentrada numeric(10,2) not null,
	valordesaida numeric(10,2) not null,
	genero varchar(10) not null,
	tipo varchar(30) not null,
	idMarca integer not null,

	primary Key(codigo),
	foreign key(idMarca) references marca(id)
);

create table itemdevenda( 

	id serial,
	idVenda integer not null,
	idproduto varchar(20) not null,
	subtotal numeric(10,2) not null,
	quantidade integer not null,

	primary key(id, idVenda),
	foreign key(idVenda) references venda(id),
	foreign key(idproduto) references produto(codigo)
);