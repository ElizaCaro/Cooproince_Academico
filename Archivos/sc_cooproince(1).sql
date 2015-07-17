-- phpMyAdmin SQL Dump
-- version 4.4.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 17, 2015 at 06:58 am
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sc_cooproince`
--

-- --------------------------------------------------------

--
-- Table structure for table `ALMACEN`
--

CREATE TABLE IF NOT EXISTS `ALMACEN` (
  `id_almacen` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_medidas` int(11) NOT NULL,
  `cantidad_prod` float NOT NULL,
  `fecha_modificacion` date NOT NULL,
  `hora_modificacion` time NOT NULL,
  `unidades_prod` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ANIMALES_GRUPALES`
--

CREATE TABLE IF NOT EXISTS `ANIMALES_GRUPALES` (
  `id_animalesGrup` int(11) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `fecha_ultima_act` date NOT NULL,
  `pesaje_act` float NOT NULL,
  `precio_unitario_act` float NOT NULL,
  `total_precio_unit` float NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ANIMALES_GRUPALES`
--

INSERT INTO `ANIMALES_GRUPALES` (`id_animalesGrup`, `descripcion`, `id_categoria`, `Cantidad`, `fecha_ultima_act`, `pesaje_act`, `precio_unitario_act`, `total_precio_unit`) VALUES
(2, 'Prueba1', 1, 0, '0000-00-00', 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `ANIMALES_INDIVIDUALES`
--

CREATE TABLE IF NOT EXISTS `ANIMALES_INDIVIDUALES` (
  `id_animalesIndiv` int(11) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `id_estatus` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `codigo_animal` varchar(45) NOT NULL,
  `fecha_Nac` date NOT NULL,
  `fecha_def` date DEFAULT NULL,
  `peso` float NOT NULL,
  `Altura` float NOT NULL,
  `fecha_ultima_act` date DEFAULT NULL,
  `Sexo` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ANIMALES_INDIVIDUALES`
--

INSERT INTO `ANIMALES_INDIVIDUALES` (`id_animalesIndiv`, `descripcion`, `id_estatus`, `id_categoria`, `Nombre`, `codigo_animal`, `fecha_Nac`, `fecha_def`, `peso`, `Altura`, `fecha_ultima_act`, `Sexo`) VALUES
(2, 'Prueba2', 1, 1, '', '', '0000-00-00', NULL, 0, 0, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `CATEGORIA`
--

CREATE TABLE IF NOT EXISTS `CATEGORIA` (
  `id_categoria` int(11) NOT NULL,
  `nb_categoria` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `CATEGORIA`
--

INSERT INTO `CATEGORIA` (`id_categoria`, `nb_categoria`) VALUES
(1, 'Cate1'),
(2, 'cate1');

-- --------------------------------------------------------

--
-- Table structure for table `CATEGORIA_PRODUCTO`
--

CREATE TABLE IF NOT EXISTS `CATEGORIA_PRODUCTO` (
  `id_categoriaProd` int(11) NOT NULL,
  `nb_categoriaProd` varchar(25) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `CATEGORIA_PRODUCTO`
--

INSERT INTO `CATEGORIA_PRODUCTO` (`id_categoriaProd`, `nb_categoriaProd`) VALUES
(1, 'Ventas');

-- --------------------------------------------------------

--
-- Table structure for table `DETALLE_INCIDENCIA`
--

CREATE TABLE IF NOT EXISTS `DETALLE_INCIDENCIA` (
  `id_detalle_inc` int(11) NOT NULL,
  `observacion` varchar(45) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `id_incidencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ESTATUS`
--

CREATE TABLE IF NOT EXISTS `ESTATUS` (
  `id_estatus` int(11) NOT NULL,
  `nb_estatus` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ESTATUS`
--

INSERT INTO `ESTATUS` (`id_estatus`, `nb_estatus`) VALUES
(1, 'Vivo'),
(2, 'Muerto');

-- --------------------------------------------------------

--
-- Table structure for table `INCIDENCIA`
--

CREATE TABLE IF NOT EXISTS `INCIDENCIA` (
  `id_incidencia` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_tipoIncidencia` int(11) NOT NULL,
  `id_animalesIndiv` int(11) DEFAULT NULL,
  `id_animalesGrup` int(11) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `control_incidencia` varchar(45) NOT NULL,
  `fecha_incidencia` date NOT NULL,
  `hora_incidencia` time NOT NULL,
  `precio` float NOT NULL,
  `descripcion` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `MEDIDAS`
--

CREATE TABLE IF NOT EXISTS `MEDIDAS` (
  `id_medidas` int(11) NOT NULL,
  `medida` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `MEDIDAS`
--

INSERT INTO `MEDIDAS` (`id_medidas`, `medida`) VALUES
(1, 'Grs'),
(2, 'Cms'),
(3, 'Pies');

-- --------------------------------------------------------

--
-- Table structure for table `PARENTESCO`
--

CREATE TABLE IF NOT EXISTS `PARENTESCO` (
  `id_parentesco` int(11) NOT NULL,
  `id_animalesIndiv` int(11) NOT NULL,
  `id_animalesIndiv1` int(11) NOT NULL,
  `id_tipoParentesco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `PRODUCCION`
--

CREATE TABLE IF NOT EXISTS `PRODUCCION` (
  `id_produccion` int(11) NOT NULL,
  `nb_produccion` varchar(45) NOT NULL,
  `id_tipoProduccion` int(11) NOT NULL,
  `id_animalesIndiv` int(11) DEFAULT NULL,
  `id_animalesGrup` int(11) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `Fecha_registro` date NOT NULL,
  `duracion_actividad` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `PRODUCCION`
--

INSERT INTO `PRODUCCION` (`id_produccion`, `nb_produccion`, `id_tipoProduccion`, `id_animalesIndiv`, `id_animalesGrup`, `id_usuario`, `Fecha_registro`, `duracion_actividad`) VALUES
(5, 'prod', 2, 0, 0, 1, '2015-07-16', 100);

-- --------------------------------------------------------

--
-- Table structure for table `PRODUCTO`
--

CREATE TABLE IF NOT EXISTS `PRODUCTO` (
  `id_producto` int(11) NOT NULL,
  `nb_producto` varchar(45) NOT NULL,
  `cod_producto` varchar(20) NOT NULL,
  `id_categoriaProd` int(11) NOT NULL,
  `id_medidas` int(11) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `precio_actual` float DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `PRODUCTO`
--

INSERT INTO `PRODUCTO` (`id_producto`, `nb_producto`, `cod_producto`, `id_categoriaProd`, `id_medidas`, `descripcion`, `precio_actual`, `cantidad`) VALUES
(1, 'nom22', 'c01', 1, 2, 'hola', 1200, 100);

-- --------------------------------------------------------

--
-- Table structure for table `PRODUCTO_ALMACEN`
--

CREATE TABLE IF NOT EXISTS `PRODUCTO_ALMACEN` (
  `id_ProductoAlmacen` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_almacen` int(11) NOT NULL,
  `id_produccion` int(11) NOT NULL,
  `id_incidencia` int(11) NOT NULL,
  `operacion` tinyint(1) NOT NULL,
  `fecha_modificacion` date NOT NULL,
  `hora_modificacion` time NOT NULL,
  `cantidad` int(6) NOT NULL,
  `cant_unidades` int(11) NOT NULL,
  `id_medidas` int(11) NOT NULL,
  `precio_unidad` float NOT NULL,
  `total_precio_unidad` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ROL`
--

CREATE TABLE IF NOT EXISTS `ROL` (
  `id_rol` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ROL`
--

INSERT INTO `ROL` (`id_rol`, `nombre`, `descripcion`) VALUES
(1, 'Administrador', 'Lo puede todo'),
(2, 'Socio', 'usa la aplicacion');

-- --------------------------------------------------------

--
-- Table structure for table `TIPO_INCIDENCIA`
--

CREATE TABLE IF NOT EXISTS `TIPO_INCIDENCIA` (
  `id_tipoIncidencia` int(11) NOT NULL,
  `nb_tipoIncidencia` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `TIPO_INCIDENCIA`
--

INSERT INTO `TIPO_INCIDENCIA` (`id_tipoIncidencia`, `nb_tipoIncidencia`) VALUES
(1, 'Emergenccias'),
(2, 'baños'),
(3, 'Heridas');

-- --------------------------------------------------------

--
-- Table structure for table `TIPO_MEDIDA`
--

CREATE TABLE IF NOT EXISTS `TIPO_MEDIDA` (
  `id_tipo_medida` int(11) NOT NULL,
  `nb_tipo_medida` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `TIPO_PARENTESCO`
--

CREATE TABLE IF NOT EXISTS `TIPO_PARENTESCO` (
  `id_tipoParentesco` int(11) NOT NULL,
  `nb_tipoParentesco` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `TIPO_PRODUCCION`
--

CREATE TABLE IF NOT EXISTS `TIPO_PRODUCCION` (
  `id_tipoProduccion` int(11) NOT NULL,
  `nb_tipoProduccion` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `TIPO_PRODUCCION`
--

INSERT INTO `TIPO_PRODUCCION` (`id_tipoProduccion`, `nb_tipoProduccion`) VALUES
(1, 'Ordeñados'),
(2, 'Sembrado'),
(5, 'rebaño'),
(6, 'Puercos'),
(7, 'Vacunas');

-- --------------------------------------------------------

--
-- Table structure for table `USUARIO`
--

CREATE TABLE IF NOT EXISTS `USUARIO` (
  `id_usuario` int(11) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `primer_nombre` varchar(45) NOT NULL,
  `segundo_nombre` varchar(45) DEFAULT NULL,
  `primer_apellido` varchar(45) NOT NULL,
  `segundo_apellido` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasena` varchar(65) NOT NULL,
  `crear_usuario` tinyint(1) DEFAULT NULL,
  `crear_configuracion` tinyint(1) DEFAULT NULL,
  `id_rol` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `USUARIO`
--

INSERT INTO `USUARIO` (`id_usuario`, `cedula`, `primer_nombre`, `segundo_nombre`, `primer_apellido`, `segundo_apellido`, `email`, `usuario`, `contrasena`, `crear_usuario`, `crear_configuracion`, `id_rol`) VALUES
(2, '18878021', 'Felipe', 'Feli', 'Rivero', 'Rubiano', 'darkjaegerz20@gmail.com', 'felipe.rivero', '12345', NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `USUARIO_INCIDENCIA`
--

CREATE TABLE IF NOT EXISTS `USUARIO_INCIDENCIA` (
  `id_usuarioIncid` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_produccion` int(11) DEFAULT NULL,
  `id_incidencia` int(11) DEFAULT NULL,
  `observacion` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ALMACEN`
--
ALTER TABLE `ALMACEN`
  ADD PRIMARY KEY (`id_almacen`),
  ADD KEY `fk_PRODUCTO_id_producto_idx` (`id_producto`),
  ADD KEY `fk_ALMACEN_MEDIDAS1_idx` (`id_medidas`);

--
-- Indexes for table `ANIMALES_GRUPALES`
--
ALTER TABLE `ANIMALES_GRUPALES`
  ADD PRIMARY KEY (`id_animalesGrup`),
  ADD KEY `fk_CATEGORIA_id_categoria_idx` (`id_categoria`);

--
-- Indexes for table `ANIMALES_INDIVIDUALES`
--
ALTER TABLE `ANIMALES_INDIVIDUALES`
  ADD PRIMARY KEY (`id_animalesIndiv`),
  ADD UNIQUE KEY `codigo_animal_UNIQUE` (`codigo_animal`),
  ADD KEY `fk_ESTATUS_id_estatus_idx` (`id_estatus`),
  ADD KEY `fk_CATEGORIA_id_categoria_idx` (`id_categoria`);

--
-- Indexes for table `CATEGORIA`
--
ALTER TABLE `CATEGORIA`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indexes for table `CATEGORIA_PRODUCTO`
--
ALTER TABLE `CATEGORIA_PRODUCTO`
  ADD PRIMARY KEY (`id_categoriaProd`);

--
-- Indexes for table `DETALLE_INCIDENCIA`
--
ALTER TABLE `DETALLE_INCIDENCIA`
  ADD PRIMARY KEY (`id_detalle_inc`),
  ADD KEY `fk_INCIDENCIA_id_incidencia_idx` (`id_incidencia`);

--
-- Indexes for table `ESTATUS`
--
ALTER TABLE `ESTATUS`
  ADD PRIMARY KEY (`id_estatus`);

--
-- Indexes for table `INCIDENCIA`
--
ALTER TABLE `INCIDENCIA`
  ADD PRIMARY KEY (`id_incidencia`),
  ADD UNIQUE KEY `control_incidencia_UNIQUE` (`control_incidencia`),
  ADD KEY `fk_TIPO_INCIDENCIA_id_tipoIncidencia_idx` (`id_tipoIncidencia`),
  ADD KEY `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv_idx` (`id_animalesIndiv`),
  ADD KEY `fk_ANIMALES_GRUPALES_id_animalesGrup_idx` (`id_animalesGrup`),
  ADD KEY `fk_USUARIO_id_usuario_idx` (`id_usuario`),
  ADD KEY `fk_PRODUCTO_id_producto_idx` (`id_producto`);

--
-- Indexes for table `MEDIDAS`
--
ALTER TABLE `MEDIDAS`
  ADD PRIMARY KEY (`id_medidas`);

--
-- Indexes for table `PARENTESCO`
--
ALTER TABLE `PARENTESCO`
  ADD PRIMARY KEY (`id_parentesco`),
  ADD KEY `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv_idx` (`id_animalesIndiv`),
  ADD KEY `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv1_idx` (`id_animalesIndiv1`),
  ADD KEY `fk_TIPO_PARENTESCO_id_tipoParentesco_idx` (`id_tipoParentesco`);

--
-- Indexes for table `PRODUCCION`
--
ALTER TABLE `PRODUCCION`
  ADD PRIMARY KEY (`id_produccion`),
  ADD KEY `fk_TIPO_PRODUCCION_id_tipoProduccion_idx` (`id_tipoProduccion`),
  ADD KEY `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv_idx` (`id_animalesIndiv`),
  ADD KEY `fk_ANIMALES_GRUPALES_id_animalesGrup_idx` (`id_animalesGrup`),
  ADD KEY `fk_USUARIO_id_usuario_idx` (`id_usuario`);

--
-- Indexes for table `PRODUCTO`
--
ALTER TABLE `PRODUCTO`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `cod_producto_UNIQUE` (`cod_producto`),
  ADD KEY `fk_CATEGORIA_PRODUCTO_id_categoriaProd_idx` (`id_categoriaProd`),
  ADD KEY `fk_MEDIDAS_id_medidas_idx` (`id_medidas`);

--
-- Indexes for table `PRODUCTO_ALMACEN`
--
ALTER TABLE `PRODUCTO_ALMACEN`
  ADD PRIMARY KEY (`id_ProductoAlmacen`),
  ADD KEY `fk_PRODUCTO_id_producto_idx` (`id_producto`),
  ADD KEY `fk_ALMACEN_id_almacen_idx` (`id_almacen`),
  ADD KEY `fk_PRODUCCION_id_produccion_idx` (`id_produccion`),
  ADD KEY `fk_INCIDENCIA_id_incidencia_idx` (`id_incidencia`),
  ADD KEY `fk_PRODUCTO_ALMACEN_MEDIDAS1_idx` (`id_medidas`);

--
-- Indexes for table `ROL`
--
ALTER TABLE `ROL`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indexes for table `TIPO_INCIDENCIA`
--
ALTER TABLE `TIPO_INCIDENCIA`
  ADD PRIMARY KEY (`id_tipoIncidencia`);

--
-- Indexes for table `TIPO_MEDIDA`
--
ALTER TABLE `TIPO_MEDIDA`
  ADD PRIMARY KEY (`id_tipo_medida`);

--
-- Indexes for table `TIPO_PARENTESCO`
--
ALTER TABLE `TIPO_PARENTESCO`
  ADD PRIMARY KEY (`id_tipoParentesco`);

--
-- Indexes for table `TIPO_PRODUCCION`
--
ALTER TABLE `TIPO_PRODUCCION`
  ADD PRIMARY KEY (`id_tipoProduccion`);

--
-- Indexes for table `USUARIO`
--
ALTER TABLE `USUARIO`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `usuario_UNIQUE` (`usuario`),
  ADD KEY `fk_USUARIO_ROL1_idx` (`id_rol`);

--
-- Indexes for table `USUARIO_INCIDENCIA`
--
ALTER TABLE `USUARIO_INCIDENCIA`
  ADD PRIMARY KEY (`id_usuarioIncid`),
  ADD KEY `fk_USUARIO_id_usuario_idx` (`id_usuario`),
  ADD KEY `fk_PRODUCCION_id_produccion_idx` (`id_produccion`),
  ADD KEY `fk_INCIDENCIA_id_incidencia_idx` (`id_incidencia`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ALMACEN`
--
ALTER TABLE `ALMACEN`
  MODIFY `id_almacen` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ANIMALES_GRUPALES`
--
ALTER TABLE `ANIMALES_GRUPALES`
  MODIFY `id_animalesGrup` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `ANIMALES_INDIVIDUALES`
--
ALTER TABLE `ANIMALES_INDIVIDUALES`
  MODIFY `id_animalesIndiv` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `CATEGORIA`
--
ALTER TABLE `CATEGORIA`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `CATEGORIA_PRODUCTO`
--
ALTER TABLE `CATEGORIA_PRODUCTO`
  MODIFY `id_categoriaProd` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `ESTATUS`
--
ALTER TABLE `ESTATUS`
  MODIFY `id_estatus` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `INCIDENCIA`
--
ALTER TABLE `INCIDENCIA`
  MODIFY `id_incidencia` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `MEDIDAS`
--
ALTER TABLE `MEDIDAS`
  MODIFY `id_medidas` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `PARENTESCO`
--
ALTER TABLE `PARENTESCO`
  MODIFY `id_parentesco` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `PRODUCCION`
--
ALTER TABLE `PRODUCCION`
  MODIFY `id_produccion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `PRODUCTO`
--
ALTER TABLE `PRODUCTO`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `PRODUCTO_ALMACEN`
--
ALTER TABLE `PRODUCTO_ALMACEN`
  MODIFY `id_ProductoAlmacen` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ROL`
--
ALTER TABLE `ROL`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `TIPO_INCIDENCIA`
--
ALTER TABLE `TIPO_INCIDENCIA`
  MODIFY `id_tipoIncidencia` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `TIPO_PARENTESCO`
--
ALTER TABLE `TIPO_PARENTESCO`
  MODIFY `id_tipoParentesco` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `TIPO_PRODUCCION`
--
ALTER TABLE `TIPO_PRODUCCION`
  MODIFY `id_tipoProduccion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `USUARIO`
--
ALTER TABLE `USUARIO`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `USUARIO_INCIDENCIA`
--
ALTER TABLE `USUARIO_INCIDENCIA`
  MODIFY `id_usuarioIncid` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `ALMACEN`
--
ALTER TABLE `ALMACEN`
  ADD CONSTRAINT `fk_ALMACEN_MEDIDAS1` FOREIGN KEY (`id_medidas`) REFERENCES `MEDIDAS` (`id_medidas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ALMACEN_PRODUCTO1` FOREIGN KEY (`id_producto`) REFERENCES `PRODUCTO` (`id_producto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ANIMALES_GRUPALES`
--
ALTER TABLE `ANIMALES_GRUPALES`
  ADD CONSTRAINT `fk_ANIMALES_GRUPALES_CATEGORIA1` FOREIGN KEY (`id_categoria`) REFERENCES `CATEGORIA` (`id_categoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `ANIMALES_INDIVIDUALES`
--
ALTER TABLE `ANIMALES_INDIVIDUALES`
  ADD CONSTRAINT `fk_ANIMALES_INDIVIDUALES_CATEGORIA1` FOREIGN KEY (`id_categoria`) REFERENCES `CATEGORIA` (`id_categoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ANIMALES_INDIVIDUALES_ESTATUS1` FOREIGN KEY (`id_estatus`) REFERENCES `ESTATUS` (`id_estatus`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `DETALLE_INCIDENCIA`
--
ALTER TABLE `DETALLE_INCIDENCIA`
  ADD CONSTRAINT `fk_Detalle_Incidencia_INCIDENCIA1` FOREIGN KEY (`id_incidencia`) REFERENCES `INCIDENCIA` (`id_incidencia`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `INCIDENCIA`
--
ALTER TABLE `INCIDENCIA`
  ADD CONSTRAINT `fk_INCIDENCIA_ANIMALES_GRUPALES1` FOREIGN KEY (`id_animalesGrup`) REFERENCES `ANIMALES_GRUPALES` (`id_animalesGrup`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_INCIDENCIA_ANIMALES_INDIVIDUALES1` FOREIGN KEY (`id_animalesIndiv`) REFERENCES `ANIMALES_INDIVIDUALES` (`id_animalesIndiv`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_INCIDENCIA_PRODUCTO1` FOREIGN KEY (`id_producto`) REFERENCES `PRODUCTO` (`id_producto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_INCIDENCIA_TIPO_INCIDENCIA1` FOREIGN KEY (`id_tipoIncidencia`) REFERENCES `TIPO_INCIDENCIA` (`id_tipoIncidencia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_INCIDENCIA_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `PARENTESCO`
--
ALTER TABLE `PARENTESCO`
  ADD CONSTRAINT `fk_PARENTESCO_ANIMALES_INDIVIDUALES1` FOREIGN KEY (`id_animalesIndiv`) REFERENCES `ANIMALES_INDIVIDUALES` (`id_animalesIndiv`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PARENTESCO_ANIMALES_INDIVIDUALES2` FOREIGN KEY (`id_animalesIndiv1`) REFERENCES `ANIMALES_INDIVIDUALES` (`id_animalesIndiv`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PARENTESCO_TIPO_PARENTESCO1` FOREIGN KEY (`id_tipoParentesco`) REFERENCES `TIPO_PARENTESCO` (`id_tipoParentesco`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `PRODUCTO`
--
ALTER TABLE `PRODUCTO`
  ADD CONSTRAINT `fk_PRODUCTO_CATEGORIA_PRODUCTO` FOREIGN KEY (`id_categoriaProd`) REFERENCES `CATEGORIA_PRODUCTO` (`id_categoriaProd`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PRODUCTO_MEDIDAS1` FOREIGN KEY (`id_medidas`) REFERENCES `MEDIDAS` (`id_medidas`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `PRODUCTO_ALMACEN`
--
ALTER TABLE `PRODUCTO_ALMACEN`
  ADD CONSTRAINT `fk_PRODUCTO_ALMACEN_ALMACEN1` FOREIGN KEY (`id_almacen`) REFERENCES `ALMACEN` (`id_almacen`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PRODUCTO_ALMACEN_INCIDENCIA1` FOREIGN KEY (`id_incidencia`) REFERENCES `INCIDENCIA` (`id_incidencia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PRODUCTO_ALMACEN_MEDIDAS1` FOREIGN KEY (`id_medidas`) REFERENCES `MEDIDAS` (`id_medidas`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PRODUCTO_ALMACEN_PRODUCCION1` FOREIGN KEY (`id_produccion`) REFERENCES `PRODUCCION` (`id_produccion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PRODUCTO_ALMACEN_PRODUCTO1` FOREIGN KEY (`id_producto`) REFERENCES `PRODUCTO` (`id_producto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `USUARIO`
--
ALTER TABLE `USUARIO`
  ADD CONSTRAINT `fk_USUARIO_ROL1` FOREIGN KEY (`id_rol`) REFERENCES `ROL` (`id_rol`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `USUARIO_INCIDENCIA`
--
ALTER TABLE `USUARIO_INCIDENCIA`
  ADD CONSTRAINT `fk_USUARIO_INCIDENCIA_INCIDENCIA1` FOREIGN KEY (`id_incidencia`) REFERENCES `INCIDENCIA` (`id_incidencia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_USUARIO_INCIDENCIA_PRODUCCION1` FOREIGN KEY (`id_produccion`) REFERENCES `PRODUCCION` (`id_produccion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_USUARIO_INCIDENCIA_USUARIO1` FOREIGN KEY (`id_usuario`) REFERENCES `USUARIO` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
