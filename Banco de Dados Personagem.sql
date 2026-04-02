CREATE TABLE personagem (
    id_personagem SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    classe VARCHAR(50),
    raca VARCHAR(50),
    nivel INTEGER,
    forca INTEGER,
    destreza INTEGER,
    constituicao INTEGER,
    inteligencia INTEGER,
    sabedoria INTEGER,
    carisma INTEGER
);