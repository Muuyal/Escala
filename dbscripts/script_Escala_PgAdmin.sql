PGDMP     ;                     v            Escala    10.1    10.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            	           1262    16539    Escala    DATABASE     ä   CREATE DATABASE "Escala" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Mexico.1252' LC_CTYPE = 'Spanish_Mexico.1252';
    DROP DATABASE "Escala";
             postgres    false                        2615    16540    Escala    SCHEMA        CREATE SCHEMA "Escala";
    DROP SCHEMA "Escala";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            
           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            ≈            1259    16541 	   passenger    TABLE     p  CREATE TABLE passenger (
    id integer NOT NULL,
    name character(50) NOT NULL,
    travel character varying(30) NOT NULL,
    phone integer NOT NULL,
    email character varying(50) NOT NULL,
    "addressStreet" character varying(30),
    "addressCity" character(30),
    "addressColony" character(20),
    "addressPC" integer,
    notes character varying(100)
);
    DROP TABLE "Escala".passenger;
       Escala         postgres    false    5            ∆            1259    16544    payment    TABLE     Û   CREATE TABLE payment (
    id integer NOT NULL,
    "user" character varying(20) NOT NULL,
    travel character varying(30) NOT NULL,
    "paymentAmount" integer,
    total integer NOT NULL,
    "amountLeft" integer,
    date date NOT NULL
);
    DROP TABLE "Escala".payment;
       Escala         postgres    false    5            «            1259    16547    staff    TABLE     ,  CREATE TABLE staff (
    id integer NOT NULL,
    name character(50) NOT NULL,
    email character varying(50) NOT NULL,
    phone integer,
    address character varying(90),
    area character(20),
    salary integer NOT NULL,
    "user" character varying(20),
    password character varying(20)
);
    DROP TABLE "Escala".staff;
       Escala         postgres    false    5            »            1259    16550    travel    TABLE     ”   CREATE TABLE travel (
    id integer NOT NULL,
    name character(50) NOT NULL,
    destination character(30) NOT NULL,
    departure date,
    deadline date,
    price integer NOT NULL,
    payments integer
);
    DROP TABLE "Escala".travel;
       Escala         postgres    false    5            …            1259    16553    user    TABLE     ¨   CREATE TABLE "user" (
    id integer NOT NULL,
    "userName" character varying(20) NOT NULL,
    password character varying(20) NOT NULL,
    rol character varying(30)
);
    DROP TABLE "Escala"."user";
       Escala         postgres    false    5                       0    16541 	   passenger 
   TABLE DATA               Å   COPY passenger (id, name, travel, phone, email, "addressStreet", "addressCity", "addressColony", "addressPC", notes) FROM stdin;
    Escala       postgres    false    197                    0    16544    payment 
   TABLE DATA               Z   COPY payment (id, "user", travel, "paymentAmount", total, "amountLeft", date) FROM stdin;
    Escala       postgres    false    198   4                 0    16547    staff 
   TABLE DATA               Y   COPY staff (id, name, email, phone, address, area, salary, "user", password) FROM stdin;
    Escala       postgres    false    199   Q                 0    16550    travel 
   TABLE DATA               V   COPY travel (id, name, destination, departure, deadline, price, payments) FROM stdin;
    Escala       postgres    false    200   n                 0    16553    user 
   TABLE DATA               8   COPY "user" (id, "userName", password, rol) FROM stdin;
    Escala       postgres    false    201   ã       ~
           2606    16557    passenger passenger_pkey 
   CONSTRAINT     O   ALTER TABLE ONLY passenger
    ADD CONSTRAINT passenger_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY "Escala".passenger DROP CONSTRAINT passenger_pkey;
       Escala         postgres    false    197            Ä
           2606    16559    payment payment_pkey 
   CONSTRAINT     K   ALTER TABLE ONLY payment
    ADD CONSTRAINT payment_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY "Escala".payment DROP CONSTRAINT payment_pkey;
       Escala         postgres    false    198            Ç
           2606    16561    staff staff_pkey 
   CONSTRAINT     G   ALTER TABLE ONLY staff
    ADD CONSTRAINT staff_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY "Escala".staff DROP CONSTRAINT staff_pkey;
       Escala         postgres    false    199            Ñ
           2606    16563    travel travel_pkey 
   CONSTRAINT     I   ALTER TABLE ONLY travel
    ADD CONSTRAINT travel_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY "Escala".travel DROP CONSTRAINT travel_pkey;
       Escala         postgres    false    200            Ü
           2606    16565    user user_pkey 
   CONSTRAINT     G   ALTER TABLE ONLY "user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY "Escala"."user" DROP CONSTRAINT user_pkey;
       Escala         postgres    false    201                   xúã—„‚‚ ≈ ©            xúã—„‚‚ ≈ ©            xúã—„‚‚ ≈ ©            xúã—„‚‚ ≈ ©            xúã—„‚‚ ≈ ©     