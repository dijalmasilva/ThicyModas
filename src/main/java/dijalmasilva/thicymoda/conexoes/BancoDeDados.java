/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.thicymoda.conexoes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class BancoDeDados {

    public static boolean criaBancoDeDados(Connection con) {
        boolean result = false;

        String sql = "create database thicymoda";

        try {
            Statement stat = con.createStatement();
            if (stat.executeUpdate(sql) > 0) {
                result = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println("Erro ao criar banco de dados.");
        }

        return result;
    }

    public static boolean criaTabelas(Connection con) {

        boolean result = false;

        String sql = "create table cliente(\n"
                + "\n"
                + "	imagem varchar(150) not null,\n"
                + "	nomeCompleto varchar(100) not null,\n"
                + "	cpf varchar(14) not null unique,\n"
                + "	telefone varchar(16) not null,\n"
                + "	email varchar(60) not null,\n"
                + "	rua varchar(60) not null, \n"
                + "	numero varchar(5) not null,\n"
                + "	bairro varchar(60) not null,\n"
                + "	cidade varchar(60) not null,\n"
                + "	estado varchar(30) not null,\n"
                + "	complemento varchar(60),\n"
                + "	telefoneOpcional varchar(20),\n"
                + "	limite numeric(10,2) not null,\n"
                + "	profissao varchar(60),\n"
                + "	observacao text,\n"
                + "	disponibilidade varchar(40),\n"
                + "	aniversario date not null,\n"
                + "\n"
                + "	primary key (cpf)\n"
                + ");"
                + ""
                + "create table usuario(\n"
                + "\n"
                + "	imagem varchar(150) not null,\n"
                + "	nomeCompleto varchar(100) not null,\n"
                + "	cpf varchar(14) not null unique,\n"
                + "	telefone varchar(16) not null,\n"
                + "	email varchar(60) not null,\n"
                + "	rua varchar(60) not null, \n"
                + "	numero varchar(5) not null,\n"
                + "	bairro varchar(60) not null,\n"
                + "	cidade varchar(60) not null,\n"
                + "	estado varchar(30) not null,\n"
                + "	complemento varchar(60),\n"
                + "	nomedeusuario varchar(50) not null unique,\n"
                + "	senha varchar(120) not null,\n"
                + "	salario numeric(10, 2) not null,\n"
                + "	telefoneOpcional varchar(20),\n"
                + "\n"
                + "	primary key (cpf)\n"
                + ");"
                + ""
                + "create table marca(\n"
                + "\n"
                + "	id serial,\n"
                + "	nome varchar(100) not null unique,\n"
                + "	telefone varchar(16) not null,\n"
                + "	email varchar(60) not null,\n"
                + "	rua varchar(60) not null, \n"
                + "	numero varchar(5) not null,\n"
                + "	bairro varchar(60) not null,\n"
                + "	cidade varchar(60) not null,\n"
                + "	estado varchar(30) not null,\n"
                + "	complemento varchar(60),\n"
                + "\n"
                + "	primary key (id)\n"
                + ");"
                + ""
                + "create table fornecedor(\n"
                + "\n"
                + "	id serial,\n"
                + "	nome varchar(100) not null,\n"
                + "	telefone varchar(16) not null,\n"
                + "	email varchar(60) not null,\n"
                + "	idMarca integer not null,\n"
                + "	rua varchar(60) not null, \n"
                + "	numero varchar(5) not null,\n"
                + "	bairro varchar(60) not null,\n"
                + "	cidade varchar(60) not null,\n"
                + "	estado varchar(30) not null,\n"
                + "	complemento varchar(60),\n"
                + "\n"
                + "	primary key (id),\n"
                + "	foreign key (idMarca) references marca (id)\n"
                + ");"
                + ""
                + "create table venda(\n"
                + "\n"
                + "	id serial,\n"
                + "	total numeric(10,2) not null,\n"
                + "	qtdeParcelas integer default 1,\n"
                + "	entrada numeric(10,2) default 0,\n"
                + "\n"
                + "	primary key(id)\n"
                + ");"
                + ""
                + "create table vendaVista(\n"
                + "\n"
                + "	id integer not null,\n"
                + "	total numeric(10,2) not null,\n"
                + "	qtdeParcelas integer default 1,\n"
                + "	entrada numeric(10,2) default 0,\n"
                + "\n"
                + "	primary key(id),\n"
                + "	foreign key (id) references venda(id)\n"
                + ");"
                + ""
                + "create table vendaPrazo(\n"
                + "\n"
                + "	id serial,\n"
                + "	total numeric(10,2) not null,\n"
                + "	qtdeParcelas integer default 1,\n"
                + "	entrada numeric(10,2) default 0,\n"
                + "	nomeCliente varchar(100) not null,\n"
                + "	cpf varchar(14) not null,\n"
                + "\n"
                + "	primary key(id, cpf),\n"
                + "	foreign key(id) references venda(id),\n"
                + "	foreign key(cpf) references cliente(cpf)\n"
                + ");"
                + ""
                + "create table produto(\n"
                + "\n"
                + "	codigo varchar(20) not null,\n"
                + "	imagem varchar(150) not null,\n"
                + "	valordeentrada numeric(10,2) not null,\n"
                + "	valordesaida numeric(10,2) not null,\n"
                + "	genero varchar(10) not null,\n"
                + "	tipo varchar(30) not null,\n"
                + "	idMarca integer not null,\n"
                + "\n"
                + "	primary Key(codigo),\n"
                + "	foreign key(idMarca) references marca(id)\n"
                + ");"
                + ""
                + "create table itemdevenda( \n"
                + "\n"
                + "	id serial,\n"
                + "	idVenda integer not null,\n"
                + "	idproduto varchar(20) not null,\n"
                + "	subtotal numeric(10,2) not null,\n"
                + "	quantidade integer not null,\n"
                + "\n"
                + "	primary key(id, idVenda),\n"
                + "	foreign key(idVenda) references venda(id),\n"
                + "	foreign key(idproduto) references produto(codigo)\n"
                + ");";

        try {
            Statement stat = con.createStatement();

            if (stat.executeUpdate(sql) > 0) {
                result = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
