--Borrar y crear la BD
DROP DATABASE Escala;
CREATE DATABASE Escala;
 WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Mexico.1252'
    LC_CTYPE = 'Spanish_Mexico.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

--Borrar y crear el schema de Escala
DROP SCHEMA "Escala" ;
CREATE SCHEMA "Escala"
    AUTHORIZATION postgres;

--Tablas
--passenger

DROP TABLE "Escala".passenger;

CREATE TABLE "Escala".passenger
(
    id integer NOT NULL,
    name character(50) COLLATE pg_catalog."default" NOT NULL,
    travel character varying(30) COLLATE pg_catalog."default" NOT NULL,
    phone character varying(10) COLLATE pg_catalog."default" NOT NULL,
    "eMail" character varying(50) COLLATE pg_catalog."default" NOT NULL,
    "addressStreet" character varying(30) COLLATE pg_catalog."default",
    "addressCity" character(30) COLLATE pg_catalog."default",
    "addressColony" character(20) COLLATE pg_catalog."default",
    "addressPC" integer,
    notes character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT passenger_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "Escala".passenger
    OWNER to postgres;

--payment

DROP TABLE "Escala".payment;

CREATE TABLE "Escala".payment
(
    id integer NOT NULL,
    "user" character varying(20) COLLATE pg_catalog."default" NOT NULL,
    travel character varying(30) COLLATE pg_catalog."default" NOT NULL,
    "paymentAmount" integer,
    total integer NOT NULL,
    "amountLeft" integer,
    date character varying(10) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT payment_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "Escala".payment
    OWNER to postgres;

--staff



--travel

DROP TABLE "Escala".travel;

CREATE TABLE "Escala".travel
(
    id integer NOT NULL,
    name character(30) COLLATE pg_catalog."default" NOT NULL,
    destination character(50) COLLATE pg_catalog."default" NOT NULL,
    departure character varying(10) COLLATE pg_catalog."default", --date,
    deadline character varying(10) COLLATE pg_catalog."default", -- date,
    price integer NOT NULL,
    payments integer,
    CONSTRAINT travel_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "Escala".travel
    OWNER to postgres;

--user

