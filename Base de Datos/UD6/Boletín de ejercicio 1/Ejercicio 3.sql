CREATE DATABASE teatro;


CREATE TABLE Invitado (
	NroInvitado		INTEGER NOT NULL,
	Nombre			VARCHAR(20) NOT NULL,
	Categoria 		VARCHAR(20) NOT NULL,
	Origen			VARCHAR(50) NOT NULL,
	CONSTRAINT pk_invitado
		PRIMARY KEY (NroInvitado)
);

CREATE TABLE Teatro (
	CodTeat			INTEGER NOT NULL,
	Nombre			VARCHAR(50),
	Direccion		VARCHAR(50),
	CantAsientos	INTEGER NOT NULL,
	CONSTRAINT pk_teatro
		PRIMARY KEY (CodTeat),
	CONSTRAINT ck_cant_asientos_positivos
		CHECK (CantAsientos > 0)
);

CREATE TABLE Obra (
	CodObra			INTEGER NOT NULL,
	NombreObra		VARCHAR(400),
	Autor			VARCHAR(40),
	CONSTRAINT pk_obra
		PRIMARY KEY (CodObra)
	
	/*
	Las FK no pueden ser NUNCA de tipo (SMALL/BIG)SERIAL
	*/
);

CREATE TABLE Exhibe (
	CodTeat		INTEGER NOT NULL,
	Fecha		DATE NOT NULL,
	CodObra		INTEGER NOT NULL,
	CONSTRAINT pk_exhibe
		PRIMARY KEY (CodTeat, Fecha)
);

CREATE TABLE Tipo_Asiento ( 
	Tipo			INTEGER NOT NULL,
	Nombre			VARCHAR(25),
	Descripcion		TEXT,
	CONSTRAINT pk_asiento
		PRIMARY KEY (Tipo)
);

CREATE TABLE Asiento_Tipo (
	NroAsiento		INTEGER NOT NULL,
	Tipo			INTEGER NOT NULL,
	CONSTRAINT pk_asiento_tipo
		PRIMARY KEY (NroAsiento)
);

CREATE TABLE Precio (
	CodTeat		INTEGER NOT NULL,
	Fecha		DATE NOT NULL,
	Tipo		INTEGER NOT NULL,
	Precio		NUMERIC,
	CONSTRAINT pk_precio
		PRIMARY KEY (CodTeat, Fecha, Tipo),
	CONSTRAINT ck_precio_positivo
		CHECK (precio > 0)
);

CREATE TABLE Entrada (
	CodTeat			INTEGER NOT NULL,
	Fecha			DATE NOT NULL,
	NroAsiento		INTEGER NOT NULL,
	NroInvit		INTEGER NOT NULL,
	CONSTRAINT pk_entrada
		PRIMARY KEY (CodTeat, Fecha, NroAsiento)
);

ALTER TABLE Exhibe
ADD CONSTRAINT fk_exhibe_teatro
	FOREIGN KEY (CodTeat)
	REFERENCES Teatro,
ADD CONSTRAINT fk_exhibe_obra
	FOREIGN KEY (CodObra)
	REFERENCES Obra;
	
ALTER TABLE Asiento_Tipo
ADD CONSTRAINT fk_asientotipo_tipoasiento
	FOREIGN KEY (Tipo)
	REFERENCES Tipo_Asiento;
	
ALTER TABLE Precio
ADD CONSTRAINT fk_precio_exhibe
	FOREIGN KEY (CodTeat, Fecha)
	REFERENCES Exhibe,
ADD CONSTRAINT fk_precio_tipoasiento
	FOREIGN KEY (Tipo)
	REFERENCES Tipo_Asiento;
	
ALTER TABLE Entrada
ADD CONSTRAINT fk_entrada_exhibe
	FOREIGN KEY (CodTeat,Fecha)
	REFERENCES Exhibe,
ADD CONSTRAINT fk_entrada_asientotipo
	FOREIGN KEY (NroAsiento)
	REFERENCES Asiento_Tipo,
ADD CONSTRAINT fk_entrada_invitado
	FOREIGN KEY (NroInvit)
	REFERENCES Invitado;