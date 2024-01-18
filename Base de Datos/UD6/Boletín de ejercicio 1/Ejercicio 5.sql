CREATE TABLE alumnos (
	dni			VARCHAR(10),
	nombre		VARCHAR(150) NOT NULL,
	direccion	VARCHAR(150) NOT NULL,
	telefono	VARCHAR(12),
	edad		INTEGER,
	empresa		VARCHAR(10) NOT NULL,
	CONSTRAINT pk_alumnos
		PRIMARY KEY (dni)
);

CREATE TABLE empresas (
	cif			VARCHAR(10),
	nombre		VARCHAR(150) NOT NULL,
	direccion	VARCHAR(150) NOT NULL,
	telefono	VARCHAR(12),
	CONSTRAINT pk_empresas	
		PRIMARY KEY (cif)
);

CREATE TABLE cursos (
	n_concreto		INTEGER,
	fecha_inicio	DATE NOT NULL,
	fecha_fin		DATE NOT NULL,
	dni_profesor	VARCHAR(10) NOT NULL,
	tipo_curso		INTEGER NOT NULL, 
	CONSTRAINT pk_cursos
		PRIMARY KEY (n_concreto)
);
	
	
CREATE TABLE alumnos_asisten (
	dni			VARCHAR(10),
	n_concreto	INTEGER,
	CONSTRAINT pk_alumnos_asisten
		PRIMARY KEY (dni, n_concreto)
);

CREATE TABLE profesores (
	dni			VARCHAR(10),
	nombre		VARCHAR(150) NOT NULL,
	apellido	VARCHAR(150) NOT NULL,
	telefono	VARCHAR(12),
	direccion	VARCHAR(150) NOT NULL,
	CONSTRAINT pk_profesores
		PRIMARY KEY (dni)
);

CREATE TABLE tipos_curso (
	cod_curso		INTEGER,
	duracion		INTEGER NOT NULL,
	programa		VARCHAR(150) NOT NULL,
	titulo			VARCHAR(250) NOT NULL,
	CONSTRAINT pk_tipos_cursos
		PRIMARY KEY (cod_curso)
);

ALTER TABLE alumnos
ADD CONSTRAINT fk_alumnos_empresas
	FOREIGN KEY (empresa)
	REFERENCES empresas(cif);
	
ALTER TABLE alumnos_asisten
ADD CONSTRAINT fk_alumnos_asisten_alumnos
	FOREIGN KEY (dni)
	REFERENCES alumnos,
ADD CONSTRAINT fk_alumnos_asisten_cursos
	FOREIGN KEY (n_concreto)
	REFERENCES cursos;
	
ALTER TABLE cursos
ADD CONSTRAINT fk_cursos_profesores
	FOREIGN KEY (dni_profesor)
	REFERENCES profesores (dni),
ADD CONSTRAINT fk_cursos_tipo_curso
	FOREIGN KEY (tipo_curso)
	REFERENCES tipos_curso (cod_curso);

INSERT INTO empresas
VALUES 
('1', 'Apple', 'C/San Jacinto 31', '971234128'),
('2', 'Microsoft', 'C/Adelfa 27', '658091232'),
('3', 'Muebles Paco', 'C/Málaga 12', '971362720');