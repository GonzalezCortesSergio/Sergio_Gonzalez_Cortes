CREATE TABLE usuarios (
	dni					VARCHAR(10) NOT NULL,
	nombre				VARCHAR(150) NOT NULL,
	apellidos			VARCHAR(150) NOT NULL,
	direccion			VARCHAR(300),
	telefono			VARCHAR(11) NOT NULL,
	email				VARCHAR(200) NOT NULL,
	passw				VARCHAR(8),
	saldo_disponible	NUMERIC NOT NULL DEFAULT 0,
	CONSTRAINT pk_usuarios
		PRIMARY KEY (DNI),
	CONSTRAINT ck_usuarios_passw_entre_4_y_8_car
		CHECK (LENGTH (passw) BETWEEN 4 AND 8),
	CONSTRAINT ck_usuarios_passw_sinespacios
		CHECK (passw NOT ILIKE ('% %'))
	
);

CREATE TABLE estaciones (
	cod_estacion	VARCHAR(20) NOT NULL,
	cum_estacion	SERIAL NOT NULL,
	direccion		VARCHAR(150) NOT NULL,
	latitud			NUMERIC NOT NULL,
	longitud		NUMERIC NOT NULL,
	CONSTRAINT pk_estaciones
		PRIMARY KEY (cod_estacion),
	CONSTRAINT ck_codestacion_empieza_e
		CHECK (cod_estacion ILIKE ('E%'))
);

CREATE TABLE bicicletas (
	cod_bicicleta	SERIAL NOT NULL,
	marca			VARCHAR(100) NOT NULL,
	modelo			VARCHAR(100) NOT NULL,
	fecha_alta		DATE NOT NULL,
	CONSTRAINT pk_bicicletas
		PRIMARY KEY (cod_bicicleta)
);

CREATE TABLE uso (
	estacion_salida		VARCHAR(20) NOT NULL,
	fecha_salida		TIMESTAMP NOT NULL,
	dni_usuario			VARCHAR(10) NOT NULL,
	cod_bicicleta		INTEGER NOT NULL,
	estacion_llegada	VARCHAR(20) NOT NULL,
	fecha_llegada		TIMESTAMP NOT NULL,
	CONSTRAINT pk_uso
		PRIMARY KEY (estacion_salida, fecha_salida, 
					 dni_usuario, cod_bicicleta, estacion_llegada)
	
);

ALTER TABLE uso
ADD CONSTRAINT fk_uso_estaciones_salida
	FOREIGN KEY (estacion_salida)
	REFERENCES estaciones(cod_estacion),
ADD CONSTRAINT fk_uso_usuarios
	FOREIGN KEY (dni_usuario)
	REFERENCES usuarios(dni),
ADD CONSTRAINT fk_uso_bicicleta
	FOREIGN KEY (cod_bicicleta)
	REFERENCES bicicletas(cod_bicicleta),
ADD CONSTRAINT fk_uso_estaciones_llegada
	FOREIGN KEY (estacion_llegada)
	REFERENCES estaciones(cod_estacion);
	
ALTER TABLE usuarios
ADD COLUMN fecha_baja	DATE;

