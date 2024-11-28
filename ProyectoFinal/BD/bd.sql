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

INSERT INTO `t_gatos` (`id_gatos`, `raza`, `descripcion`, `caracter`, `origen`, `tamano`, `peso`, `esperanzaVida`) VALUES
 ('', 'gato bombay', 'Cola gruesa, Orejas grandes, Fuerte, pelo Corto', 'Extrovertido, Afectuoso, Inteligente, Calmado', 'América, Estados Unidos', 'Mediano', '3-5 kg', '12-16 años'),
 ('', 'Gato toyger', 'Cola fina, Orejas pequeñas, Fuerte, pelo Corto', 'Activo, Extrovertido, Afectuoso, Inteligente, Curioso', 'América, Estados Unidos', 'Mediano', '3-5 kg', '10-15 años'),
 ('', 'Gato azul ruso', 'Cola fina, Orejas grandes, Fuerte, Fino. pelo Corto', 'Afectuoso, Inteligente, Curioso, Calmado', 'Asia, Rusia', 'Mediano', '3-5 kg', '10-15 años'),
 ('', 'Gato Siamés', 'Cola fina, Fuerte, Fino, pelo corto', 'Activo, Extrovertido, Afectuoso, Inteligente, Curioso', 'Asia, Tailandia', 'Mediano', '3-5 kg', '15-18 años');