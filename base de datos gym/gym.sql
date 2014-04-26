USE gym;

-- 
-- TABLE: CClases 
--

CREATE TABLE CClases(
    id_clase     INT         NOT NULL AUTO_INCREMENT,
    actividad    VARCHAR(20)    NOT NULL,
    dia          VARCHAR(20)    NOT NULL,
    horario      TIME        NOT NULL,
    d_status       VARCHAR(10)    NOT NULL,
	id_emp       INT         NOT NULL,
	FOREIGN KEY (id_emp) REFERENCES Empleados(id_emp),
    PRIMARY KEY (id_clase)
)ENGINE=MyISAM
;



-- 
-- TABLE: Clases_socios 
--

CREATE TABLE Clases_socios(
    id_socio    INT    NOT NULL,
    id_clase    INT    NOT NULL,
	FOREIGN KEY (id_socio) REFERENCES Socios(id_socio),
	FOREIGN KEY (id_clase) REFERENCES CClases(id_clase),
    PRIMARY KEY (id_socio, id_clase)
)ENGINE=MyISAM
;



-- 
-- TABLE: CMembresias 
--

CREATE TABLE CMembresias(
    id_mem       INT               NOT NULL	AUTO_INCREMENT,
    tipo_mem     VARCHAR(10)          NOT NULL,
    dur_mem      VARCHAR(10)          NOT NULL,
    costo_mem    DECIMAL(15, 3)    NOT NULL,
    PRIMARY KEY (id_mem)
)ENGINE=MyISAM
;



-- 
-- TABLE: Empleados 
--

CREATE TABLE Empleados(
    id_emp      INT         NOT NULL	AUTO_INCREMENT,
    nom_emp     VARCHAR(20)    NOT NULL,
    ap_emp      VARCHAR(20)    NOT NULL,
    am_emp      VARCHAR(20),
    tel_emp     VARCHAR(15)    NOT NULL,
    tipo_emp    VARCHAR(30)    NOT NULL,
    PRIMARY KEY (id_emp)
)ENGINE=MyISAM
;



-- 
-- TABLE: Pago_socio 
--

CREATE TABLE Pago_socio(
    id_pagsocio    INT         NOT NULL	AUTO_INCREMENT,
    fech_pago      DATETIME    NOT NULL,
    id_socio       INT,
    id_mem         INT,
	FOREIGN KEY (id_socio) REFERENCES Socios(id_socio),
	FOREIGN KEY (id_mem) REFERENCES CMembresias(id_mem),
    PRIMARY KEY (id_pagsocio)
)ENGINE=MyISAM
;



-- 
-- TABLE: Socios 
--

CREATE TABLE Socios(
    id_socio      INT         NOT NULL	AUTO_INCREMENT,
    nom_socio     VARCHAR(20)    NOT NULL,
    ap_socio      VARCHAR(20)    NOT NULL,
    am_socio      VARCHAR(20),
    fen_socio     DATE,
    genero        VARCHAR(10)    NOT NULL,
    calle         VARCHAR(30),
    numero        VARCHAR(10),
    colonia       VARCHAR(10),
    cp            VARCHAR(10),
    edo           VARCHAR(10),
    del_mpio      VARCHAR(10),
    tel_socio     VARCHAR(15)    NOT NULL,
    d_status        VARCHAR(10)    NOT NULL,
    fecha_alta    TIMESTAMP    NOT NULL,
    PRIMARY KEY (id_socio)
)ENGINE=MyISAM
;