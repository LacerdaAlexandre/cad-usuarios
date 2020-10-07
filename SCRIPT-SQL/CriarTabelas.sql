CREATE TABLE public."Usuarios"
(
    id serial,
    nome character(100),
    email character(100),
    PRIMARY KEY (id)
);

ALTER TABLE public."Usuarios"
    OWNER to postgres;
	
	
	
	
	
CREATE TABLE public."Telefones"
(
    id serial,
    id_usuarios integer,
    oddd integer,
    onumero character,
    otipo character,
    PRIMARY KEY (id),
	FOREIGN KEY (id_usuarios) REFERENCES "Usuarios" (id) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER TABLE public."Telefones"
    OWNER to postgres;	
	
