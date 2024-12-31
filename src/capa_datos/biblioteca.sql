USE master;

-- Verificar si la base de datos existe
IF EXISTS (SELECT name FROM sys.databases WHERE name = 'biblioteca')
BEGIN
    -- Desconectar a todos los usuarios de la base de datos para evitar conflictos al eliminarla
    ALTER DATABASE biblioteca SET SINGLE_USER WITH ROLLBACK IMMEDIATE;

    -- Eliminar la base de datos
    DROP DATABASE biblioteca;
END

-- Crear la base de datos con collation en español y UTF-8
IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = 'biblioteca')
BEGIN
    CREATE DATABASE biblioteca
    COLLATE Modern_Spanish_100_CI_AI_SC_UTF8;
END

GO

-- Usar la nueva base de datos
USE biblioteca;
GO

CREATE TABLE usuario (
    codigo VARCHAR(10) PRIMARY KEY NOT NULL DEFAULT CONVERT(VARCHAR(10), NEWID()),  
    nombre VARCHAR(255) NOT NULL, 
    apellidos VARCHAR(255) NOT NULL, 
    dni VARCHAR(28) NOT NULL,
    userName VARCHAR(255) NOT NULL, 
    password VARCHAR(255) NOT NULL,
    estado BIT DEFAULT 1, -- 1 = Activo, 0 = Inactivo
);
 