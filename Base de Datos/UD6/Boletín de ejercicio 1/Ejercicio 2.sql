CREATE DATABASE libreria;

DROP TABLE Edicion;
DROP TABLE Libro;
DROP TABLE Genero;
DROP TABLE Editorial;
DROP TABLE Autor;




CREATE TABLE Autor (
	DNI	VARCHAR (10),
	Nombre	VARCHAR (15) NOT NULL,
	Nacionalidad	VARCHAR (12),
	CONSTRAINT pk_autor
		PRIMARY KEY (DNI)
	
);

CREATE TABLE Genero (
	Id_genero	SERIAL,
	Nombre	VARCHAR(20) NOT NULL,
	Descripcion	VARCHAR (200),
	CONSTRAINT pk_genero
		PRIMARY KEY (Id_genero)
);

CREATE TABLE Editorial (
	Cod_editorial	SERIAL ,
	Nombre	VARCHAR (15) NOT NULL,
	Direccion	VARCHAR (30),
	Poblacion	VARCHAR (50),
	CONSTRAINT pk_editorial
		PRIMARY KEY (Cod_editorial)
);

CREATE TABLE Libro(
	ISBN	VARCHAR (13),
	Titulo	VARCHAR(30) NOT NULL,
	Dni_autor	VARCHAR(10) NOT NULL,
	Cod_genero	INTEGER NOT NULL,
	Cod_editorial	INTEGER NOT NULL,
	CONSTRAINT pk_libro 
		PRIMARY KEY (ISBN),
	CONSTRAINT fk_libro_autor
		FOREIGN KEY (Dni_autor)
		REFERENCES Autor (DNI),
	CONSTRAINT fk_libro_genero
		FOREIGN KEY (Cod_genero)
		REFERENCES Genero (Id_genero),
	CONSTRAINT fk_libro_editorial
		FOREIGN KEY (Cod_editorial)
		REFERENCES Editorial (Cod_editorial)
);


CREATE TABLE Edicion (
	ISBN VARCHAR (13),
	Fecha_publicacion	DATE,
	Cantidad	INTEGER,
	CONSTRAINT	pk_edicion
		PRIMARY KEY (ISBN, Fecha_publicacion),
	CONSTRAINT fk_edicion_libros
		FOREIGN KEY (ISBN)
		REFERENCES Libro (ISBN),
	CONSTRAINT ck_cantidad_mayor_0
		CHECK (Cantidad > 0)
);















