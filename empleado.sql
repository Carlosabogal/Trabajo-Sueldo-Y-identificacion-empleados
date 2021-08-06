-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-08-2021 a las 19:11:40
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: empleado
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla trabajador
--

CREATE TABLE trabajador (
  documento int(11) NOT NULL,
  nombre varchar(30) NOT NULL,
  apellido varchar(30) NOT NULL,
  sexo varchar(100) NOT NULL,
  Fecha_De_Nacimiento varchar(30) NOT NULL,
  Foto longblob NOT NULL,
  Fecha_De_Ingreso varchar(100) NOT NULL,
  Salario int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla trabajador
--

INSERT INTO trabajador (documento, nombre, apellido, sexo, Fecha_De_Nacimiento, Foto, Fecha_De_Ingreso, Salario) VALUES
(1, 'pepe', 'guayavaz', 'M Y F', '2006-10-12', 0x3132, '2010', 111111111),
(2, 'Carlos David', 'Sabogal Motta', 'M', '2018-07-12', 0x3231, '2015', 234500000);
INSERT INTO trabajador (documento, nombre, apellido, sexo, Fecha_De_Nacimiento, Foto, Fecha_De_Ingreso, Salario) VALUES
INSERT INTO trabajador (documento, nombre, apellido, sexo, Fecha_De_Nacimiento, Foto, Fecha_De_Ingreso, Salario) VALUES
INSERT INTO trabajador (documento, nombre, apellido, sexo, Fecha_De_Nacimiento, Foto, Fecha_De_Ingreso, Salario) VALUES
INSERT INTO trabajador (documento, nombre, apellido, sexo, Fecha_De_Nacimiento, Foto, Fecha_De_Ingreso, Salario) VALUES

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla trabajador
--
ALTER TABLE trabajador
  ADD PRIMARY KEY (documento);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla trabajador
--
ALTER TABLE trabajador
  MODIFY documento int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1000002;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;