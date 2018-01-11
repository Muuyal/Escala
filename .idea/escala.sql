PGDMP     	            
         v            Escala    10.1    10.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            	           1262    16393    Escala    DATABASE     Š   CREATE DATABASE "Escala" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Mexico.1252' LC_CTYPE = 'Spanish_Mexico.1252';
    DROP DATABASE "Escala";
             postgres    false                        2615    16394    Escala    SCHEMA        CREATE SCHEMA "Escala";
    DROP SCHEMA "Escala";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            
           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            Æ            1259    16433 
   passangers    TABLE     Ì  CREATE TABLE passangers (
    id integer NOT NULL,
    "fisrtName" character varying(20),
    "lastName" character varying(20),
    phone character varying(15),
    email character varying(30),
    "addressStreet" character varying(20),
    "addressCity" character varying(20),
    "addressColony" character varying(20),
    "addressPC" character varying(10),
    notes character varying(100),
    "travelId" integer,
    debt integer,
    "userId" integer
);
     DROP TABLE "Escala".passangers;
       Escala         postgres    false    5            É            1259    16448    payments    TABLE     ²   CREATE TABLE payments (
    id integer NOT NULL,
    "userId" integer,
    "travelId" integer,
    payment integer,
    total integer,
    "amountLeft" integer,
    date date
);
    DROP TABLE "Escala".payments;
       Escala         postgres    false    5            Å            1259    16428    staff    TABLE       CREATE TABLE staff (
    id integer NOT NULL,
    "firstName" character varying(20),
    "lastName" character varying(20),
    email character varying(30),
    phone character varying(15),
    address character varying(80),
    salary integer,
    "userId" integer
);
    DROP TABLE "Escala".staff;
       Escala         postgres    false    5            Ç            1259    16438    travel    TABLE     °   CREATE TABLE travel (
    id integer NOT NULL,
    name integer,
    destination integer,
    departure integer,
    deadline integer,
    price "char",
    payments "char"
);
    DROP TABLE "Escala".travel;
       Escala         postgres    false    5            È            1259    16443    user    TABLE     ™   CREATE TABLE "user" (
    id integer NOT NULL,
    "userName" character varying(20),
    password character varying(20),
    rol character varying(5)
);
    DROP TABLE "Escala"."user";
       Escala         postgres    false    5                      0    16433 
   passangers 
   TABLE DATA               ©   COPY passangers (id, "fisrtName", "lastName", phone, email, "addressStreet", "addressCity", "addressColony", "addressPC", notes, "travelId", debt, "userId") FROM stdin;
    Escala       postgres    false    198                    0    16448    payments 
   TABLE DATA               Y   COPY payments (id, "userId", "travelId", payment, total, "amountLeft", date) FROM stdin;
    Escala       postgres    false    201   7                  0    16428    staff 
   TABLE DATA               ^   COPY staff (id, "firstName", "lastName", email, phone, address, salary, "userId") FROM stdin;
    Escala       postgres    false    197   T                 0    16438    travel 
   TABLE DATA               V   COPY travel (id, name, destination, departure, deadline, price, payments) FROM stdin;
    Escala       postgres    false    199   q                 0    16443    user 
   TABLE DATA               8   COPY "user" (id, "userName", password, rol) FROM stdin;
    Escala       postgres    false    200   Ž       €
           2606    16437    passangers passangers_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY passangers
    ADD CONSTRAINT passangers_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY "Escala".passangers DROP CONSTRAINT passangers_pkey;
       Escala         postgres    false    198            †
           2606    16452    payments payments_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY payments
    ADD CONSTRAINT payments_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY "Escala".payments DROP CONSTRAINT payments_pkey;
       Escala         postgres    false    201            ~
           2606    16432    staff staff_pkey 
   CONSTRAINT     G   ALTER TABLE ONLY staff
    ADD CONSTRAINT staff_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY "Escala".staff DROP CONSTRAINT staff_pkey;
       Escala         postgres    false    197            ‚
           2606    16442    travel travel_pkey 
   CONSTRAINT     I   ALTER TABLE ONLY travel
    ADD CONSTRAINT travel_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY "Escala".travel DROP CONSTRAINT travel_pkey;
       Escala         postgres    false    199            „
           2606    16447    user user_pkey 
   CONSTRAINT     G   ALTER TABLE ONLY "user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY "Escala"."user" DROP CONSTRAINT user_pkey;
       Escala         postgres    false    200                  xœ‹Ñãââ Å ©            xœ‹Ñãââ Å ©             xœ‹Ñãââ Å ©            xœ‹Ñãââ Å ©            xœ‹Ñãââ Å ©     