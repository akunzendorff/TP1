create database Clinica;
use Clinica;

create table Pacientes(
id int primary key auto_increment,
codigo int,
nome varchar(100),
endereco varchar(100),
complemento varchar(50),
rg varchar(13),
cpf varchar(15),
dataNasc varchar(15)
);

drop table Pacientes;

create table Usuarios(
id int primary key auto_increment,
login varchar(100),
senha varchar(100)
);