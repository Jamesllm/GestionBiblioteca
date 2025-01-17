/**
 * Author:  Alex
 * Created: 16 ene. 2025
 */

CREATE TABLE login(
    code TEXT PRIMARY KEY NOT NULL DEFAULT (lower(hex(randomblob(16)))),
    userName TEXT,
    email TEXT NOT NULL,
    password TEXT NOT NULL,
);

