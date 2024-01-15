CREATE TABLE Usuarios (
	DNI					VARCHAR(10) NOT NULL,
	Nombre				VARCHAR(150) NOT NULL,
	Apellidos			VARCHAR(150) NOT NULL,
	Direccion			VARCHAR(300),
	Telefono			VARCHAR(11) NOT NULL,
	Email				VARCHAR(200) NOT NULL,
	Passw				VARCHAR(8),
	Saldo_disponible	NUMERIC NOT NULL DEFAULT 0,
	CONSTRAINT pk_usuarios
		PRIMARY KEY (DNI),
	CONSTRAINT ck_passw_entre_4_y_8_car
		CHECK (Passw ILIKE ('____') OR
			   	Passw ILIKE ('_____') OR
			   	Passw ILIKE ('______') OR
			   	Passw ILIKE ('_______') OR
			   	Passw ILIKE ('________'))
	
);

CREATE TABLE Estaciones (
	Cod_estacion	VARCHAR(20) NOT NULL,
	Num_estacion	SERIAL NOT NULL,
	Direccion		VARCHAR(150) NOT NULL,
	Latitud			NUMERIC NOT NULL,
	Longitud		NUMERIC NOT NULL,
	CONSTRAINT pk_estaciones
		PRIMARY KEY (Cod_estacion),
	CONSTRAINT ck_codestacion_empieza_e
		CHECK (Cod_estacion ILIKE ('E%'))
);

CREATE TABLE Bicicletas (
	Cod_bicicleta	SERIAL NOT NULL,
	Marca			VARCHAR(100) NOT NULL,
	Modelo			VARCHAR(100) NOT NULL,
	fecha_alta		DATE NOT NULL,
	CONSTRAINT pk_bicicletas
		PRIMARY KEY (Cod_bicicleta)
);

CREATE TABLE Uso (
	Estacion_salida	VARCHAR(20) NOT NULL,
	fecha_salida	TIMESTAMP NOT NULL,
	dni_usuario		VARCHAR(10) NOT NULL,
	cod_bicicleta	INTEGER NOT NULL,
	estacion_llegada	VARCHAR(20) NOT NULL,
	fecha_llegada	TIMESTAMP NOT NULL,
	CONSTRAINT pk_uso
		PRIMARY KEY (Estacion_salida, fecha_salida, 
					 dni_usuario, cod_bicicleta, estacion_llegada)
	
);

ALTER TABLE Uso
ADD CONSTRAINT fk_uso_estaciones_salida
	FOREIGN KEY (Estacion_salida)
	REFERENCES Estaciones(cod_estacion),
ADD CONSTRAINT fk_uso_usuarios
	FOREIGN KEY (dni_usuario)
	REFERENCES Usuarios(DNI),
ADD CONSTRAINT fk_uso_bicicleta
	FOREIGN KEY (cod_bicicleta)
	REFERENCES Bicicletas(Cod_bicicleta),
ADD CONSTRAINT fk_uso_estaciones_llegada
	FOREIGN KEY (Estacion_llegada)
	REFERENCES Estaciones(Cod_estacion);
	
ALTER TABLE Usuarios
ADD COLUMN Fecha_Baja	DATE;