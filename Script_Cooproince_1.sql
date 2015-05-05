SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `sc_cooproince` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `sc_cooproince` ;

-- -----------------------------------------------------
-- Table `sc_cooproince`.`CATEGORIA_PRODUCTO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`CATEGORIA_PRODUCTO` (
  `id_categoriaProd` INT NOT NULL AUTO_INCREMENT,
  `nb_categoriaProd` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id_categoriaProd`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`MEDIDAS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`MEDIDAS` (
  `id_medidas` INT NOT NULL AUTO_INCREMENT,
  `medida` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_medidas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`PRODUCTO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`PRODUCTO` (
  `id_producto` INT NOT NULL AUTO_INCREMENT,
  `nb_producto` VARCHAR(45) NOT NULL,
  `cod_producto` VARCHAR(20) NOT NULL,
  `id_categoriaProd` INT NOT NULL,
  `id_medidas` INT NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  `precio_actual` FLOAT NULL,
  PRIMARY KEY (`id_producto`),
  INDEX `fk_CATEGORIA_PRODUCTO_id_categoriaProd_idx` (`id_categoriaProd` ASC),
  INDEX `fk_MEDIDAS_id_medidas_idx` (`id_medidas` ASC),
  UNIQUE INDEX `cod_producto_UNIQUE` (`cod_producto` ASC),
  CONSTRAINT `fk_PRODUCTO_CATEGORIA_PRODUCTO`
    FOREIGN KEY (`id_categoriaProd`)
    REFERENCES `sc_cooproince`.`CATEGORIA_PRODUCTO` (`id_categoriaProd`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCTO_MEDIDAS1`
    FOREIGN KEY (`id_medidas`)
    REFERENCES `sc_cooproince`.`MEDIDAS` (`id_medidas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`ALMACEN`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`ALMACEN` (
  `id_almacen` INT NOT NULL AUTO_INCREMENT,
  `id_producto` INT NOT NULL,
  `id_medidas` INT NOT NULL,
  `cantidad_prod` FLOAT NOT NULL,
  `fecha_modificacion` DATE NOT NULL,
  `hora_modificacion` TIME NOT NULL,
  `unidades_prod` INT NULL,
  PRIMARY KEY (`id_almacen`),
  INDEX `fk_PRODUCTO_id_producto_idx` (`id_producto` ASC),
  INDEX `fk_ALMACEN_MEDIDAS1_idx` (`id_medidas` ASC),
  CONSTRAINT `fk_ALMACEN_PRODUCTO1`
    FOREIGN KEY (`id_producto`)
    REFERENCES `sc_cooproince`.`PRODUCTO` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ALMACEN_MEDIDAS1`
    FOREIGN KEY (`id_medidas`)
    REFERENCES `sc_cooproince`.`MEDIDAS` (`id_medidas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`TIPO_PRODUCCION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`TIPO_PRODUCCION` (
  `id_tipoProduccion` INT NOT NULL AUTO_INCREMENT,
  `nb_tipoProduccion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tipoProduccion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`ESTATUS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`ESTATUS` (
  `id_estatus` INT NOT NULL AUTO_INCREMENT,
  `nb_estatus` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_estatus`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`CATEGORIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`CATEGORIA` (
  `id_categoria` INT NOT NULL AUTO_INCREMENT,
  `nb_categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`ANIMALES_INDIVIDUALES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`ANIMALES_INDIVIDUALES` (
  `id_animalesIndiv` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `id_estatus` INT NOT NULL,
  `id_categoria` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `codigo_animal` VARCHAR(45) NOT NULL,
  `fecha_Nac` DATE NOT NULL,
  `fecha_def` DATE NULL,
  `peso` FLOAT NOT NULL,
  `Altura` FLOAT NOT NULL,
  `fecha_ultima_act` DATE NULL,
  `Sexo` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id_animalesIndiv`),
  INDEX `fk_ESTATUS_id_estatus_idx` (`id_estatus` ASC),
  INDEX `fk_CATEGORIA_id_categoria_idx` (`id_categoria` ASC),
  UNIQUE INDEX `codigo_animal_UNIQUE` (`codigo_animal` ASC),
  CONSTRAINT `fk_ANIMALES_INDIVIDUALES_ESTATUS1`
    FOREIGN KEY (`id_estatus`)
    REFERENCES `sc_cooproince`.`ESTATUS` (`id_estatus`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ANIMALES_INDIVIDUALES_CATEGORIA1`
    FOREIGN KEY (`id_categoria`)
    REFERENCES `sc_cooproince`.`CATEGORIA` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`ANIMALES_GRUPALES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`ANIMALES_GRUPALES` (
  `id_animalesGrup` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL,
  `id_categoria` INT NOT NULL,
  `Cantidad` INT NOT NULL,
  `fecha_ultima_act` DATE NOT NULL,
  `pesaje_act` FLOAT NOT NULL,
  `precio_unitario_act` FLOAT NOT NULL,
  `total_precio_unit` FLOAT NOT NULL,
  PRIMARY KEY (`id_animalesGrup`),
  INDEX `fk_CATEGORIA_id_categoria_idx` (`id_categoria` ASC),
  CONSTRAINT `fk_ANIMALES_GRUPALES_CATEGORIA1`
    FOREIGN KEY (`id_categoria`)
    REFERENCES `sc_cooproince`.`CATEGORIA` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`USUARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`USUARIO` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `cedula` VARCHAR(45) NOT NULL,
  `primer_nombre` VARCHAR(45) NOT NULL,
  `segundo_nombre` VARCHAR(45) NULL,
  `primer_apellido` VARCHAR(45) NOT NULL,
  `segundo_apellido` VARCHAR(45) NOT NULL,
  `e-mail` VARCHAR(45) NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `contrasena` VARCHAR(65) NOT NULL,
  `crear_usuario` TINYINT(1) NULL,
  `crear_configuracion` TINYINT(1) NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE INDEX `usuario_UNIQUE` (`usuario` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`PRODUCCION`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`PRODUCCION` (
  `id_produccion` INT NOT NULL AUTO_INCREMENT,
  `nb_produccion` VARCHAR(45) NOT NULL,
  `id_tipoProduccion` INT NOT NULL,
  `id_animalesIndiv` INT NOT NULL,
  `id_animalesGrup` INT NOT NULL,
  `id_usuario` INT NOT NULL,
  `Fecha_registro` DATE NOT NULL,
  `duracion_actividad` INT NULL,
  PRIMARY KEY (`id_produccion`),
  INDEX `fk_TIPO_PRODUCCION_id_tipoProduccion_idx` (`id_tipoProduccion` ASC),
  INDEX `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv_idx` (`id_animalesIndiv` ASC),
  INDEX `fk_ANIMALES_GRUPALES_id_animalesGrup_idx` (`id_animalesGrup` ASC),
  INDEX `fk_USUARIO_id_usuario_idx` (`id_usuario` ASC),
  CONSTRAINT `fk_PRODUCCION_TIPO_PRODUCCION1`
    FOREIGN KEY (`id_tipoProduccion`)
    REFERENCES `sc_cooproince`.`TIPO_PRODUCCION` (`id_tipoProduccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCCION_ANIMALES_INDIVIDUALES1`
    FOREIGN KEY (`id_animalesIndiv`)
    REFERENCES `sc_cooproince`.`ANIMALES_INDIVIDUALES` (`id_animalesIndiv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCCION_ANIMALES_GRUPALES1`
    FOREIGN KEY (`id_animalesGrup`)
    REFERENCES `sc_cooproince`.`ANIMALES_GRUPALES` (`id_animalesGrup`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCCION_USUARIO1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `sc_cooproince`.`USUARIO` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`TIPO_INCIDENCIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`TIPO_INCIDENCIA` (
  `id_tipoIncidencia` INT NOT NULL AUTO_INCREMENT,
  `nb_tipoIncidencia` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tipoIncidencia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`INCIDENCIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`INCIDENCIA` (
  `id_incidencia` INT NOT NULL AUTO_INCREMENT,
  `id_producto` INT NOT NULL,
  `id_tipoIncidencia` INT NOT NULL,
  `id_animalesIndiv` INT NULL,
  `id_animalesGrup` INT NULL,
  `id_usuario` INT NOT NULL,
  `control_incidencia` VARCHAR(45) NOT NULL,
  `fecha_incidencia` DATE NOT NULL,
  `hora_incidencia` TIME NOT NULL,
  `precio` FLOAT NOT NULL,
  `descripcion` VARCHAR(300) NOT NULL,
  PRIMARY KEY (`id_incidencia`),
  INDEX `fk_TIPO_INCIDENCIA_id_tipoIncidencia_idx` (`id_tipoIncidencia` ASC),
  INDEX `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv_idx` (`id_animalesIndiv` ASC),
  INDEX `fk_ANIMALES_GRUPALES_id_animalesGrup_idx` (`id_animalesGrup` ASC),
  INDEX `fk_USUARIO_id_usuario_idx` (`id_usuario` ASC),
  UNIQUE INDEX `control_incidencia_UNIQUE` (`control_incidencia` ASC),
  INDEX `fk_PRODUCTO_id_producto_idx` (`id_producto` ASC),
  CONSTRAINT `fk_INCIDENCIA_TIPO_INCIDENCIA1`
    FOREIGN KEY (`id_tipoIncidencia`)
    REFERENCES `sc_cooproince`.`TIPO_INCIDENCIA` (`id_tipoIncidencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_INCIDENCIA_ANIMALES_INDIVIDUALES1`
    FOREIGN KEY (`id_animalesIndiv`)
    REFERENCES `sc_cooproince`.`ANIMALES_INDIVIDUALES` (`id_animalesIndiv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_INCIDENCIA_ANIMALES_GRUPALES1`
    FOREIGN KEY (`id_animalesGrup`)
    REFERENCES `sc_cooproince`.`ANIMALES_GRUPALES` (`id_animalesGrup`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_INCIDENCIA_USUARIO1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `sc_cooproince`.`USUARIO` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_INCIDENCIA_PRODUCTO1`
    FOREIGN KEY (`id_producto`)
    REFERENCES `sc_cooproince`.`PRODUCTO` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`PRODUCTO_ALMACEN`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`PRODUCTO_ALMACEN` (
  `id_ProductoAlmacen` INT NOT NULL AUTO_INCREMENT,
  `id_producto` INT NOT NULL,
  `id_almacen` INT NOT NULL,
  `id_produccion` INT NOT NULL,
  `id_incidencia` INT NOT NULL,
  `operacion` TINYINT(1) NOT NULL,
  `fecha_modificacion` DATE NOT NULL,
  `hora_modificacion` TIME NOT NULL,
  `cantidad` INT(6) NOT NULL,
  `cant_unidades` INT NOT NULL,
  `id_medidas` INT NOT NULL,
  `precio_unidad` FLOAT NOT NULL,
  `total_precio_unidad` FLOAT NOT NULL,
  PRIMARY KEY (`id_ProductoAlmacen`),
  INDEX `fk_PRODUCTO_id_producto_idx` (`id_producto` ASC),
  INDEX `fk_ALMACEN_id_almacen_idx` (`id_almacen` ASC),
  INDEX `fk_PRODUCCION_id_produccion_idx` (`id_produccion` ASC),
  INDEX `fk_INCIDENCIA_id_incidencia_idx` (`id_incidencia` ASC),
  INDEX `fk_PRODUCTO_ALMACEN_MEDIDAS1_idx` (`id_medidas` ASC),
  CONSTRAINT `fk_PRODUCTO_ALMACEN_PRODUCTO1`
    FOREIGN KEY (`id_producto`)
    REFERENCES `sc_cooproince`.`PRODUCTO` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCTO_ALMACEN_ALMACEN1`
    FOREIGN KEY (`id_almacen`)
    REFERENCES `sc_cooproince`.`ALMACEN` (`id_almacen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCTO_ALMACEN_PRODUCCION1`
    FOREIGN KEY (`id_produccion`)
    REFERENCES `sc_cooproince`.`PRODUCCION` (`id_produccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCTO_ALMACEN_INCIDENCIA1`
    FOREIGN KEY (`id_incidencia`)
    REFERENCES `sc_cooproince`.`INCIDENCIA` (`id_incidencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCTO_ALMACEN_MEDIDAS1`
    FOREIGN KEY (`id_medidas`)
    REFERENCES `sc_cooproince`.`MEDIDAS` (`id_medidas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`TIPO_PARENTESCO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`TIPO_PARENTESCO` (
  `id_tipoParentesco` INT NOT NULL AUTO_INCREMENT,
  `nb_tipoParentesco` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tipoParentesco`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`PARENTESCO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`PARENTESCO` (
  `id_parentesco` INT NOT NULL AUTO_INCREMENT,
  `id_animalesIndiv` INT NOT NULL,
  `id_animalesIndiv1` INT NOT NULL,
  `id_tipoParentesco` INT NOT NULL,
  PRIMARY KEY (`id_parentesco`),
  INDEX `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv_idx` (`id_animalesIndiv` ASC),
  INDEX `fk_ANIMALES_INDIVIDUALES_id_animalesIndiv1_idx` (`id_animalesIndiv1` ASC),
  INDEX `fk_TIPO_PARENTESCO_id_tipoParentesco_idx` (`id_tipoParentesco` ASC),
  CONSTRAINT `fk_PARENTESCO_ANIMALES_INDIVIDUALES1`
    FOREIGN KEY (`id_animalesIndiv`)
    REFERENCES `sc_cooproince`.`ANIMALES_INDIVIDUALES` (`id_animalesIndiv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PARENTESCO_ANIMALES_INDIVIDUALES2`
    FOREIGN KEY (`id_animalesIndiv1`)
    REFERENCES `sc_cooproince`.`ANIMALES_INDIVIDUALES` (`id_animalesIndiv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PARENTESCO_TIPO_PARENTESCO1`
    FOREIGN KEY (`id_tipoParentesco`)
    REFERENCES `sc_cooproince`.`TIPO_PARENTESCO` (`id_tipoParentesco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`USUARIO_INCIDENCIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`USUARIO_INCIDENCIA` (
  `id_usuarioIncid` INT NOT NULL AUTO_INCREMENT,
  `id_usuario` INT NOT NULL,
  `id_produccion` INT NULL,
  `id_incidencia` INT NULL,
  `observacion` VARCHAR(300) NULL,
  PRIMARY KEY (`id_usuarioIncid`),
  INDEX `fk_USUARIO_id_usuario_idx` (`id_usuario` ASC),
  INDEX `fk_PRODUCCION_id_produccion_idx` (`id_produccion` ASC),
  INDEX `fk_INCIDENCIA_id_incidencia_idx` (`id_incidencia` ASC),
  CONSTRAINT `fk_USUARIO_INCIDENCIA_USUARIO1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `sc_cooproince`.`USUARIO` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_USUARIO_INCIDENCIA_PRODUCCION1`
    FOREIGN KEY (`id_produccion`)
    REFERENCES `sc_cooproince`.`PRODUCCION` (`id_produccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_USUARIO_INCIDENCIA_INCIDENCIA1`
    FOREIGN KEY (`id_incidencia`)
    REFERENCES `sc_cooproince`.`INCIDENCIA` (`id_incidencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sc_cooproince`.`DETALLE_INCIDENCIA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sc_cooproince`.`DETALLE_INCIDENCIA` (
  `id_detalle_inc` INT NOT NULL,
  `observacion` VARCHAR(45) NULL,
  `peso` FLOAT NULL,
  `altura` FLOAT NULL,
  `id_incidencia` INT NOT NULL,
  PRIMARY KEY (`id_detalle_inc`),
  INDEX `fk_INCIDENCIA_id_incidencia_idx` (`id_incidencia` ASC),
  CONSTRAINT `fk_Detalle_Incidencia_INCIDENCIA1`
    FOREIGN KEY (`id_incidencia`)
    REFERENCES `sc_cooproince`.`INCIDENCIA` (`id_incidencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
