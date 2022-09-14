INSERT INTO nivel (nivel_nombre) VALUES ('N1'), ('N2');

INSERT INTO licencia (licencia_nombre) VALUES ('A1'), ('A2'), ('B1'), ('B2'), ('C1'), ('C2');

INSERT INTO modulo (modulo_nombre) VALUES ('ADAPTACION'), ('ETICA'), ('MARCO LEGAL') ;

INSERT INTO curso (curso_nombre, modulo_id, nivel_id) VALUES ('ADAPTACION 1', 1, 1), ('ETICA 1', 2, 1), ('MARCO LEGAL 1', 3, 1);

INSERT INTO curso (curso_nombre, modulo_id, nivel_id) VALUES ('ADAPTACION 2', 1, 2), ('ETICA 2', 2, 2), ('MARCO LEGAL 2', 3, 2);