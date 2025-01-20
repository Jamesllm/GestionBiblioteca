-- FORMATO
-- Users Table
CREATE TABLE user (
    code TEXT PRIMARY KEY NOT NULL DEFAULT (lower(hex(randomblob(16)))),  
    nameLastName TEXT NOT NULL, 
    dni TEXT NOT NULL,
    email TEXT NOT NULL,
    userName TEXT, 
    password TEXT NOT NULL,
    state INTEGER DEFAULT 1,
    role INTEGER NOT NULL DEFAULT 0
);

-- Tabla prestamo
CREATE TABLE loan (
    id INTEGER PRIMARY KEY NOT NULL,
    start_date TEXT,  -- Use TEXT for date/time in SQLite
    start_time TEXT,
    end_date TEXT,
    end_time TEXT,
    book_code INTEGER, 
    user_code TEXT, 
    state INTEGER DEFAULT 1,
    register_code INTEGER,
    FOREIGN KEY (book_code) REFERENCES book (id),
    FOREIGN KEY (user_code) REFERENCES user (code)
);

-- Tabla usuario-prestamo
CREATE TABLE user_loan (
    user_code TEXT NOT NULL,
    loan_code INTEGER NOT NULL,
    state INTEGER DEFAULT 1,
    FOREIGN KEY (user_code) REFERENCES user (code),
    FOREIGN KEY (loan_code) REFERENCES loan (id)
);


-- Tabla Libro
CREATE TABLE book (
    id INTEGER PRIMARY KEY NOT NULL,
    title TEXT,
    image TEXT,
    pdf TEXT,
    author_id INTEGER,  -- Referencia a autor
    category_id INTEGER,  -- Referencia a categoria
    language_id INTEGER,  -- Referencia a idioma
    state INTEGER DEFAULT 1,
    FOREIGN KEY (author_id) REFERENCES author (id),
    FOREIGN KEY (category_id) REFERENCES category (id),
    FOREIGN KEY (language_id) REFERENCES language (id)
);

-- Tabla categoria
CREATE TABLE category (
    id INTEGER PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    state INTEGER DEFAULT 1
);

-- Tabla idioma
CREATE TABLE language (
    id INTEGER PRIMARY KEY NOT NULL,
    language_name TEXT NOT NULL,
    state INTEGER DEFAULT 1
);

-- Tabla autor
CREATE TABLE author (
    id INTEGER PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    state INTEGER DEFAULT 1
);
