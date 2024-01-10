CREATE DATABASE libreria;

CREATE TABLE Libro(
	ISBN	VARCHAR (13),
	Titulo	VARCHAR(30),
	Dni_autor	VARCHAR(10),
	Cod_genero	INTEGER,
	Cod_editorial	INTEGER,
	CONSTRAINT pk_libro 
		PRIMARY KEY (ISBN)
	CONSTRAINT fk_autor_dni
		FOREIGN KEY (Dni_autor)
		REFERENCES Autor (DNI)
	CONSTRAINT 
);

CREATE TABLE Autor (
	DNI	VARCHAR (10),
	Nombre	VARCHAR (15),
	Nacionalidad	VARCHAR (12),
	CONSTRAINT pk_autor
		PRIMARY KEY (DNI)
);

CREATE TABLE Editorial (
	Cod_editorial	SERIAL,
	Nombre	VARCHAR (15),
	Direccion	VARCHAR (30),
	Poblacion	VARCHAR (50),
	CONSTRAINT pk_editorial
		PRIMARY KEY (Cod_editorial)
);

CREATE TABLE Genero (
	Id_genero	SERIAL,
	Nombre	VARCHAR(20),
	Descripcion	VARCHAR (200),
	CONSTRAINT pk_genero
		PRIMARY KEY (Id_genero)
);

CREATE TABLE Edicion (
	ISBN VARCHAR (13),
	Fecha_publicacion	DATE,
	Cantidad	INTEGER,
	CONSTRAINT	pk_edicion
		PRIMARY KEY (ISBN, Fecha)
);