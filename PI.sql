CREATE DATABASE PI;
USE PI;

CREATE TABLE SIGN_IN_UP(
CODIGO INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(120),
Sobrenome VARCHAR(120),
Email VARCHAR(100),
Senha VARCHAR(100));

CREATE TABLE REGISTRO(
ID INT AUTO_INCREMENT PRIMARY KEY,
Nome_plantacao VARCHAR(120),
Proprietario VARCHAR(100),
Telefone VARCHAR(100),
Dt_analise DATE,
Doenca VARCHAR(100),
Obs VARCHAR(200));

select * from registro;

select * from sign_in_up;

