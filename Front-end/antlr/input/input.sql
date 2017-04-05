CREATE DATABASE pelos;

ALTER DATABASE pelos RENAME TO popo;

DROP DATABASE popo;

SHOW DATABASES;

USE DATABASE popo;

CREATE TABLE sucursal (
  id int,
  direccion char(40),
  abierta_en date,
  CONSTRAINT pk_sucursal PRIMARY KEY (id),
  CONSTRAINT fk_sucursar FOREIGN KEY (id) REFERENCES patos(id)
)
