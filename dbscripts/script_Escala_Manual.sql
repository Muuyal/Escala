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
    phone integer NOT NULL,
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
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
    date date NOT NULL,
    CONSTRAINT payment_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "Escala".payment
    OWNER to postgres;

--staff
DROP TABLE "Escala".staff;

CREATE TABLE "Escala".staff
(
    id integer NOT NULL,
    name character(50) COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
    phone integer,
    address character varying(90) COLLATE pg_catalog."default",
    area character(20) COLLATE pg_catalog."default",
    salary integer NOT NULL,
    "user" character varying(20) COLLATE pg_catalog."default",
    password character varying(20) COLLATE pg_catalog."default",
    CONSTRAINT staff_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "Escala".staff
    OWNER to postgres;

--travel
DROP TABLE "Escala".travel;

CREATE TABLE "Escala".travel
(
    id integer NOT NULL,
    name character(30) COLLATE pg_catalog."default" NOT NULL,
    destination character(50) COLLATE pg_catalog."default" NOT NULL,
    departure date,
    deadline date,
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
DROP TABLE "Escala"."user";

CREATE TABLE "Escala"."user"
(
    id integer NOT NULL,
    "userName" character varying(20) COLLATE pg_catalog."default" NOT NULL,
    password character varying(20) COLLATE pg_catalog."default" NOT NULL,
    rol character varying(30) COLLATE pg_catalog."default",
    CONSTRAINT user_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "Escala"."user"
    OWNER to postgres;

