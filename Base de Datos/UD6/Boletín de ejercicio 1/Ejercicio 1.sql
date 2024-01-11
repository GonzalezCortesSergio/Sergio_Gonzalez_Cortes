CREATE DATABASE libreria;

CREATE TABLE Libro(
	ISBN	VARCHAR (13),
	Titulo	VARCHAR(30),
	Dni_autor	VARCHAR(10),
	Cod_genero	INTEGER,
	Cod_editorial	INTEGER,
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
		REFERENCES Editorial (Cod_editorial),
	CONSTRAINT ck_titulo_no_nulo
		CHECK (Titulo IS NOT NULL),
	CONSTRAINT ck_dni_autor_no_nulo
		CHECK (Dni_autor IS NOT NULL),
	CONSTRAINT ck_cod_genero_no_nulo
		CHECK (Cod_genero IS NOT NULL),
	CONSTRAINT ck_cod_editorial_no_nulo
		CHECK (Cod_editorial IS NOT NULL)
);

CREATE TABLE Autor (
	DNI	VARCHAR (10),
	Nombre	VARCHAR (15),
	Nacionalidad	VARCHAR (12),
	CONSTRAINT pk_autor
		PRIMARY KEY (DNI),
	CONSTRAINT ck_nombre_no_nulo
		CHECK (Nombre IS NOT NULL)
);

CREATE TABLE Editorial (
	Cod_editorial	SERIAL,
	Nombre	VARCHAR (15),
	Direccion	VARCHAR (30),
	Poblacion	VARCHAR (50),
	CONSTRAINT pk_editorial
		PRIMARY KEY (Cod_editorial),
	CONSTRAINT ck_nombre_no_nulo
		CHECK (Nombre IS NOT NULL)
);

CREATE TABLE Genero (
	Id_genero	SERIAL,
	Nombre	VARCHAR(20),
	Descripcion	VARCHAR (200),
	CONSTRAINT pk_genero
		PRIMARY KEY (Id_genero),
	CONSTRAINT ck_nombre_no_nulo
		CHECK (Nombre IS NOT NULL)
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