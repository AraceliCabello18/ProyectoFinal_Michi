create database michi;
use michi;
CREATE TABLE `t_usuario` (
   `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
    `nombre` varchar(245) NOT NULL,
    `apPaterno` varchar(245) NOT NULL,
    `apMaterno` varchar(245) NOT NULL,
    `edad` varchar(245) NOT NULL,
    `genero` varchar(245) NOT NULL,
    `correo` varchar(245) NOT NULL,
    `contrasena` varchar(245) NOT NULL,
    `fechaNacimiento` varchar(245) NOT NULL,
    PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_gatos` (
    `id_gatos` int(11) NOT NULL AUTO_INCREMENT,
    `raza` varchar(245) NOT NULL,
    `descripcion` varchar(245) NOT NULL,
    `caracter` varchar(245) NOT NULL,
    `origen` varchar(245) NOT NULL,
    `tamano` varchar(245) NOT NULL,
    `peso` varchar(245) NOT NULL,
    `esperanzaVida` varchar(245) NOT NULL,
    PRIMARY KEY (`id_gatos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;