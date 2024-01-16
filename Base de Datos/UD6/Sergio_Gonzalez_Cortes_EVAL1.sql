CREATE TABLE docentes (
	dni				VARCHAR(10),
	nombre			VARCHAR(150) NOT NULL,
	telefono		VARCHAR(12),
	anio_ingreso	INTEGER NOT NULL,
	CONSTRAINT pk_docentes
		PRIMARY KEY (dni)
);

CREATE TABLE actividades (
	id_act		SERIAL,
	nombre		VARCHAR(50),
	duracion	INTEGER,
	CONSTRAINT pk_actividades
		PRIMARY KEY (id_act)
);

CREATE TABLE alumnos (
	cod_alumno		INTEGER,
	nombre			VARCHAR(150) NOT NULL,
	telefono		VARCHAR(12),
	nivel			VARCHAR(7) NOT NULL,
	CONSTRAINT pk_alumnos
		PRIMARY KEY (cod_alumno)
);

CREATE TABLE asignacion_act (
	id_doc		VARCHAR(10),
	id_act		INTEGER,
	dia_semana	INTEGER,
	hora		INTEGER,
	CONSTRAINT pk_asignacion_act
		PRIMARY KEY (id_doc, id_act, dia_semana, hora)
);

CREATE TABLE asistencia_act (
	id_alumn	INTEGER UNIQUE,
	id_act		INTEGER,
	id_doc		VARCHAR(10) NOT NULL,
	CONSTRAINT pk_asistencia_act
		PRIMARY KEY (id_alumn, id_act)
);

ALTER TABLE asignacion_act
ADD CONSTRAINT fk_asignacion_act_docentes
	FOREIGN KEY (id_doc)
	REFERENCES docentes (dni),
ADD CONSTRAINT fk_asignacion_act_actividades
	FOREIGN KEY (id_act)
	REFERENCES actividades(id_act);

ALTER TABLE asistencia_act
ADD CONSTRAINT fk_asistencia_act_alumnos
	FOREIGN KEY (id_alumn)
	REFERENCES alumnos (cod_alumno),
ADD CONSTRAINT fk_asistencia_act_actividades
	FOREIGN KEY (id_act)
	REFERENCES actividades(id_act),
ADD CONSTRAINT fk_asistencia_act_docentes
	FOREIGN KEY (id_doc)
	REFERENCES docentes (dni);